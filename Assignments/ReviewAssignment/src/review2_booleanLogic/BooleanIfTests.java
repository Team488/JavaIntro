package review2_booleanLogic;

import static org.junit.Assert.*;

import org.junit.Test;

public class BooleanIfTests
{
    private final double floatPrecision = 0.0000001; 
    
    @Test
    public void testIsGreaterThan() {
        assertTrue("5 is greater than 3", BooleanIf.isGreaterThan(5, 2));
        assertFalse("5 is not greater than 5", BooleanIf.isGreaterThan(5, 5));
        assertFalse("5 is not greater than 8", BooleanIf.isGreaterThan(5, 8));
    }
    
    @Test
    public void testSleepIn()
    {
        assertTrue("You should sleep in on a weekend while not on vacation.", BooleanIf.shouldSleepIn(false, false));
        assertFalse("You should not sleep in on a weekday while not on vacation.", BooleanIf.shouldSleepIn(true, false));
        assertTrue("You should sleep in on a weekend while on vacation.", BooleanIf.shouldSleepIn(false, true));
        assertTrue("You should sleep in on a weekday while on vacation", BooleanIf.shouldSleepIn(true, true));
    }

    @Test
    public void testConstrain() {
        assertEquals("Numbers should be returned unmodified if they are within the given bounds.", 15d, BooleanIf.constrain(15, 10, 20), floatPrecision);
        assertEquals("Min boundary should be returned if the given value is below it.", 10d, BooleanIf.constrain(5, 10, 20), floatPrecision);
        assertEquals("Max boundary should be returned if the given value is above it.", 20d, BooleanIf.constrain(25, 10, 20), floatPrecision);
    }
    
    @Test
    public void testIsLucky() {
        assertTrue("111 is a lucky number.", BooleanIf.isLucky(111));
        assertTrue("666 is a lucky number.", BooleanIf.isLucky(666));
        assertTrue("999 is a lucky number.", BooleanIf.isLucky(999));
    }
    
}
