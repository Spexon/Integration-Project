package src;

import java.util.Random;
import java.util.Scanner;

// Vladimir Hardy
// A program integrating skills learned form COP 2006
public class Hangman {

  public static void hangman() {

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
          hintForWord(word, guess);
          // System.out.println("The word is an outer space entity");
        } else if (guess.equalsIgnoreCase(word)) {
          System.out
              .println("You guessed " + guess + " which is correct! " + "Congratulations you won!");
          restartGame(playAgain, input); // This is a call, in parenthesis would be an argument
          break; // Quits the loop when user guesses the correct word
        } else {
          lives--;
          System.out.println("Incorrect! you have " + lives + " guesses left");
          input = new Scanner(System.in); // Method call to constructor
        }
      }

      if (lives <= 0) {
        System.out
            .println("You have ran out of guesses! " + "Would you like to play again? (Yes or No)");
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
    //this playAgain is different to the playAgain at the top
    // This is a header. A parameter is inside parenthesis after string
    System.out.println("Would you like to test your luck and play again? (Yes or No)");
    String restart = input.nextLine();
    if (restart.equalsIgnoreCase("yes")) {
      System.out.println("Restarting...");
      playAgain = true;
    } else {
      System.out.println("Thanks for playing!");
      //playAgain = false; is unnecessary 
    }
    return restart;
  }

  public static int hintForWord(String word, String guess) {
    int lengthWord = word.length();
    int lengthGuess = guess.length();
    int result = lengthWord - lengthGuess;
    System.out.println("The word above is " + result + " letters away from the correct word");
    return result;
  }
}
