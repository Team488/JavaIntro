import java.util.Scanner;
import java.util.Random;

public class Tools {
	private static Scanner inputx = new Scanner(System.in);
	private  static Random generator = new Random(123456789); // always gives same sequence
    //private static Random generator = new Random(); // random every time

	public static void resetRandom() {
	    generator = new Random();
	}
	
	public static void resetRandom(int seed) {
        generator = new Random(seed);
	}
	
	public static String promptForString(String msg) {
		System.out.print(msg);
		return inputx.nextLine();
	}

	public static int promptForInt(String msg, int min, int max) {
		int value = 0;

		try {
		    String strInput = promptForString(msg);
			value = Integer.parseInt(strInput);
		} catch (NumberFormatException e) {
			System.out.println("Illegal integer input; Please try again.");
			value = promptForInt(msg, min, max);
		}
		
		if (value < min || value > max) {
			System.out.print("Illegal value; ");
			value = promptForInt(msg, min, max);
		}
		
		return value;
	}
	
	public static int randInt(int min, int max) {
		double random = generator.nextDouble(); // 0.0 <= random < 1.0
		int answer = min + (int) (random * ((max - min) + 1));
		return answer;
	}
	
	public static void pause() {
	    pause("");
	}
	
	public static void pause(String msg) {
	    if(msg != null && msg.length() > 0)
	        System.out.print(msg + " ");
	    
	    System.out.print("Press enter to continue...");
	    inputx.nextLine();
	    System.out.println();
	}

}
