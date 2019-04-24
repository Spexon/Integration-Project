package src;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// Vladimir Hardy
// Uses arrays and arrayLists in multiple different ways
public class Array {

  /**Main method that creates and utilizes arrays.
   * 
   */
  public static void array(Scanner input) {
    int[] numbersRandom = new int[5]; // Longer method to declare an array
    numbersRandom[0] = 22;
    numbersRandom[1] = 32;
    numbersRandom[2] = 13;
    numbersRandom[3] = -10;
    numbersRandom[4] = 61;
    int[][] twoDArray = new int[6][2];
    twoDArray[0][0] = 0;
    twoDArray[0][1] = 2;
    twoDArray[1][0] = 0;
    twoDArray[1][1] = 1;
    twoDArray[2][0] = 0;
    twoDArray[2][1] = 1;
    twoDArray[3][0] = 1;
    twoDArray[3][1] = 0;
    twoDArray[4][0] = 2;
    twoDArray[4][1] = 0;
    twoDArray[5][0] = 3;
    twoDArray[5][1] = 0;
    ArrayList<String> shoppingList = new ArrayList<String>(); // Default size is 10 but can add more
    shoppingList.add("Banannas");
    shoppingList.add("Peanut Butter");
    shoppingList.add("Cereal");
    shoppingList.add("Bread");
    shoppingList.add("Chicken");
    int arraySum = 0;
    int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; // one method of creating an array
    // This is an accumulator that adds all the values of the array numbers
    for (int inc = 0; inc < numbers.length; inc++) {
      arraySum += numbers[inc];
    }
    System.out.println("The sum of this array is " + arraySum);
    int smallestNum = numbersRandom[0];
    for (int inc = 1; inc < numbersRandom.length; inc++) {
      if (numbersRandom[inc] < smallestNum) {
        smallestNum = numbersRandom[inc];
        System.out.println("The index of this value is at: " + inc);
      } else {
        continue;
      }
    }
    System.out.println("The smallest number in this array is " + smallestNum);

    int row = 0;
    int column = 0;
    boolean reLoop = false;
    do { // This will continue until the user types in the correct information
      System.out.println("Type a number for the row between 0 and 1");
      try {
        row = input.nextInt();
      } catch (InputMismatchException ex) {
        System.out.println("Please type a number");
        input.next();
        reLoop = true;
        continue;
      }
      System.out.println("Type a number for the column between 0 and 5");
      try {
        column = input.nextInt();
      } catch (InputMismatchException ex) {
        System.out.println("Please type a number");
        input.next();
        reLoop = true;
        continue;
      }

      try {
        System.out.println("The value " + twoDArray[column][row] + " is in the row " + row
            + " and in the column " + column + " from the 2D array");
      } catch (ArrayIndexOutOfBoundsException ex) {
        System.out.println("Please type a number between the given range");
        input.reset();
        continue;
      }
      reLoop = false;
    } while (reLoop);
    for (String str : shoppingList) { // Enhanced for loop
      System.out.println("Shopping list: " + str);
    }
  }
}
