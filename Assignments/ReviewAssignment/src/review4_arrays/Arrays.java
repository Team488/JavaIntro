package review4_arrays;

public class Arrays
{
    /**
     * DIFFICULTY: 1
     * 
     * Returns a new array of the given length, with all cells initialized to
     * the given initialValue.
     * 
     * @param initialValue The value to initialize all indexes in the array to.
     * @param length The length of the new array.
     * @return The new array
     */
    public static int[] fillNewArray(int initialValue, int length) {
        return new int[0];
    }
    
    /**
     * DIFFICULTY: 2
     * 
     * Returns the index of the first instance of `target` in the given array,
     * or "-1" if `array` doesn't contain `target`.
     * 
     * @param array The array to search
     * @param target The value to search for
     * @return The index of target's value in `array`.
     */
    public static int findInt(int[] array, int target) {
        return -1;
    }
    
    /**
     * DIFFICULTY: 2
     * 
     * Returns the largest number in the array. If the array is empty, returns 0.
     * 
     * @param array The array to search.
     * @return The largest number in the array.
     */
    public static int findLargestNumber(int[] array) {
        return 0;
    }
    
    /**
     * DIFFICULTY: 2
     * 
     * Returns the index in the array of the largest number, or -1 if the array
     * is empty.
     * 
     * HINT: You can utilize the previous two methods to make this work without
     * more than one line of code.
     * 
     * @param array The array to search.
     * @return The index of the largest number in the array.
     */
    public static int findIndexOfLargestNumber(int[] array) {
        return -1;
    }
    
    /**
     * DIFFICULTY: 2
     * 
     * Returns a new 2D array of the given dimensions, with all cells
     * initialized to the given initialValue.
     * 
     * The resultant array should be an array of dimensions
     * arr[d1Length][d2Length].
     * 
     * HINT: You can utilize your fillNewArray method to make this easier.
     * 
     * @param initialValue The value to initialize all indexes in the array to.
     * @param d1Length The size of the first dimension of the array.
     * @param d2Length The size of the second dimension of the array.
     * @return The new array
     */
    public static int[][] fillNew2dArray(int initialValue, int d1Length, int d2Length) {
        return new int[0][0];
    }
    
    /**
     * DIFFICULTY: 3
     * 
     * Returns the largest number in the 2D array. If there are no values in the
     * array, returns 0.
     * 
     * HINT: You can utilize your findLargestNumber method to make this easier.
     * 
     * @param array The array to search
     * @return The largest value in the 2D array.
     */
    public static int findLargest2dNumber(int[][] array) {
        return 0;
    }
    
    /**
     * DIFFICULTY: 3
     * 
     * Computes the specified number of steps in the Collatz sequence, using the
     * specified number as the starting point. The starting number should be
     * included in both the number of steps and the result array.
     * 
     * NOTE: If you haven't yet done the Collatz problem in the "review3_loops"
     * section, you should do that now before starting this one.
     * NOTE: This method does not have to handle a `numSteps` that is less than
     * 1.
     * 
     * 
     * Examples:
     *   - partialCollatz(5, 4) -> {5, 16, 8, 4}
     *   - partialCollatz(11, 8) -> {11, 34, 17, 52, 26, 13, 40, 20}
     *   - partialCollatz(27, 7) -> {27, 82, 41, 124, 62, 31, 94}
     * 
     * @param startNumber The number to start at
     * @param numSteps The number of steps to calculate
     * @return The part of the Collatz sequence that was computed.
     */
    public static int[] partialCollatz(int startNumber, int numSteps) {
        return new int[0];
    }

    /**
     * DIFFICULTY: 3 
     * 
     * Finds the specified number of "lucky numbers", ordered sequentially
     * starting from 111. A number is considered "lucky" when all digits in the
     * number are equal, e.g. 333 or 888.
     * 
     * You must calculate the numbers mathematically, utilizing the equation
     * "x * 37 = y", where x is a multiple of 3 and y is the resultant "lucky"
     * number. Here are some examples of the pattern:
     *   - 3 * 37 = 111
     *   - 6 * 37 = 222
     *   - 9 * 37 = 333
     * 
     * Example calls and results:
     *   2 -> {111, 222}
     *   5 -> {111, 222, 333, 444, 555}
     * 
     * @param numNumbers The number of numbers to return
     * @return An array with the calculated numbers
     */
    public static int[] findLuckyNumbers(int numNumbers) {
        return new int[0];
    }

}
