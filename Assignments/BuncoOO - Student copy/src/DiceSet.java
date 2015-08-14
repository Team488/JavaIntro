import java.util.Arrays;

public class DiceSet {
    private int numDice;
    
    // Stores the current roll values.
    // Each index corresponds to one die.
    private int[] currentRoll = new int[0];
    
    public DiceSet(int numberOfDice) {
        // TODO: Implement
        /* Expected actions:
         *   - Set the class's numDice variable to the value of the passed constructor argument
         *   - (Optional - depends on next implementation) Initialize currentRoll to hold the number of dice specified
         */
    }
    
	public int[] roll() {
	    // TODO: Implement
	    /* Expected actions:
	     *   - Reset the `currentRoll` variable (make everything in it 0)
	     *     - HINT: There are two ways to do this; one of them will let you skip the second item in the constructor
	     *   - Set every index in the `currentRoll`s to a random number between 1 and 6
	     */
	    
		System.out.println("New roll: " + Arrays.toString(currentRoll));
		
		return currentRoll;
	}
	
	public int[] getCurrentRoll() {
	    // TODO: Implement
	    /* Expected actions:
	     *   - Return the values of the current roll
	     */
	    return null;
	}
	
	public int getCurrentRollValue(int diceIndex) {
        // TODO: Implement
        /* Expected actions:
         *   - Return the value of the current roll for the given dice index
         */
        return -1;
	}
}
