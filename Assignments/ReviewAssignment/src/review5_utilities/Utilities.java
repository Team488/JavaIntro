package review5_utilities;

import java.util.Random;

public class Utilities
{
    private static Random random = new Random(12345);
    
    /**
     * DIFFICULTY: 3
     * 
     * Returns a random integer between min and max, inclusive.
     * 
     * WARNING: You must use the randDouble method to make this work correctly.
     * 
     * @param max The maximum bound of the range.
     * @param min The minimum bound of the range
     * @return A random integer in the given range
     */
    public static int randInt(int max, int min) {
        return 0;
    }
    
    /**
     * Returns a random double 0 <= n < 1
     * @return The random value
     * 
     * NOTE: You don't have to implement this method. It has already been filled
     * in for you.
     */
    public double randDouble() {
        return random.nextDouble();
    }
}
