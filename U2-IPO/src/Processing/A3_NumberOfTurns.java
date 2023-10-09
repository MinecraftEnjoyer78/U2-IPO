package Processing;

public class A3_NumberOfTurns {

	public static void main(String[] args) {
		
		int maxPlayers = 8;
		int minPlayers = 3;
		int maxTurns = 120;
		int minTurns = 20;
		int turnPlayer;
		
		int turns = (int) (Math.random()*(maxTurns-minTurns+1)) + minTurns;
		int players = (int) (Math.random()*(maxPlayers-minPlayers+1)) + minPlayers;
		
		System.out.println("This is the number of turns: " + turns);
		System.out.println("This is the number of players: " + players);
		
		turnPlayer = turns % players;
		
		System.out.println("It is the turn of player " + turnPlayer);
	}
}
