public class Player {

    // Stores the scores for the current round, such that roundScores[1] is the first round
	private int[] roundScores = new int[7]; // [0] is not used
	// Stores the name of the player
	private String name;

	private DiceSet gameDice = new DiceSet(3);

	public Player(String playerName) { // constructor to initialize name
		name = playerName;
	}

	public int scoreRoll(int round, int die1, int die2, int die3) {
	    
		int rollscore = 0;
        // TODO: Implement
	    /* Expected actions: 
	     *   - Calculate a score for the new roll (using round, die1, die2, and die3)
	     *     - If all three dice rolled the round number, the score is 21
	     *     - If all dice rolled the same number, the score is 5
	     *     - Otherwise, one point for every die that matches the round number
	     *   - Add it to the current score for this round
	     */
	    
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
	    // TODO: Implement
	    /* Expected actions:
	     *   - Return the current score for the specified round
	     */
	    return -1;
	}
	
	public int getTotal() {
	    int total = 0;
        // TODO: Implement
	    /* Expected actions:
	     *   - Sum the scores of each round, putting the result into `total`
	     */
	    
	    return total;
	}
	
	public String getName() {
	    // TODO: Implement
	    /* Expected actions:
	     *   - Return the name of the current player
	     */
	    return "Unimplemented";
	}
}
