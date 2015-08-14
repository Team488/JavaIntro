
public class Bunco {

	public static final int numPlayersMax = 10;
	
	public static void main(String[] args) {
		int numPlayers = Tools.promptForInt("How many players? ", 1, numPlayersMax);
		
		Game game = new Game(numPlayers);
		game.loadPlayers();
		game.runGame();
	}
}
