package review3_loops;

public class Loops
{
    /**
     * DIFFICULTY: 2
     * 
     * Computes the factorial of the given integer.
     * 
     * The factorial of number n is the product of all positive integers less
     * than or equal to n. If the given number is 0,  the factorial is 1.
     * 
     * @param number The integer to start with while calculating the factorial.
     * @return The factorial of the given number.
     */
    public static int factorial(int number) {
        return 0;
    }
    
    /**
     * DIFFICULTY: 2
     * 
     * Returns a new string that consists of every other letter in the input
     * string.
     * 
     * Examples:
     *   "foo" -> "fo"
     *   "bar" -> "br"
     *   "hello" -> "hlo"
     *   "hi" -> "h"
     *   "" -> ""
     * 
     * HINT: Use String.substring()
     * 
     * @param string The string to use.
     * @return A string that consists of every other letter from the input.
     */
    public static String alternate(String string) {
        return "";
    }
    
    /**
     * DIFFICULTY: 3
     * 
     * Finds the number of steps required to get from the given starting number
     * to 1, following the rules of the Collatz sequence. The starting number is
     * counted in the total number of steps.
     * 
     * The Collatz sequence:
     * Take any natural number n.
     *   - If n is even, divide it by 2 to get n / 2. 
     *   - If n is odd, multiply it by 3 and add 1 to get 3n + 1. 
     *   - Repeat the process until n is 1.
     * 
     * NOTE: If you need inspiration to become a programmer: http://xkcd.com/710/.
     * 
     * @param startNumber
     * @return
     */
    public static int findCollatzLength(int startNumber) {
        return 0;
    }

    /**
     * DIFFICULTY: 4
     * 
     * Returns the index of the first triple, or -1 if no triples are found.
     * A triple is a sequence of three of the same number. A triple's index is
     * the index of the first number in the triple.
     * 
     * Examples:
     *   - {1, 2, 2, 2} -> 1
     *   - {1, 2, 3, 2, 2, 2} -> 3
     *   = {1, 2, 3, 1, 2, 3, 1, 2, 3} -> -1
     * 
     * @param numbers The arrays of numbers to search in.
     * @return The index of the first triple.
     */
    public static int findTriple(int[] numbers) {
        return -1;
    }
}
