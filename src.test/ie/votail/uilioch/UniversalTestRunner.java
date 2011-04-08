package ie.votail.uilioch;

import ie.votail.model.ElectionConfiguration;
import ie.votail.model.ElectionResult;
import ie.votail.model.ElectoralScenario;
import ie.votail.model.factory.BallotBoxFactory;
import ie.votail.model.factory.ScenarioList;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

import junit.framework.TestCase;

import org.objenesis.Objenesis;
import org.objenesis.ObjenesisStd;
import org.objenesis.instantiator.ObjectInstantiator;

import com.hexmedia.prstv.Candidate;
import com.hexmedia.prstv.Election;
import com.hexmedia.prstv.Surplus;

import coyle_doyle.election.BallotPaper;
import election.tally.Ballot;
import election.tally.BallotCounting;
import election.tally.Constituency;

public class UniversalTestRunner extends TestCase {
  
  public static final int INITIAL_SCOPE = 6;
  public static final String LOG_NAME = "Cross Testing and Validation";
  public static final String SUFFIX = ".txt";
  public static final String TESTDATA_PREFIX = "testdata/BallotBox";
  public static final int GENERAL_ELECTION = 0;
  protected Logger logger;
  protected Objenesis objenesis;
  
  /**
   * Test all scenarios for all known implementations
   */
  public void testScenarios() {
    logger = Logger.getLogger(LOG_NAME);
    objenesis = new ObjenesisStd();
    
    // replay PR-STV scenario list from stored file
    ScenarioList scenarioList;
    final String filename = UniversalTestGenerator.PRSTV_SCENARIO_LIST_FILENAME;
    try {
      
      scenarioList = new ScenarioList(filename);
      
      for (ElectoralScenario scenario : scenarioList) {
        // TODO read Ballot Box test data from pre-generated file of Ballot Boxes
        ElectionConfiguration ballotBox = extractBallotBox(scenario);
        
        ElectionResult votailResult = runVotail(ballotBox, scenario);
        ElectionResult coyleDoyleResult = runCoyleDoyle(ballotBox, scenario);
        ElectionResult hexMediaResult = runHexMedia(ballotBox, scenario);
        
        assert hexMediaResult.equals(coyleDoyleResult);
        assert coyleDoyleResult.equals(votailResult);
        assert votailResult.equals(hexMediaResult);
      }
      
    }
    catch (IOException e) {
      logger.severe("Failed to read scenarios from file " + filename
          + " because " + e.getMessage());
    }
    catch (ClassNotFoundException e) {
      logger.severe("Failed to load scenarios from file " + filename
          + " because " + e.getMessage());
    }
  }
  
  /**
   * Run Votail with test data and match results with expected scenario
   * 
   * @param ballotBox
   *          The test data
   * @param scenario
   *          The expected result
   * @return The actual result
   */
  protected ElectionResult runVotail(ElectionConfiguration ballotBox,
      ElectoralScenario scenario) {
    BallotCounting votail = new BallotCounting();
    ElectionResult result = votail.run(ballotBox.getConstituency(),ballotBox);
    
    if (!scenario.check(votail)) {
      logger.severe("Unexpected results for scenario " + scenario
          + " using predicate " + scenario.toPredicate() + " and ballot box "
          + ballotBox);
    }
    
    return result;
  }
  
  public ElectionConfiguration extractBallotBox(ElectoralScenario scenario) {
    BallotBoxFactory factory = new BallotBoxFactory();
    return factory.extractBallots(scenario, INITIAL_SCOPE);
  }
  
