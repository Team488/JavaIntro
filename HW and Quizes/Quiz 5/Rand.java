import java.util.Random;

public class Rand {

	public static Random generator = new Random(123456789);  	// always gives same sequence
	//public static Random generator = new Random();  		// random every time
	
private static int RandInt(int Min, int Max) {
		double random = generator.nextDouble(); // 0.0 <= random < 1.0 
		// note: random never == 1
		// the answer should be a random integer between Min and Max
		
		int answer;
		// *** missing code here

		return answer;
	}

public static void main(String[] args) {
	// *** missing code here
	// put tests in here to verify
	
}

}




	
	