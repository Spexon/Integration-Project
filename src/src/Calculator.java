package src;

import java.util.Scanner;

// Vladimir Hardy
// basic calculator

public class Calculator {


  public static void calculateMain() {

    // boolean restart = true;
    // while (restart) {

    System.out
        .println("Type a number to do addition, subtraction, " + "multiplication, or division");
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");

    Scanner input = new Scanner(System.in);
    int menu = input.nextInt();
    switch (menu) {

      case 1:
        System.out.println("Enter a numbers to add"); // addition of two numbers
        double addition1 = input.nextDouble();
        System.out.println("Enter a second numbers to add");
        double addition2 = input.nextDouble();
        double totalAddition = addition1 + addition2;
        System.out.println(totalAddition);
        break;

      case 2:
        System.out.println("Enter a number to subtract"); // subtraction of two numbers
        double subtraction1 = input.nextDouble();
        System.out.println("Enter a second numbers to subtract");
        double subtraction2 = input.nextDouble();
        double totalSubtraction = subtraction1 - subtraction2;
        System.out.println(totalSubtraction);
        break;

      case 3:
        System.out.println("Enter a number to multiply"); // multiplication of two numbers
        double multiply1 = input.nextDouble();
        System.out.println("Enter a second numbers to multiply");
        double multiply2 = input.nextDouble();
        double totalMultiplication = multiply1 * multiply2;
        System.out.println(totalMultiplication);
        break;

      case 4:
        System.out.println("Enter a number to divide"); // Division of two numbers
        double divide1 = input.nextDouble();
        System.out.println("Enter a second numbers to divide");
        double divide2 = input.nextDouble();
        double totalDivision = divide1 / divide2;
        System.out.println(totalDivision);
        break;

      default:
        System.out.println("Invalid selection, please type a number");
    }
    /*
     * System.out.println("Would you like to calculate again?"); input.nextLine(); String playAgain
     * = input.nextLine(); if (playAgain.equals("yes")) { restart = true; } else { restart = false;
     * System.out.println("Have a nice day!"); }
     */
    input.close();

  }
}