  /**
   * Run the Coyle-Doyle election algorithm.
   * 
   * @param ballotBox The set of test data
   * @param scenario The expected result
   * @return The actual result
   */
  public ElectionResult runCoyleDoyle(ElectionConfiguration ballotBox,
      ElectoralScenario scenario) {
    
    ElectionResult result;
    Constituency constituency = ballotBox.getConstituency();
    int numberOfCandidates = scenario.getNumberOfCandidates();
    String[] candidates = new String[numberOfCandidates];
    
    for (int i = 0; i < numberOfCandidates; i++) {
      candidates[i] = "" + constituency.getCandidate(i).getCandidateID();
    }
    
    int numberOfSeats = scenario.numberOfWinners();
    int electionType = GENERAL_ELECTION;
    
    int[] outcome;
      coyle_doyle.election.Election election =
          new coyle_doyle.election.Election(candidates, numberOfSeats,
              electionType);
      
      List<BallotPaper> ballotPapers =
          convertBallotsIntoCoyleDoyleFormat(ballotBox);
      logger.info(ballotPapers.toString());
      
      outcome = election.election(ballotPapers);
      
      result = new ElectionResult(outcome, numberOfSeats);
    
    // TODO check actual results against expected scenario
    
    return result;
  }
  
  /**
   * Convert ballot box test data into a format readable by the
   * Coyle-Doyle election algorithm.
   * 
   * @param ballotBox
   *          The test data in Votail format.
   * @return The test data in Coyle-Doyle format.
   */
  protected List<BallotPaper> convertBallotsIntoCoyleDoyleFormat(
      ElectionConfiguration ballotBox) {
    
    List<BallotPaper> votes = new ArrayList<BallotPaper>();
    
    int voteNumber = 0;
    while (ballotBox.isNextBallot()) {
      Ballot ballot = ballotBox.getNextBallot();
      int numberOfPreferences = ballot.remainingPreferences();
      int[] preferences = new int[numberOfPreferences];
      for (int i = 0; i < numberOfPreferences; i++) {
        preferences[i] = ballot.getNextPreference(i);
      }
      BallotPaper bp = new BallotPaper(voteNumber, preferences);
      votes.add(bp);
      voteNumber++;
      logger.info(bp.toString());
    }
    
    return votes;
  }
  
  /**
   * Test the HexMedia algorithm for PR-STV
   * 
   * @param ballotBox
   *          Test data in Votail format
   * @param scenario
   *          Expected results
   * @return Actual results
   */
  public ElectionResult runHexMedia(ElectionConfiguration ballotBox,
      ElectoralScenario scenario) {
    
    String ballotBox_filename = convertBallotsToHexMediaFormat(ballotBox);
    
    int numberOfSeats =
        ballotBox.getConstituency().getNumberOfSeatsInThisElection();
    
    ObjectInstantiator electionInstantiator = 
      objenesis.getInstantiatorOf(com.hexmedia.prstv.Election.class);
    
    com.hexmedia.prstv.Election election =
        (Election) electionInstantiator.newInstance();
    
    setNumberOfSeats(numberOfSeats, election);
    setFilename(ballotBox_filename, election);
   
    initialise(election);
    com.hexmedia.prstv.Display.setElection(election);
    com.hexmedia.prstv.Display.enableNextButton();
    election.runCount();
    
    String results_filename = "results.html";
    ElectionResult electionResult = new ElectionResult(results_filename);
    
    return electionResult;
  }

  /**
   * Initialise a HexMedia election object
   * 
   * @param election
   */
  protected void initialise(com.hexmedia.prstv.Election election) {
    try {
      Class<?> parameterTypes = null;

      Method initialiseElection = election.getClass().getDeclaredMethod("initialise", parameterTypes);
      initialiseElection.setAccessible(true);
      initialiseElection.invoke(election, (Object[]) null);
    }
    catch (SecurityException e) {
      logger.severe(e.getLocalizedMessage());
    }
    catch (IllegalArgumentException e) {
      logger.severe(e.getLocalizedMessage());
    }
    catch (NoSuchMethodException e) {
      logger.severe(e.getLocalizedMessage());
    }
    catch (IllegalAccessException e) {
      logger.severe(e.getLocalizedMessage());
    }
    catch (InvocationTargetException e) {
      logger.severe(e.getLocalizedMessage());
    }
  }

