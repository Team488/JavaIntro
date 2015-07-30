import java.util.Scanner;
import java.util.Random;

public class Bunco {

	public static final int NumPlayersMax = 10;
	public static int NumPlayers = 0;
	public static int[][] Scores = new int[NumPlayersMax][7]; //waste one column
	public static Scanner inputx = new Scanner(System.in);
	public static int[] DiceRoll = new int[3];
	public static Random generator = new Random(123456789);  // always gives same sequence
	//public static Random generator = new Random();  // random every time

	static String GetStr(String msg) {
		
		System.out.print(msg);
		String ReturnStr = inputx.nextLine();
		return ReturnStr;
	}
	
	static int GetInt(String msg, int min, int max) {

		int value = 0;

		System.out.print(msg);
		try {
			value = Integer.parseInt(inputx.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Illegal integer input; Please try again.");
			System.out.print("? ");
			value = GetInt(msg, min, max);
		}
		if (value < min || value > max) {
			System.out.print("Illegal value; ");
			value = GetInt(msg, min, max);
		}
		return value;
	}

	private static int RandInt(int Min, int Max) {
		double random = generator.nextDouble(); // 0.0 <= random < 1.0 
		// note: random never == 1
		// the answer should be a random integer between Min and Max
		// *** missing code here
		int answer = Min + (int) (random * ((Max - Min) + 1));
		return answer;
	}

	public static void DiceRoll() {
		// put 3 random numbers (1 - 6) into DiceRoll[0 - 2]
		// and prints out the three numbers
		// output should look like: Dice roll: 4 3 3
		// *** missing code here
		DiceRoll[0] = RandInt(1, 6);
		DiceRoll[1] = RandInt(1, 6);
		DiceRoll[2] = RandInt(1, 6);
		System.out.println("Dice roll: " + DiceRoll[0] + " " + DiceRoll[1]
				+ " " + DiceRoll[2]);
	}

	public static int ScoreRoll(int player, int round) {
		// Calculate the roll score for the player and round.
		// the array DiceRoll has the value of the three die
		// Must also update the array called Scores
		// - Score for the specific roll and round
		// - Also update the total score in round 0 for the specific player
		// *** missing code here
		int rollscore = 0;
		if (DiceRoll[0] == round && DiceRoll[1] == round
				&& DiceRoll[2] == round) {
			// Bunco roll
			rollscore = 21;
		} else if (DiceRoll[0] == DiceRoll[1] && DiceRoll[1] == DiceRoll[2]) {
			// Dice are all equal but not a bunco
			rollscore = 5;
		} else {
			if (DiceRoll[0] == round)
				rollscore = 1;
			if (DiceRoll[1] == round)
				rollscore += 1;
			if (DiceRoll[2] == round)
				rollscore += 1;
		}
		Scores[player][round] += rollscore;
		System.out.println("Roll Score = " + rollscore + " Cum round score = "
				+ Scores[player][round]);
		Scores[player][0] += rollscore;  // keep total accurate
		return rollscore;
	}

	public static void PlayerTurn(int player, int round) {
		// for the specified player and round:
		//		- roll the dice, and get a score 
		//		- until the turn is complete 
		// *** missing code here
		int rollscore = 0;

		System.out.println("Round# " + round + " Player# " + player);
		do {
			DiceRoll();
			rollscore = ScoreRoll(player, round);
		} while (rollscore > 0 && Scores[player][round] < 21);

	}
	
	public static void ShowScores(){
		System.out.println("Score Display");
		System.out.print("       ");  // first line of players num
		for (int player = 0; player < NumPlayers; player++){
			System.out.print("P" + player + "  ");
		}
		System.out.println("");
		for (int round = 1; round < 7; round++) {
			System.out.print("R" + round + "   ");
			for (int player = 0; player < NumPlayers; player++){
				System.out.format("%4d", Scores[player][round]);
			}
			System.out.println("");
		}
		System.out.print("SUM: ");  // first line of players num
		for (int player = 0; player < NumPlayers; player++){
			System.out.format("%4d",Scores[player][0]);
		}
		System.out.format("%n%n");
	}
	
	public static void PlayGame(int GamePlayers ){
		int round;
		int player = -1;  // one less than the starting point
		ShowScores();
		for (round = 1; round < 7; round++) {
			do {
				player = (player + 1) % NumPlayers; // allow player alternation
				PlayerTurn(player, round);
				if (Scores[player][round] > 20)
					break; // round ends when 21 or greater
			} while (Scores[player][round] < 21);
			String tempstr = GetStr("Enter to continue");
		}
		System.out.format("%n*** Game Over *** %n");
	}

	public static void main(String[] args) {

		// Create methods that make each of the following work
		DiceRoll();
		System.out.println("Answer should be 4 3 3");
		
		DiceRoll[0] = 1; DiceRoll[1] = 2; DiceRoll[2] = 3;
		int score = ScoreRoll(1, 1);  // 
		System.out.println("Score = " + score + " and should be 1");
		ShowScores();
		//make sure all the other dice rolls are scored properly
		// also verify that the scores are set properly for the player and round
		
		
		NumPlayers = GetInt("Please Enter the number of players in game? ", 1,
				NumPlayersMax);
		
		PlayGame(NumPlayers);
		ShowScores();
	}
}
