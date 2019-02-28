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
			String hint = "hint";
			int lives = 5;

			System.out.println("Welcome to my integration project, Hangman! "
					+ "Your goal is to guess this word correctly, \nyou get guesses " + lives
					+ " to correctly answer the word or its game over. Type \'hint\' for a hint."
					+ "\nGuess a letter in the space below!");

			String guess;// <-- change string to char when array is working

			while (lives >= 1) {
				guess = input.nextLine();
				if (guess.equalsIgnoreCase(hint)) {
					System.out.println("The word is an outerspace entity");
					hint = "null";
				} else if (guess.equalsIgnoreCase(word)) {
					System.out.println("You guessed " + guess + " which is correct! " + "Congratulations you won!");
					restartGame(playAgain, input); // This is a call, in parenthesis would be an argument
					break; // Quits the loop when user guesses the correct word
				} else {
					lives--;
					System.out.println("Incorrect! you have " + lives + " guesses left");
					input = new Scanner(System.in);
				}
			}

			if (lives <= 0) {
				System.out.println("You have ran out of guesses! " + "Would you like to play again? (Yes or No)");
				String restart = input.nextLine();
				if (restart.equals("yes")) {
					playAgain = true;
				} else {
					System.out.println("Thanks for playing!");
					break; // Quits the loop when user decides to stop playing
				}
			} else {
			}
		}
		playAgain = false;
		input.close();
	}

	public static int numberGenerator() { // Use this when adding more words to guess
		Random rndNum = new Random();
		int restartNum = rndNum.nextInt(2);
		return restartNum;
	}

	public static String restartGame(boolean playAgain, Scanner input) {
		// This is a header. A parameter is inside parenthesis after string
		System.out.println("Would you like to test your luck and play again? (Yes or No)");
		String restart = input.nextLine();
		if (restart.equalsIgnoreCase("yes")) {
			System.out.println("Restarting...");
			playAgain = true;
		} else {
			System.out.println("Thanks for playing!");
			// playAgain = false;
		}
		return restart;
	}

	public static String letters(String word, char letterP, char letterL) {
		letterP = (word.charAt(0));
		System.out.println(letterP);
		/*
		 * if (letterP.equals(word.charAt(0))) {
		 * 
		 * }
		 */
		letterL = (word.charAt(1));
		System.out.println(letterP);
		/*
		 * if (letterP.equals(word.charAt(0))) {
		 * 
		 * }
		 */

		return letters(word, letterP, letterL);
	}

}