  /**
   * Construct the Hexmedia Election object through reflection
   * 
   * @param numberOfSeats The number of seats
   * @param election The election object to be constructed
   */
  protected void setNumberOfSeats(int numberOfSeats,
      com.hexmedia.prstv.Election election) {
    final Class<? extends Election> electionClass = election.getClass();
    
    try {
      Field nseats = electionClass.getDeclaredField("nseats");
      Field elected = electionClass.getDeclaredField("elected");
      Field eliminated = electionClass.getDeclaredField("eliminated");
      Field surpluses = electionClass.getDeclaredField("surpluses");
      
      nseats.setAccessible(true);
      nseats.setInt(election, numberOfSeats);
      
      elected.setAccessible(true);
      eliminated.setAccessible(true);
      surpluses.setAccessible(true);
      
      elected.set(election, new LinkedList<Candidate>());
      eliminated.set(election, new LinkedList<Candidate>());
      surpluses.set(election, new LinkedList<Surplus>());
    }
    catch (IllegalArgumentException e) {
      logger.severe(e.getLocalizedMessage());
    }
    catch (IllegalAccessException e) {
      logger.severe(e.getLocalizedMessage());
    }
    catch (SecurityException e) {
      logger.severe(e.getLocalizedMessage());
    }
    catch (NoSuchFieldException e) {
      logger.severe(e.getLocalizedMessage());
    }
  }

  /**
   * @param ballotBox_filename
   * @param election
   */
  protected void setFilename(String ballotBox_filename,
      com.hexmedia.prstv.Election election) {
    try {
      Field filename;
      filename = election.getClass().getDeclaredField("file");
      filename.setAccessible(true);
      filename.set(election, ballotBox_filename);
    }
    catch (SecurityException e) {
      logger.severe(e.getLocalizedMessage());
    }
    catch (NoSuchFieldException e) {
      logger.severe(e.getLocalizedMessage());
    }
    catch (IllegalArgumentException e) {
      logger.severe(e.getLocalizedMessage());
    }
    catch (IllegalAccessException e) {
      logger.severe(e.getLocalizedMessage());
    }
  }
  
  /**
   * Convert test ballot box into hexmedia format.
   * 
   * @param ballotBox The test data representing a ballot box
   * @return The name of the file into which testdata was written
   */
  protected String convertBallotsToHexMediaFormat(
      ElectionConfiguration ballotBox) {
    
    String filename = TESTDATA_PREFIX + ballotBox.hashCode() +  
      System.currentTimeMillis() + SUFFIX;
    
    FileWriter fileWriter;
    BufferedWriter writer;
    try {
      fileWriter = new FileWriter(filename);
      writer = new BufferedWriter(fileWriter);
      
      Constituency candidateList = ballotBox.getConstituency();
      int numberOfCandidates = candidateList.getNumberOfCandidates();
      
      writer.append("\"Mixed Vote No.\"");
      for (int c = 0; c < numberOfCandidates; c++) {
        election.tally.Candidate candidate = candidateList.getCandidate(c);
        writer.append(";\"" + candidate.getCandidateID() + "\"");
        
      }
      
      int index = 1;
      while (ballotBox.isNextBallot()) {
        Ballot ballot = ballotBox.getNextBallot();
        writer.append("\"" + index + "\"");
        
        for (int i = 0; i < numberOfCandidates; i++) {
          election.tally.Candidate candidate = candidateList.getCandidate(i);
          int candidateID = candidate.getCandidateID();
          
          if (!ballot.isApproved(candidateID)) {
            writer.append(";\"" + " " + "\"");
          }
          else {
            writer.append(";\"" + Integer.toString(ballot.getRank(candidateID))
                + "\"");
          }
        }
        index++;
      }
      writer.flush();
      writer.close();
    }
    catch (IOException e) {
      logger.severe("Unable to create CSV file because "
          + e.getLocalizedMessage());
      
    }
    
    return filename;
  }
  
  public static void main(String[] args) {
    UniversalTestRunner uilioch = new UniversalTestRunner();
    uilioch.testScenarios();
  }
}
