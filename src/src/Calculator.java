package src;

import java.util.InputMismatchException;
import java.util.Scanner;

// Vladimir Hardy
// basic calculator

public class Calculator {
  /**
   * Calculator that can add, subtract, multiply, and divide.
   */
  public static void calculateMain() {
    Scanner input = new Scanner(System.in);
    boolean reLoop = false;
    int menu = 0;
    do {
      System.out
          .println("Type a number to do addition, subtraction, " + "multiplication, or division");
      System.out.println("1. Addition");
      System.out.println("2. Subtraction");
      System.out.println("3. Multiplication");
      System.out.println("4. Division");
      try {
        menu = input.nextInt();
      } catch (InputMismatchException ex) {
        System.out.println("Please type a number");
        input.next();
        reLoop = true;
        continue;
      }
      reLoop = false;
    } while (reLoop);
    switch (menu) {
      case 1:
        double addition1 = 0;
        double addition2 = 0;
        do {
          System.out.println("Enter a numbers to add"); // addition of two numbers
          try {
            addition1 = input.nextDouble();
            System.out.println("Enter a second numbers to add");
            addition2 = input.nextDouble();
          } catch (InputMismatchException ex) {
            System.out.println("Please type a number");
            input.next();
            reLoop = true;
            continue;
          }
          double totalAddition = addition1 + addition2;
          System.out.println(totalAddition);
          reLoop = false;
        } while (reLoop);
        break;

      case 2:
        double subtraction1 = 0;
        double subtraction2 = 0;
        do {
          System.out.println("Enter a number to subtract"); // subtraction of two numbers
          try {
            subtraction1 = input.nextDouble();
            System.out.println("Enter a second numbers to subtract");
            subtraction2 = input.nextDouble();
          } catch (InputMismatchException ex) {
            System.out.println("Please type a number");
            input.next();
            reLoop = true;
            continue;
          }
          double totalSubtraction = subtraction1 - subtraction2;
          System.out.println(totalSubtraction);
          reLoop = false;
        } while (reLoop);
        break;

      case 3:
        double multiply1 = 0;
        double multiply2 = 0;
        do {
          System.out.println("Enter a number to multiply"); // multiplication of two numbers
          try {
            multiply1 = input.nextDouble();
            System.out.println("Enter a second numbers to multiply");
            multiply2 = input.nextDouble();
          } catch (InputMismatchException ex) {
            System.out.println("Please type a number");
            input.next();
            reLoop = true;
            continue;
          }
          double totalMultiplication = multiply1 * multiply2;
          System.out.println(totalMultiplication);
          reLoop = false;
        } while (reLoop);
        break;

      case 4:
        double divide1 = 0;
        double divide2 = 0;
        double totalDivision = 0;
        do {
          System.out.println("Enter a number to divide"); // Division of two numbers
          try {
            divide1 = input.nextDouble();
            System.out.println("Enter a second numbers to divide");
            divide2 = input.nextDouble();
          } catch (InputMismatchException ex) {
            System.out.println("Please type a number");
            input.next();
            reLoop = true;
            continue;
          }
          try {
            totalDivision = divide1 / divide2;
          // For some reason doubles don't cause an exception when divided by zero.
          } catch (ArithmeticException ex) {
            System.out.println("Cannot divide by 0");
            input.next();
            reLoop = true;
            continue;
          }
          System.out.println(totalDivision);
          reLoop = false;
        } while (reLoop);
        break;

      default:
        System.out.println("Invalid selection, please type a number");
    }
  }
}
