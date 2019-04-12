package src;

import java.util.InputMismatchException;
import java.util.Scanner;

// Vladimir Hardy
// Menu for all the classes in my integration project

public class Main {

  public static void main(String[] args) {
    boolean tryAgain = true;
    Scanner input = new Scanner(System.in);
    while (tryAgain) {
      System.out.println("Choose an option below by typing a number to begin");
      System.out.println("1. Introduction");
      System.out.println("2. Hangman");
      System.out.println("3. Calculator");
      System.out.println("4. Car");
      System.out.println("5. Array");
      System.out.println("6. Polymorphism");

      int menu = 0;
      boolean reLoop = false;
      do {
        try {
          menu = input.nextInt();
        } catch (InputMismatchException ex) { // Specific exception handling
          System.out.println("Please enter a whole number");
          input.nextLine(); // Gets rid of garbage input
          continue;
        } catch (Exception ex) { // More general exception
          System.out.println("Please enter a whole number");
          input.nextLine();
          reLoop = true;
          continue;
        }
        reLoop = false;
      } while (reLoop);
      switch (menu) {
        case 1:
          Introduction.intro();
          Introduction.normalMethod();
          MethodOverride.normalMethod();
          MethodOverride.draw(null);
          MethodOverride.draw(menu);
          break;
        case 2:
          Hangman.hangman();
          break;
        case 3:
          Calculator.calculateMain();
          break;
        case 4:
          Car.car();
          SUV mySUV = new SUV();
          mySUV.pimpedOutSUV();
          break;
        case 5:
          Array.array();
          break;
        case 6:
          Polymorphism.polymorphism();
          break;
        default:
          System.out.println("Invalid selection, please type a number");
          tryAgain = true;
          continue;
      }
      System.out.println("Would you like to see more? (yes or no)");
      String restart = input.next();
      if (restart.equalsIgnoreCase("yes")) {
        tryAgain = true;
        input.reset();
      } else {
        System.out.println("Have a nice day!");
        tryAgain = false;
      }
    }
    input.close();
  }
}
