package src;

import java.util.Scanner;

// Vladimir Hardy
// A simple game where you guess try to guess a random word (hangman)
public class Hangman extends WordsForHangman {

  public static void hangman() {

    Scanner input = new Scanner(System.in);
    boolean playAgain = true;
    while (playAgain) {
      String word = words(null, null, 0);
      String hint = "hint";
      int lives = 5;
      System.out.println("Welcome to my integration project, Hangman! "
          + "Your goal is to guess this word correctly, \nyou get " + lives
          + " guesses to correctly answer the word or the game is over. Type \'hint\' for a hint."
          + "\nGuess a letter in the space below!");
      String wordBank = "";
      String guess;
      int wordSize = word.length();
      String underscoreArray[] = new String[wordSize];
      String wordArray[] = new String[wordSize + 1];
      for (int inc = 0; inc < wordSize; inc++) {
        wordArray[inc] = word.substring(inc, inc + 1);
        underscoreArray[inc] = "_";
      }
      String previousGuesses = "";
      while (lives >= 1) {
        guess = input.nextLine();

        if (guess.equalsIgnoreCase(hint)) {
          hintForWord(word, guess);
          continue;
          // System.out.println("The word is an outer space entity");
        } else if (guess.equalsIgnoreCase(word)) {
          playAgain = restartGame(playAgain, input, guess); // This is a call, in parenthesis would
                                                            // be an
                                                            // argument
          break; // Quits the loop when user guesses the correct word
        } else if (guess.equalsIgnoreCase(wordArray[0]) || guess.equalsIgnoreCase(wordArray[1])
            || guess.equalsIgnoreCase(wordArray[2]) || guess.equalsIgnoreCase(wordArray[3])
            || guess.equalsIgnoreCase(wordArray[4]) || guess.equalsIgnoreCase(wordArray[5])) { // Array
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
          int incorrectSizeLetter = guess.length();
          if (incorrectSizeLetter != 1) {
            System.out.println(""
                + "Please type one letter at a time! or the whole word if you know it.");
          }
          lives--;
          System.out.println("Incorrect! you have " + lives + " guesses left");
          
          input = new Scanner(System.in); // Method call to constructor
        }
      }
      if (lives <= 0) {
        System.out.println("You have ran out of guesses, the word was " + word
            + ". Would you like to play again? (Yes or No)");
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
      playAgain = false;
    }
    return (playAgain);
  }

  public static void hintForWord(String word, String guess) {
    int lengthWord = word.length();
    System.out.println("The word is " + lengthWord + " letters long");
  }
}

