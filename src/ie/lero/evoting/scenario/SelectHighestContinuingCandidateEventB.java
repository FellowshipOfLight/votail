/**
 * 
 */
package ie.lero.evoting.scenario;

import junit.framework.TestCase;
import election.tally.Ballot;
import election.tally.BallotBox;
import election.tally.BallotCounting;
import election.tally.Constituency;


/**
 * @author Dermot Cochran
 *
 */
public class SelectHighestContinuingCandidateEventB extends TestCase {
  
    private static final int candidateToWin = 0;
    private BallotCounting ballotCounting;
    private static final int NUM_CANDIDATES = 2;

    protected void setUp() throws Exception {
    super.setUp();
    final BallotBox ballotBox = new BallotBox();
    ballotCounting = new BallotCounting();
    final Constituency parameters = new Constituency();
    parameters.setNumberOfSeats(1,3);
    parameters.setNumberOfCandidates(NUM_CANDIDATES);
    ballotCounting.setup(parameters);
    // All candidates get one vote; draw lots to resolve ties
    final Ballot mockBallot = new Ballot();
    for (int i=0; i < NUM_CANDIDATES; i++) {
      mockBallot.setFirstPreference(
        parameters.getCandidate(i).getCandidateID());
      ballotBox.accept(mockBallot);
    }
    ballotCounting.load(ballotBox);
  }

  /**
	 * Test selection of highest continuing candidate
	 */
	public void testEvent() {
    ballotCounting.startCounting();
    final int winner = ballotCounting.findHighestCandidate();
    assertTrue(winner == candidateToWin);
    final int countState = ballotCounting.countStatus.getState();
    assertTrue(ballotCounting.countStatus.isPossibleState(countState));
    // Test election without surplus
    assertTrue(ballotCounting.getTotalSumOfSurpluses() == 0);
  }

 	

 	

}
