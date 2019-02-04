package src;

import java.util.Scanner;

//Vladimir Hardy
//A program integrating skills learned form COP 2006
public class Main {

	public static void main(String[] args) {

		// boolean playAgain = true; //want to allow the user to choose whether they
		// want to play again or not

		// while (playAgain==(true)) {
		String word = "planet";
		int lives = 5;
		System.out.println("Welcome to my integration project, Hangman! "
				+ "Your goal is to guess this word correctly, you get " + lives
				+ " guesses to correctly answer the word or its game over." 
				+ "\nGuess a letter in the space below!");
		Scanner input = new Scanner(System.in);
		String guess = input.nextLine();

		while (lives > 1) {
			if (guess.equals(word)) {
				System.out.println("You guessed " + guess + " which is correct! "
				+ "Congratulations you won!");
				break;

			} else {
				lives = lives - 1;
				System.out.println("Incorrect! you have " + lives + " guesses left");
				input = new Scanner(System.in);
				guess = input.nextLine();
			}
		}

		if (lives <= 1) {
			System.out.println("You have ran out of guesses! "
			+ "Would you like to play again? (Yes or No)");
			Scanner restart = new Scanner(System.in);

		} else {
			// break;
		}

	}

}
//}