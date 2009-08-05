package ie.lero.evoting.scenario;

import junit.framework.TestCase;
import election.tally.Ballot;
import election.tally.BallotBox;
import election.tally.BallotCounting;
import election.tally.Candidate;
import election.tally.CandidateStatus;
import election.tally.Election;
import election.tally.mock.MockBallot;

/**
 * @author <a href="http://kind.ucd.ie/documents/research/lgsse/evoting.html">
 * Dermot Cochran</a>
 */
public class SurplusCalculationEventC extends TestCase{
	
  BallotCounting ballotCounting;
  Election parameters;
  BallotBox ballotBox;

	/**
	 * Create the scenario data needed
	 */
	protected void setUp() {
		ballotCounting = new BallotCounting();
		ballotBox = new BallotBox();
		parameters = new Election();
		parameters.totalNumberOfSeats = 2;
		parameters.numberOfSeatsInThisElection = parameters.totalNumberOfSeats;
		parameters.numberOfCandidates = 3;
		
		// Generate sample candidates
	 	Candidate[] candidates = new Candidate[parameters.numberOfCandidates];
	 	int[] candidateIDList = new int[parameters.numberOfCandidates];
	 	
		for (int i = 0; i < parameters.numberOfCandidates; i++) {
			candidates[i] = new Candidate();
  			candidateIDList[i] = candidates[i].getCandidateID();
  			assertTrue (candidates[i].getStatus() == CandidateStatus.CONTINUING);
  			assertTrue (candidates[i].getTotalAtCount(0) == 0);
		}

		final int numberOfVotes = 10000;
				
		assertTrue (numberOfVotes <= Ballot.MAX_BALLOTS);
		assertTrue (ballotBox.size() == 0);
		for (int b = 0; b < numberOfVotes; b++) {
				MockBallot testBallot = new MockBallot();
				testBallot.setMultiplePreferences(candidateIDList);
				ballotBox.accept(testBallot);
			    assertTrue (0 < testBallot.getBallotID());
		}
	 	parameters.setCandidateList(candidates);
	}
	 
	/**
	 * Test the distribution of surplus ballots.
	 */
	public void testDistributionOfSurplus() {
	 
	 	ballotCounting.setup(parameters);
	 	ballotCounting.load(ballotBox);
 	 	assertTrue (3334 == ballotCounting.getQuota());
	 	
	 	// Find and distribute the first surplus
	 	final int indexOfHighestCandidate = 
	 		ballotCounting.findHighestCandidate();
	 	assertTrue (0 <= indexOfHighestCandidate);
	 	
	 	ballotCounting.startCounting();
	 	int countState = ballotCounting.countStatus.getState();
	 	assertTrue (ballotCounting.countStatus.isPossibleState(countState));
	 	
 		ballotCounting.electCandidate(indexOfHighestCandidate);
 		
  	    countState = ballotCounting.countStatus.getState();
        assertTrue (ballotCounting.countStatus.isPossibleState(countState));
    
 	 	ballotCounting.distributeSurplus(indexOfHighestCandidate);
 	    countState = ballotCounting.countStatus.getState();
        assertTrue (ballotCounting.countStatus.isPossibleState(countState));
 	 	
 	 	ballotCounting.count();
 	    countState = ballotCounting.countStatus.getState();
        assertTrue (ballotCounting.countStatus.isPossibleState(countState));
	}
}
