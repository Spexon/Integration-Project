package src;

import java.util.Scanner;

/**
 * A simple game where you guess try to guess a random word (hangman).
 * 
 * @author Vladimir Hardy
 */
public class Hangman extends WordsForHangman {

  /**
   * The main program for hangman, which is also the program that I put most of my time developing.
   * 
   */
  public static void hangman() {

    Scanner input = new Scanner(System.in);
    boolean playAgain = true;
    while (playAgain) {
      String word = words(null, 0);
      String hint = "hint";
      int lives = 5;
      System.out.println("Welcome to my integration project, Hangman! "
          + "Your goal is to guess this word correctly, \nyou get " + lives
          + " guesses to correctly answer the word or the game is over. Type \'hint\' for a hint."
          + "\nGuess a letter in the space below!");
      String wordBank = "";
      String guess;
      int wordSize = word.length();
      String[] underscoreArray = new String[wordSize];
      String[] wordArray = new String[wordSize + 2]; // this causes problems when word size
      // differs
      for (int inc = 0; inc < wordSize; inc++) {
        wordArray[inc] = word.substring(inc, inc + 1);
        underscoreArray[inc] = "_";
      }
      String previousGuesses = "";
      while (lives >= 1) {
        guess = input.nextLine();
        guess = guess.trim();

        if (guess.equalsIgnoreCase(hint)) {
          hintForWord(word, guess);
          continue;
          // System.out.println("The word is an outer space entity");
        } else if (guess.equalsIgnoreCase(word)) {
          playAgain = restartGame(playAgain, input, guess); //
          // This is a call, in parenthesis would be an argument
          break; // Quits the loop when user guesses the correct word
        } else if (guess.equalsIgnoreCase(wordArray[0]) || guess.equalsIgnoreCase(wordArray[1])
            || guess.equalsIgnoreCase(wordArray[2]) || guess.equalsIgnoreCase(wordArray[3])
            || guess.equalsIgnoreCase(wordArray[4]) || guess.equalsIgnoreCase(wordArray[5])
            || guess.equalsIgnoreCase(wordArray[6])) {
          String underscore = "";
          if (guess.equals(previousGuesses)) {
            previousGuesses += guess;
            System.out.println("Used letters: \n" + wordBank);
          } else {
            wordBank += guess;
            System.out.println("Used letters: \n" + wordBank);
            previousGuesses += guess;
          }
          for (int inc = 0; inc < underscoreArray.length; inc++) {
            if (guess.equals(wordArray[inc])) {
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
          if (guess.equals(previousGuesses)) {
            previousGuesses += guess;
            System.out.println("Used letters: \n" + wordBank);
          } else {
            wordBank += guess;
            System.out.println("Used letters: \n" + wordBank);
            previousGuesses += guess;
          }
          if (guess.length() > 1) {
            System.out.println(
                "" + "Please type one letter at a time! or the whole word if you know it.");
          }
          String[] hangmanFigure = new String[5];
          hangmanFigure[0] =
              "_________\n" + "|/      |\n" + "|\n" + "|\n" + "|\n" + "|\n" + "|\n" + "|___\n";
          hangmanFigure[1] = "_________\n" + "|/      |\n" + "|     (._.)\n" + "|\n" + "|\n" + "|\n"
              + "|\n" + "|___\n";
          hangmanFigure[2] = "_________\n" + "|/      |\n" + "|     (._.)\n" + "|      \\|/\n"
              + "|       |\n" + "|\n" + "|\n" + "|___\n";
          hangmanFigure[3] = "_________\n" + "|/      |\n" + "|     (._.)\n" + "|      \\|/\n"
              + "|       |\n" + "|      / \\\n" + "|\n" + "|___\n";
          hangmanFigure[4] = "_________\n" + "|/      |\n" + "|     (x_x)\n" + "|      /|\\\n"
              + "|       |\n" + "|      / \\\n" + "|\n" + "|___\n";

          lives--;
          System.out.println(hangmanFigure[(lives - 4) * -1]);
          System.out.println("Incorrect! you have " + lives + " guesses left");
          input = new Scanner(System.in); // Method call to constructor
        }
      }
      if (lives <= 0) {
        System.out.println("You have ran out of guesses, the word was " + word
            + ". Would you like to play again? (Yes or No)");
        String restart = input.nextLine();
        restart = restart.trim();
        if (restart.equalsIgnoreCase("yes") || restart.equalsIgnoreCase("y")) {
          playAgain = true;
        } else {
          System.out.println("Thanks for playing!");
          playAgain = false;
          break; // Quits the loop when user decides to stop playing
        }
      }
    }
  }


  /**
   * Restarts game method when the user guesses the word correctly.
   * 
   * @param playAgain brought in so that playAgain doesn't have to be re-initialized
   * @param input scanner input for the restart feature
   * @param guess shows the user what their guess was.
   * @return playAgain boolean which determines if the game continues or not.
   */
  public static boolean restartGame(boolean playAgain, Scanner input, String guess) {
    // This is a header. A parameter is inside parenthesis after string
    System.out.println("You guessed " + guess + " which is correct! " + "Congratulations you won!");
    System.out.println("Would you like to test your luck and play again? (Yes or No)");
    String restart = input.nextLine();
    restart = restart.trim();
    if (restart.equalsIgnoreCase("yes") || restart.equalsIgnoreCase("y")) {
      System.out.println("Restarting...");
      playAgain = true;
    } else {
      System.out.println("Thanks for playing!");
      playAgain = false;
    }
    return (playAgain);
  }

  public static void hintForWord(String word, String guess) {
    int lengthWord = word.length();
    System.out.println("The word is " + lengthWord + " letters long");
  }
}
