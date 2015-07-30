
import java.util.Scanner;

public class Game1HW {

	private static Scanner inputx = new Scanner(System.in);

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
		int answer = Min + (int) (Math.random() * ((Max - Min) + 1));
		return answer;
	}

	private static void GuessNumber(int MaxNum) {
		int answer = RandInt(1, MaxNum); // number between 1 and MaxNum
		System.out.println("answer = " + answer); // for testing only 
		// ask for a number
		// if number is zero quit
		// if number is correct print great job and the number of guesses
		// if number is too high... say so
		// if number is too low ... say so
		// repeat until they either quit with a zero or guess the number
		
		// missing code here

	}

	public static void main(String[] args) {

		System.out.println("*** Simple number guessing game ***");
		do {
			System.out.println("");
			int MaxNum = GetInt("What the largest number for the game? ", 2, Integer.MAX_VALUE);
			GuessNumber(MaxNum);
		} while (1 == GetInt("Do you want to play again (0 - no; 1 - yes)? ", 0, 1));
		System.out.println("Bye");
	}
}
