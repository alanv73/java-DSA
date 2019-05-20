import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Client {

	
	public static void main(String[] args) {

		int numberToGuess = 11;
		boolean found = false;
		boolean quit = false;
		int guess = 0;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String numberAsString = null;
		int number = -1;
		
		try {
			System.out.println("Enter something!");
			
			while(!found && !quit && guess < 7) {
				try {
					numberAsString = br.readLine();  // Cursor
					number = Integer.parseInt(numberAsString);
					guess++;
				}
				catch(Exception e) {
					if(!numberAsString.equals("Q") && !numberAsString.equals("q")) {
						System.out.println("Invalid Guess.\n" + 
								"Enter a number (1 - 100) " + 
								"Q to Quit");
					}
					number = -1;
				}
				System.out.println("number guessed is: " + 
						(number > 0 ? number : numberAsString));
			
				// Quit y/n:
				if(numberAsString.equals("Q") || numberAsString.equals("q")) {
				
					quit = true;
					
				}
				else {
					
					if (number == numberToGuess) {
						found = true;
					} 
					else if (number > 0) {
						if (number < numberToGuess) {
							System.out.println("Your guess is too low.");
						} 
						else {
							System.out.println("Your guess is too high.");
						}
						
						if (guess < 7) {
							System.out.println("Try Again.");
						} 
						else {
							System.out.println("Too Many Guesses.");
						}
					}
				}
				
			} // end while
			
			if (found) {
				System.out.println("You Win!");
			}
			else {
				System.out.println("You lose!");
			}
			
			System.out.println("numberToGuess was " + numberToGuess);
			System.out.println("number of guesses: " + guess);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		if(quit) {
			System.out.println("Quit!");
		}
		else {
			System.out.println("End.");
		}
	}

}