package src;

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
		System.out.println("The result of + with ints is " + (int1 + int2));
		// Print the sum of the double variables on a new line.
		System.out.println("The result of + with doubles is " + (double1 + double2));
		// Concatenate and print the String variables on a new line.
		System.out.println("The result of + with Strings is " + (string1 + string2));
		// every time you switch from numbers to strings, clear using Scan.nextLine();
		System.out.println(boolean1);
		System.out.println(escape);
		intValue = (int) doubleValue; // doubleValue is being casted into a intValue as an
		// integer, however the decimal is being truncated System.out.println(intValue);
		// SALES_TAX = 0.30; Cannot change SALES_TAX because it's a final variable
		System.out.println(SALES_TAX);
		Card myCard = new Card();
		myCard.setSuite("Clubs");

	}

}
/*
 * All Variables on Java must be declared stating its type and name before they
 * can be used. A primitive data type on Java is a special keyword that is
 * already assigned to something, some examples are: byte, int, float and
 * Boolean. Use: Ctrl + shift + F for the auto formatter to run
 */