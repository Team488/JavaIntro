package review2_booleanLogic;

public class BooleanIf
{
    /**
     * DIFFICULTY: 1
     * 
     * Determines whether the given value is greater than the specified threshold.
     * 
     * @param value The value to compare
     * @param threshold The threshold to use in the comparison
     * @return True if the value is greater than the threshold, false otherwise.
     */
    public static boolean isGreaterThan(int value, int threshold) {
        return false;
    }
    
    /**
     * DIFFICULTY: 1
     * 
     * Determines whether you should sleep in on this day.
     * You should sleep in on any day that is not a weekday or is on a vacation day.
     * 
     * @param isWeekday Specifies whether the current day is a weekday.
     * @param isVacationSpecifies whether the current day is a vacation day.
     * @return A boolean indicating whether you should sleep in.
     */
    public static boolean shouldSleepIn(boolean isWeekday, boolean isVacation) {
        return false;
    }
    
    /**
     * DIFFICULTY: 2
     * 
     * Constrains a double to be within the given bounds. If the given number is
     * greater than max, it will be constrained to max, and likewise with min.
     * 
     * @param value The value to constrain
     * @param min The minimum bound
     * @param max The maximum bound
     * @return The given value, constrained to be within the specified bounds.
     */
    public static double constrain(double value, double min, double max) {
        return 0;
    }
    
    /**
     * DIFFICULTY: 3
     * 
     * Determines whether the given number is a "lucky" number. A number is
     * considered "lucky" when all digits in the number are equal,
     * e.g. 333 or 888. This method only has to work for three-digit numbers.
     * 
     * HINT: Any number modulo 10 is the least significant digit in the number
     * HINT: You can shift an integer (e.g. 123 -> 12) by dividing it by 10,
     * because 123/10 = 12.3, and 12.3 as an int is just 12.
     * 
     * @param number The number to check.
     * @return A value indicating whether the given number is "lucky".
     */
    public static boolean isLucky(int number) {
        return false;
    }
}
