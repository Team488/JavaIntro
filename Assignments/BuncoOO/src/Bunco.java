
import java.util.Random;

public class Bunco {

	public static final int numPlayersMax = 10;

	private static int TestScoreRoll(int round, int die1, int die2, int die3) {

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
		return rollscore;
	}
	
	public static void printLiveTests() {	    
        DiceSet testDice = new DiceSet(3);
        testDice.roll();
        System.out.println("Answer should be 4 3 3");
        testDice.roll();
        System.out.println("Answer should be 6 5 3");
        
        Player Tom = new Player("Tom");
        int score = -1;
        int testscore;
        int errors = 0;
        
        for (int round = 1; round < 7; round++){  
            for (int die1 = 1; die1 < 7; die1++){
                for (int die2 = 1; die2 < 7; die2++){
                    for (int die3 = 1; die3 < 7; die3++){
                        score = Tom.scoreRoll(round, die1, die2, die3);
                        testscore = TestScoreRoll(round, die1, die2, die3); 
                        if (score != testscore){
                            System.out.println("error encountered Round, D1, D2, D3 >> R" + round + ", " + die1 +
                                    ", " + die2 + ", " + die3);
                            System.out.println(" Score = " + score + " should be = " + testscore);  
                            errors++;
                        }                       
                    }
                }
            }           
        }
        System.out.println("Completed Score test; Error count = " + errors);
	}
	
	public static void main(String[] args) {
		int numPlayers = Tools.promptForInt("How many players? ", 1, numPlayersMax);
		
		Game game = new Game(numPlayers);
		game.loadPlayers();
		game.runGame();
	}
}
