package src;

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
      String letterTracker = "";
      String guess;// <-- change string to char when array is working
      String underscore = "______";
      String letterP = word.substring(0, 1);
      String letterL = word.substring(1, 2);
      String letterA = word.substring(2, 3);
      String letterN = word.substring(3, 4);
      String letterE = word.substring(4, 5);
      String letterT = word.substring(5, 6);
      while (lives >= 1) {
        guess = input.nextLine();
        if (guess.equalsIgnoreCase(hint)) {
          hintForWord(word, guess);
          // System.out.println("The word is an outer space entity");
        } else if (guess.equalsIgnoreCase(word)) {
          restartGame(playAgain, input, guess); // This is a call, in parenthesis would be an
                                                // argument
          break; // Quits the loop when user guesses the correct word
        } else if (guess.equalsIgnoreCase(letterP) || guess.equalsIgnoreCase(letterL)
            || guess.equalsIgnoreCase(letterA) || guess.equalsIgnoreCase(letterN)
            || guess.equalsIgnoreCase(letterE) || guess.equalsIgnoreCase(letterT)) {
          letterTracker += guess;
          System.out.println(letterTracker);
          System.out.println("Your letter is correct! Current letters: " + underscore);
          if (letterTracker.equalsIgnoreCase(word)) {
            guess = letterTracker;
            restartGame(playAgain, input, guess);
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

  public static String restartGame(boolean playAgain, Scanner input, String guess) {
    // This is a header. A parameter is inside parenthesis after string
    System.out.println("You guessed " + guess + " which is correct! " + "Congratulations you won!");
    System.out.println("Would you like to test your luck and play again? (Yes or No)");
    String restart = input.nextLine();
    if (restart.equalsIgnoreCase("yes")) {
      System.out.println("Restarting...");
      playAgain = true;
    } else {
      System.out.println("Thanks for playing!");
      // playAgain = false; //doesn't do anything
    }
    return restart;
  }

  public static int hintForWord(String word, String guess) {
    int lengthWord = word.length();
    System.out.println("The word is " + lengthWord + " letters long");
    return lengthWord;
  }
}

