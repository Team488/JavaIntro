
public class Game {
    private Player[] players;
    private int numPlayers;
    
    public Game(int numPlayers) {
       this.numPlayers = numPlayers;
       
       players = new Player[numPlayers];
    }
    
    public void loadPlayers() {
        // instantiate all the CurrentPlayers
        for(int CurrentPlayer = 0; CurrentPlayer < numPlayers; CurrentPlayer++){
            String playerName = Tools.promptForString("Enter Player " + CurrentPlayer + " name? ");
            players[CurrentPlayer] = new Player(playerName);            
        }
    }
    
	public void printScoreTable() {		
		System.out.println("Score Display");
		System.out.print("       ");  // first line of players num
		for (int player = 0; player < numPlayers; player++){
			System.out.print("P" + player + "  ");
		}
		System.out.println("");
		for (int round = 1; round < 7; round++) {
			System.out.print("R" + round + "   ");
			for (int player = 0; player < numPlayers; player++){
				System.out.format("%4d", players[player].getScore(round));
			}
			System.out.println("");
		}
		System.out.print("SUM: ");  // first line of players num
		for (int player = 0; player < numPlayers; player++){
			System.out.format("%4d", players[player].getTotal());
		}
		System.out.format("%n%n");
	}

	
	public void runGame() {
		printScoreTable(); // everything should be zero here
		
		// Should we start on the first player on every round?
		int currentPlayer =  -1;
		for (int round = 1; round < 7; round++) {
			do {
				currentPlayer = (currentPlayer + 1) % numPlayers; // allow CurrentPlayer rotation
				players[currentPlayer].takeTurn(round);
			} while (players[currentPlayer].getScore(round) < 21);
			Tools.pause("Round " + round + " complete.");
		}
		
		System.out.format("%n*** Game Over ***%n");
		printScoreTable();
	}
}
