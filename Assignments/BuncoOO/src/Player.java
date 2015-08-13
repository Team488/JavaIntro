public class Player {

	private int[] roundScores = new int[7]; // [0] is not used
	private String name;

	private DiceSet gameDice = new DiceSet(3);

	public Player(String playerName) { // constructor to initialize name
		name = playerName;
	}

	public int scoreRoll(int round, int die1, int die2, int die3) {

		int rollscore = 0;
		if (die1 == round && die2 == round && die3 == round) {
			// Bunco roll
			rollscore = 21;
		} else if (die1 == die2 && die2 == die3) {
			// Dice are all equal but not a bunco
			rollscore = 5;
		} else {
			if (die1 == round)
				rollscore = 1;
			if (die2 == round)
				rollscore += 1;
			if (die3 == round)
				rollscore += 1;
		}
		roundScores[round] += rollscore;
		System.out.println("Score = " + rollscore);
		return rollscore;
	}

	public int takeTurn(int round) {

		int rollscore = 0;

		do {
			int[] rollResults = gameDice.roll();
			rollscore = scoreRoll(round, rollResults[0], rollResults[1], rollResults[2]);
		} while (rollscore > 0 && roundScores[round] < 21);
		
        System.out.println("[Round " + round + "] " + this.name + " scored " + this.roundScores[round]);
        
		return roundScores[round];  // returning total score for this round at this roll
	}
	
	public int getScore(int round) {
	    return roundScores[round];
	}
	
	public int getTotal() {
	    int total = 0;
	    for(int round = 1; round < 7; round++)
	        total += roundScores[round];
	    
	    return total;
	}
	
	public String getName() {
	    return name;
	}
}
