package src;

// Vladimir Hardy
// Uses arrays and arrayLists in multiple different ways
public class Array {

  public static void array() {
    int numbers[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; // one method of creating an array
    int[] numbersRandom = new int[5]; // Longer method to declare an array
    numbersRandom[0] =  22;
    numbersRandom[1] =  32;
    numbersRandom[2] =  13;
    numbersRandom[3] = -10;
    numbersRandom[4] =  61;
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
      }
      else {
    	  continue;
      }
    }
    System.out.println(smallestNum);
  }
}
