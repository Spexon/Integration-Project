package src;

import java.util.Scanner;

// Vladimir Hardy
// A program integrating skills learned form COP 2006
public class Main {

  public static void main(String[] args) {
    /*
     * System.out.println("Welcome to my Integration Project"); //ctrl + space for sysout
     * 
     * final double SALES_TAX = 0.25; //A variable is a location in memory. A Final makes the
     * variable unchangeable throughout the code
     * 
     * //Scope is a [local] variable inside a method where it was declared int int1 = 2; //Holds a
     * whole number double double1 = 2.0; //Holds values with decimal values String string1 = "2";
     * //Holds a sequence of characters boolean boolean1 = true; //True or False Statement int int2
     * = 2; double double2 = 2.0; String string2 = "2"; String escape =
     * "Bobby said: \"Dont eat the last cookie\""; //Example of an escape sequence inside a string
     * int intValue = 550; double doubleValue = 40.6;
     * 
     * 
     * // Print the sum of both integer variables on a new line.
     * System.out.println("The result of + with ints is " + (int1 + int2)); // Print the sum of the
     * double variables on a new line. System.out.println("The result of + with doubles is " +
     * (double1 + double2)); // Concatenate and print the String variables on a new line.
     * System.out.println("The result of + with Strings is " + (string1 + string2)); //every time
     * you switch from numbers to strings, clear using Scan.nextLine();
     * System.out.println(boolean1); System.out.println(escape); intValue = (int)doubleValue;
     * //doubleValue is being casted into a intValue as an integer, however the decimal is being
     * truncated System.out.println(intValue); //SALES_TAX = 0.30; Cannot change because SALES_TAX
     * is a final variable System.out.println(SALES_TAX);
     */

    // --- Main code for Integration project beyond this point ---

    while (playAgain.equals(true)) {
      String word = "planet";
      int lives = 5;
      System.out.println("Welcome to Hangman! Your goal is to guess this word correctly, you get "
          + lives
          + " guesses to correctly answer the word or its game over."
          + "\nGuess a letter in the space below!");
      Scanner input = new Scanner(System.in);
      String guess = input.nextLine();

      while (lives > 1) {
        if (guess.equals(word)) {
          System.out
              .println("You guessed " + guess + " which is correct! congratulations you won!");
          break;

        } else {
          lives = lives - 1;
          System.out.println("Incorrect! you have " + lives + " guesses left");
          input = new Scanner(System.in);
          guess = input.nextLine();
        }
      }

      if (lives <= 1) {
        System.out
            .println("You have ran out of guesses! Would you like to play again? (Yes or No)");
        Scanner playAgain = new Scanner(System.in);

      }
      break;
    }

  }
}
/*
 * All Variables on Java must be declared stating its type and name before they can be used. A
 * primitive data type on Java is a special keyword that is already assigned to something, some
 * examples are: byte, int, float and Boolean. Use: Ctrl + shift + F for the auto formatter to run
 */
