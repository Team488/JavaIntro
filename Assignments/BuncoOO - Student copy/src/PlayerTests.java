import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PlayerTests
{
    private Player testPlayer = new Player("Tester");

    @Test
    public void testRollBunco()
    {
        testPlayer.scoreRoll(1, 1, 1, 1);
        assertEquals("Rolling 3 of the round number should score a bunco (21 points).", 21, testPlayer.getScore(1));
    }

    @Test
    public void testRollAllSame()
    {
        testPlayer.scoreRoll(1, 3, 3, 3);
        assertEquals("Rolling 3 of the same that are not equal to the current round number should score 5 points.", 5, testPlayer.getScore(1));
    }

    @Test
    public void testRollSingleFirst()
    {
        testPlayer.scoreRoll(1, 1, 2, 2);
        assertEquals("Rolling only one of the round number should score one point (first die).", 1, testPlayer.getScore(1));
    }

    @Test
    public void testRollSingleSecond()
    {
        testPlayer.scoreRoll(1, 2, 1, 2);
        assertEquals("Rolling only one of the round number should score one point (second die).", 1, testPlayer.getScore(1));
    }

    @Test
    public void testRollSingleThird()
    {
        testPlayer.scoreRoll(1, 2, 2, 1);
        assertEquals("Rolling only one of the round number should score one point (third die).",1, testPlayer.getScore(1));
    }

    @Test
    public void testRollSum()
    {
        testPlayer.scoreRoll(1, 1, 1, 1);
        testPlayer.scoreRoll(1, 2, 2, 2);
        assertEquals("Taking multiple rolls in the same round should give a cumulative score.", 26, testPlayer.getScore(1));
    }

    @Test
    public void testRoundTotal()
    {
        testPlayer.scoreRoll(1, 1, 1, 1);
        testPlayer.scoreRoll(1, 2, 2, 2);

        testPlayer.scoreRoll(2, 4, 4, 4);
        testPlayer.scoreRoll(2, 2, 3, 2);
        
        assertEquals("The getTotal method should return the sum of all round scores.", 33, testPlayer.getTotal());
    }
}
