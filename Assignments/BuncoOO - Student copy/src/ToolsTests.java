import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ToolsTests
{
    private static final int[] seededFirstRoll = {4, 3, 3};
    private static final int[] seededSecondRoll = {6, 5, 3};
    
    @Before
    public void setUp() throws Exception
    {
        Tools.resetRandom(123456789);
    }

    @Test
    public void testDiceRoll() {
        DiceSet testDice = new DiceSet(3);
        int[] firstRoll = testDice.roll();
        int[] secondRoll = testDice.roll();

        assertArrayEquals("The first roll, when given this set of test random numbers", seededFirstRoll, firstRoll);
        assertArrayEquals("The second roll, when given this set of test random numbers", seededSecondRoll, secondRoll);
    }
    
    @Test
    public void testDiceGetters() {
        DiceSet testDice = new DiceSet(3);
        int[] firstRoll = testDice.roll();
        
        assertNotNull("The roll method should return a non-null value", firstRoll);
        assertEquals("The roll result should return 3 values (for 3 dice)", 3, firstRoll.length);
        
        assertArrayEquals("The getter should return the same thing as the result of the roll", firstRoll, testDice.getCurrentRoll());
        assertEquals("The individual number getter should return a specific roll value", firstRoll[0], testDice.getCurrentRollValue(0));
    }
}
