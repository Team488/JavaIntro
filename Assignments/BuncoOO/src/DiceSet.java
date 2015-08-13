import java.util.Arrays;

public class DiceSet {
    private int numDice;
    private int[] previousRoll = new int[0];
    
    public DiceSet(int numDice) {
        this.numDice = numDice;
    }
    
	public int[] roll() {
	    previousRoll = new int[this.numDice];
	    for(int die = 0; die < numDice; die++) {
		    previousRoll[die] = Tools.randInt(1, 6);
	    }
	    
		System.out.println("New roll: " + Arrays.toString(previousRoll));
		
		return previousRoll;
	}
	
	public int[] getPreviousRoll() {
	    return previousRoll;
	}
	
	public int getPreviousRollValue(int diceIndex) {
	    return previousRoll[diceIndex];
	}
}
