import java.util.ArrayList;

public class GuessGame {

	Player p1;
	Player p2;
	Player p3;
	ArrayList<Integer> guessLog = new ArrayList<Integer>();

	public void startGame() {
    
		p1 = new Player("Player 1");
		p2 = new Player("Player 2");
		p3 = new Player("Player 3");

		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		int targetNumber = (int) (Math.random() * 20);
		int guesses = 0;
		
		System.out.println("I'm thinking of a number between 0 and 19...");
		while(true) {
			System.out.println("Number to guess is " + targetNumber);

					playerTurn(p1);
					playerTurn(p2);
					playerTurn(p3);
				
			guesses++;

			guessp1 = p1.number;
			System.out.println("Player one guessed " + guessp1);
			guessp2 = p2.number;
			System.out.println("Player two guessed " + guessp2);
			guessp3 = p3.number;
			System.out.println("Player three guessed " + guessp3);

			if (guessp1 == targetNumber) {
				p1isRight = true;
			}
			if (guessp2 == targetNumber) {
				p2isRight = true;
			}
			if (guessp3 == targetNumber) {
				p3isRight = true;
			}

			if (p1isRight || p2isRight || p3isRight)
			{
				System.out.println("We have a winner in " + guesses + " guesses!");
				System.out.println("Player one got it right? " + p1isRight);
				System.out.println("Player two got it right? " + p2isRight);
				System.out.println("Player three got it right? " + p3isRight);
				System.out.println("Game is over");
				break;
			}
			else
			{
				System.out.println("Players will have to try again.");
			}
		}
   }
	
	private void playerTurn(Player player) {
		
		boolean goodGuess = false;
		
		while(!goodGuess) {
			player.guess();
			if (!guessLog.contains(player.number)) {
				goodGuess=true;
				guessLog.add(player.number);
//			} else {
//				System.out.println("Duplicate");
			}
		}

	}
}
