package election.tally.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import election.tally.BallotBox;

public class BallotBoxTest {
  @Test
  public void testBallotBox_toString() {
    int [] preferences = {1,2,3};
    BallotBox box = new BallotBox();
    box.accept(preferences);
    Assert.assertEquals(box.toString(),"(1 2 3)");
    box.accept(preferences);
    Assert.assertEquals(box.toString(),"(1 2 3)(1 2 3)");
  }
}