package src;

import java.util.Scanner;

public class Calculator { //basic calculator
	public static void main(String[]args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a numbers to add"); //addition of two numbers
	double addition1 = input.nextDouble();
	System.out.println("Enter a second numbers to add");
	double addition2 = input.nextDouble();
	double totalAddition = addition1 + addition2;
	System.out.println(totalAddition);
	
	System.out.println("Enter a number to subtract"); //subtraction of two numbers
	double subtraction1 = input.nextDouble();
	System.out.println("Enter a second numbers to subtract");
	double subtraction2 = input.nextDouble();
	double totalSubtraction = subtraction1 - subtraction2;
	System.out.println(totalSubtraction);
	
	System.out.println("Enter a number to multiply"); //multiplication of two numbers
	double multiply1 = input.nextDouble();
	System.out.println("Enter a second numbers to multiply");
	double multiply2 = input.nextDouble();
	double totalMultiplication = multiply1 * multiply2;
	System.out.println(totalMultiplication);
	
	System.out.println("Enter a number to divide"); //Division of two numbers
	double divide1 = input.nextDouble();
	System.out.println("Enter a second numbers to divide");
	double divide2 = input.nextDouble();
	double totalDivision = divide1 / divide2;
	System.out.println(totalDivision);
	
	input.close();
	}
}
