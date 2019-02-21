package src;

import java.util.Random;
import java.util.Scanner;

//Vladimir Hardy
//A program integrating skills learned form COP 2006
public class Hangman {
//main should be easy to read and call other methods
	public static void main(String[] args) {
	  
	    Scanner input = new Scanner(System.in);
		boolean playAgain = true; 

		while (playAgain) {
		String word = "planet";
		int lives = 5;
		
		System.out.println("Welcome to my integration project, Hangman! "
				+ "Your goal is to guess this word correctly, \nyou get " + lives
				+ " guesses to correctly answer the word or its game over." 
				+ "\nGuess a letter in the space below!");
		String guess = input.nextLine();

		while (lives >= 1) {
			if (guess.equals(word)) {
				System.out.println("You guessed " + guess + " which is correct! "
				+ "Congratulations you won!");
				restartGame(playAgain, input); //This is a call, in parenthesis would be an argument
				break;
				
			} else {
				lives = lives - 1;
				System.out.println("Incorrect! you have " + lives + " guesses left");
				input = new Scanner(System.in);
				guess = input.nextLine();
			}
		}
		
		if (lives <= 0) {
			System.out.println("You have ran out of guesses! "
			+ "Would you like to play again? (Yes or No)");
			String restart = input.nextLine();
			if (restart.equals("yes")) {
				playAgain = true;
			}
			else {
				System.out.println("Thanks for playing!");
				break;
			}
		}
	}
		input.close();
  }
	public static int numberGenerator() { // Use this when adding more words to guess
		Random rndNum = new Random();
		int restartNum = rndNum.nextInt(2);
		return restartNum;
	}
	
	public static String restartGame(boolean playAgain, Scanner input) { //This is a header. A parameter is inside parenthesis after string
      //input = new Scanner(System.in);
      System.out.println("Would you like to test your luck and play again? (Yes or No)");
      String restart = input.nextLine();
      if (restart.equals("yes")) {
			playAgain = true;
	  }
	  else {
		System.out.println("Thanks for playing!");
		playAgain = false;
	  }
      //input.close(); makes program bug out when correctly guessing word
      return restart;
    }
	
}