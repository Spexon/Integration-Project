package src;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// Vladimir Hardy
// A simple game where you guess try to guess a random word (hangman)
public class Hangman {

  public static void hangman() {

    Scanner input = new Scanner(System.in);
    boolean playAgain = true;
    /*
     * String[] word = arrayForWord(); int increment=0; String letter; while(increment<6) { letter =
     * arrayForWord()[increment]; increment++; }
     */
    while (playAgain) {
      String word = "planet"; // create a new class for this (String word = new word)

      String hint = "hint";
      int lives = 5;

      System.out.println("Welcome to my integration project, Hangman! "
          + "Your goal is to guess this word correctly, \nyou get guesses " + lives
          + " to correctly answer the word or its game over. Type \'hint\' for a hint."
          + "\nGuess a letter in the space below!");
      String wordBank = "";
      String guess;
      String underscoreArray[] = {"_","_","_","_","_","_"};
      String letterArray[] = {"p","l","a","n","e","t"};
      
      while (lives >= 1) {
        guess = input.nextLine();
        wordBank += guess;
        System.out.println("Used letters: \n" + wordBank);
        if (guess.equalsIgnoreCase(hint)) {
          hintForWord(word, guess);
          // System.out.println("The word is an outer space entity");
        } else if (guess.equalsIgnoreCase(word)) {
         playAgain = restartGame(playAgain, input, guess); // This is a call, in parenthesis would be an
                                                		   // argument
          break; // Quits the loop when user guesses the correct word
        }
        else if (guess.equalsIgnoreCase(letterArray[0]) || guess.equalsIgnoreCase(letterArray[1]) || 
        		guess.equalsIgnoreCase(letterArray[2]) || guess.equalsIgnoreCase(letterArray[3])  ||
        	    guess.equalsIgnoreCase(letterArray[4]) || guess.equalsIgnoreCase(letterArray[5])) { //Array
            String underscore = "";
            for (int inc=0; inc < underscoreArray.length;inc++) {
            	if (guess.equals(letterArray[inc])) {
            		underscoreArray[inc] = guess;
            	}
            	underscore += underscoreArray[inc];
            }
            System.out.println("Your letter is correct! Current letters: " + underscore);
            if (underscore.equalsIgnoreCase(word)) {
              guess = underscore;
             playAgain = restartGame(playAgain, input, guess);
              break;
            }	
        } else {
          lives--;
          System.out.println("Incorrect! you have " + lives + " guesses left");
          input = new Scanner(System.in); // Method call to constructor
        }
      }
      if (lives <= 0) {
        System.out
            .println("You have ran out of guesses! Would you like to play again? (Yes or No)");
        String restart = input.nextLine();
        if (restart.equalsIgnoreCase("yes")) {
          playAgain = true;
        } else {
          System.out.println("Thanks for playing!");
          playAgain = false;
          break; // Quits the loop when user decides to stop playing
        }
      } else {
      }
    }
  }

  public static int numberGenerator() { // Use this when adding more words to guess
    Random rndNum = new Random();
    int restartNum = rndNum.nextInt(2);
    return restartNum;
  }

  public static boolean restartGame(boolean playAgain, Scanner input, String guess) {
    // This is a header. A parameter is inside parenthesis after string
	
    System.out.println("You guessed " + guess + " which is correct! " + "Congratulations you won!");
    System.out.println("Would you like to test your luck and play again? (Yes or No)");
    String restart = input.nextLine();
    if (restart.equalsIgnoreCase("yes")) {
      System.out.println("Restarting...");
      playAgain = true;
    } else {
      System.out.println("Thanks for playing!");
      playAgain = false; //doesn't do anything
    }
    return (playAgain);
  }

  public static void hintForWord(String word, String guess) {
    int lengthWord = word.length();
    System.out.println("The word is " + lengthWord + " letters long");
  }
}

