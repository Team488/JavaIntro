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

        assertArrayEquals("The first roll, when given this set of test random numbers.", seededFirstRoll, firstRoll);
        assertArrayEquals("The second roll, when given this set of test random numbers.", seededSecondRoll, secondRoll);
    }
}
