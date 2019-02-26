package src;

import java.util.Scanner;

//Vladimir Hardy
//A program integrating skills learned form COP 2006
public class Introduction {
 //This is a header, 'public' is an access modifier
 //Void is the return type, meaning this method doesn't return anything
 //Method names should be in lowerCamelCase and be named with a verb
	public static void main(String[] args) { //cant have multiple mains!

		System.out.println("Welcome to my Integration Project introduction");
		// ctrl + space for sysout
		final double SALES_TAX = 0.25; // Final makes the variable unchangeable throughout the code
		// Scope refers to the block of code belonging to a method following its
		// declaration
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
		int intValue = 550;
		double doubleValue = 40.6;

		// Print the sum of both integer variables on a new line.
		System.out.println("The sum of two integers is " + (int1 + int2));
		// Print the sum of the double variables on a new line.
		System.out.println("The sum of the same two doubles is " + (double1 + double2));
		// Concatenate and print the String variables on a new line.
		System.out.println("The sum of the same two numbers as strings are " + (string1 + string2));
		// every time you switch from numbers to strings, clear using Scan.nextLine();
		System.out.println(boolean1);
		System.out.println(escape);
		intValue = (int) doubleValue; // doubleValue is being casted into a intValue as an
		// integer, however the decimal is being truncated System.out.println(intValue);
		// SALES_TAX = 0.30; Cannot change SALES_TAX because it's a final variable
		System.out.println(SALES_TAX);
		Card myCard = new Card();
		myCard.setSuite("Clubs");
		 Scanner input = new Scanner(System.in);
		 input = new Scanner(System.in);
		 System.out.println("Type any negative number");
		 double negativeNumber = input.nextDouble();
		 double positiveNumber = Math.abs(negativeNumber);
		 System.out.println("With Math.abs your number is now: " + positiveNumber);

		 if (0 <= positiveNumber && positiveNumber <= 100) {
			 System.out.println("Your number is between 0 and 100");
		 }
		 else {
			 System.out.println("Your number is not between 0 and 100");
		 }
		 int grade = 90;
			char finalLetter = (grade >= 90) ? 'A' : 'B'; 
			//? is a ternary operator that has 3 values in it
			System.out.println(finalLetter);
			
		System.out.println("Type an even or odd number");
		double remainder = input.nextDouble();
		
		
		input.close();
	}
	

}
/*
 * All Variables on Java must be declared stating its type and name before they
 * can be used. A primitive data type on Java is a special keyword that is
 * already assigned to something, some examples are: byte, int, float and
 * Boolean. Use: Ctrl + shift + F for the auto formatter to run
 */