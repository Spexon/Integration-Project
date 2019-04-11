package src;

import java.util.Scanner;

// Vladimir Hardy
// Uses arrays and arrayLists in multiple different ways
public class Array {

  public static void array() {
	Scanner input = new Scanner(System.in);
    int numbers[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; // one method of creating an array
    int[] numbersRandom = new int[5]; // Longer method to declare an array
    numbersRandom[0] =  22;
    numbersRandom[1] =  32;
    numbersRandom[2] =  13;
    numbersRandom[3] = -10;
    numbersRandom[4] =  61;
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
    int arraySum = 0;
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
      }
      else {
    	  continue;
      }
    }
    System.out.println("The smallest number in this array is "+smallestNum);
    int row = 1;
    int column = 4;
    System.out.println("The value "+twoDArray[column][row]+" is in the row "+row+" and in the column "+column+" From the 2D array");
    /*int total = 0;
    for (int row = 0;row <twoDArray.length;row++) {
    	System.out.println(row);
    	for (int column = 0;column<twoDArray.length;column++) {
    		System.out.println(column);
    		total += twoDArray[row][column];
    	}
    }
    System.out.println(total);*/
  }
  
  
  
}
