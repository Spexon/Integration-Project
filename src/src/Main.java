package src;

import java.util.InputMismatchException;
import java.util.Scanner;

/** Menu for all the classes in my integration project.
 * @author Vladimir Hardy
 */
public class Main {

  /**
   * Main method for the main class.
   * @param args Driver class.
   */
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
      System.out.println("7. Quit");

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
          Introduction.intro(input);
          Introduction.normalMethod();
          MethodOverride.normalMethod();
          MethodOverride.draw(null);
          MethodOverride.draw(menu);
          break;
        case 2:
          Hangman.hangman(input);
          break;
        case 3:
          Calculator.calculateMain(input);
          break;
        case 4:
          Car.car();
          SUv mySUv = new SUv();
          mySUv.pimpedOutSUv();
          mySUv.normalSUv();
          break;
        case 5:
          Array.array(input);
          break;
        case 6:
          Polymorphism.polymorphism();
          break;
        case 7:
          break;
        default:
          System.out.println("Invalid selection, please type a number");
          tryAgain = true;
          continue;
      }
      System.out.println("Would you like to see more? (yes or no)");
      String restart = input.next();
      restart = restart.trim();
      if (restart.equalsIgnoreCase("yes") || restart.equalsIgnoreCase("y")) {
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
