package src;

import java.util.Scanner;



/**
 * A program integrating skills learned form COP 2006, which also fulfills
 * the PSI requirements.
 * @author Vladimir Hardy 
 */
public class Introduction {
  // This is a header, 'public' is an access modifier
  // Void is the return type, meaning this method doesn't return anything
  // Method names should be in lowerCamelCase and be named with a verb

  /**
   * This method is the body of the introduction.
   */
  public static void intro() {
    System.out.println("Welcome to my Integration Project introduction");
    // ctrl + space for sysout
    final double SAlES_tAX = 0.25; // Final makes the variable unchangeable throughout the code
    // Scope refers to the block of code belonging to a method following its declaration
    int int1 = 2; // Holds a whole number
    double double1 = 2.0; // Holds values with decimal values
    String string1 = "2"; // Holds a sequence of characters
    boolean boolean1 = true;
    // True or False Statement
    int int2 = 2;
    double double2 = 2.0;
    String string2 = "2";
    String escape = "Bobby said: \"Dont eat the last cookie\"";
    // Example of an escape sequence inside a string
    // Print the sum of both integer variables on a new line.
    System.out.println("The sum of two integers (2 and 2) is " + (int1 + int2));
    // Print the sum of the double variables on a new line.
    System.out.println("The sum of the same two doubles is " + (double1 + double2));
    // Concatenate and print the String variables on a new line.
    System.out.println("The sum of the same two numbers as strings are " + (string1 + string2));
    // every time you switch from numbers to strings, clear using Scan.nextLine();
    System.out.println(boolean1);
    System.out.println(escape);
    int intValue = 550;
    double doubleValue = 40.6;
    intValue = (int) doubleValue; // doubleValue is being casted into a intValue as an
    // integer, however the decimal is being truncated System.out.println(intValue);
    // SALES_TAX = 0.30; Cannot change SALES_TAX because it's a final variable
    System.out.println(intValue);
    //System.out.println(SALES_TAX);
    System.out.println("Type any negative number");
    Scanner input = new Scanner(System.in);
    double negativeNumber = input.nextDouble();
    double positiveNumber = Math.abs(negativeNumber);
    System.out.println("With Math.abs your number is now: " + positiveNumber);

    if (0 <= positiveNumber && positiveNumber <= 100) {
      System.out.println("Your number is between 0 and 100");
    } else {
      System.out.println("Your number is not between 0 and 100");
    }
    int grade = 90;
    char finalLetter = (grade >= 90) ? 'A' : 'B';
    // ? is a ternary operator that has 3 values in it
    System.out.println(finalLetter);

    System.out.println("Type an even or odd number");
    double remainder = input.nextDouble();
    if (remainder % 2 != 0) {
      System.out.println("Your number is odd");
    } else {
      System.out.println("Your number is even");
    }
    for (double outerIncrement = 0; outerIncrement != 5;) {
      System.out.println("Try to guess a number between 0 and 20");
      outerIncrement = input.nextDouble();
      if (outerIncrement == 100) {
        System.out.println("you found the easterEgg!");
        int stepLimit = 5;
        int innerIncrement = 0;
        int innerIncrement2 = 0;
        while (innerIncrement < stepLimit) {
          innerIncrement2 = 1;
          while (innerIncrement2 <= stepLimit) {
            if ((innerIncrement2 + innerIncrement) >= stepLimit) {
              System.out.print("#");

            } else {

              System.out.print(" ");
            }
            innerIncrement2++;
          }
          System.out.println();
          innerIncrement += 1;
        }
      }
    }
    System.out.println("You guessed correctly!");


    int number;
    int correctNumber = 10;
    do {
      System.out.println("Guess a number between 0 and 20, again");
      number = input.nextInt();
    } while (number != correctNumber);
    System.out.println("Correct!");

    System.out.println("Here is a countdown from 10 excluding 5");
    int countDown = 10;
    while (countDown >= 0) {
      System.out.println(countDown);
      countDown--;
      if (countDown == 5) {
        System.out.println("Skipped 5");
        continue; // This skips the number 5 and continues to the next iteration
      }
    }
    input.nextLine(); // Put this here to buffer from int to string scanner
    System.out.println("Type any word");
    String userWord1 = input.nextLine();
    System.out.println("Type another word");
    String userWord2 = input.nextLine();
    int lengthOfWord = userWord2.compareTo(userWord1);
    System.out.println(
        "Your word is alphabetically/lexicographically " + lengthOfWord + " letters apart");
    if (userWord1.equals(userWord2)) {
      // When comparing strings, you cannot use == because their location in memory isn't the same
      System.out.println("Your word is exactly the same");
    }
  }

  static void normalMethod() {
    // @Override
    System.out.println("This is a normal method");
  }
}

/*
 * All Variables on Java must be declared stating its type and name before they can be used. A
 * primitive data type on Java is a special keyword that is already assigned to something, some
 * examples are: byte, int, float and Boolean. Use: Ctrl + shift + F for the auto formatter to run
 * Operator precedence in java have certain priority in execution. Usually, operators that are used
 * less have higher precedence than operators that are used more frequently; for example:
 * multiplicative operators (* /) have more precedence than the assignment operator (=). Inheritance
 * is the use of parent and child classes that inherit common characteristics of other classes. The
 * benefits of inheritance is that one super class can contain many different characteristics that
 * all relate to each other.
 */
