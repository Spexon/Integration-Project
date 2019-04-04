package src;

import java.util.InputMismatchException;
import java.util.Scanner;

// Vladimir Hardy
// Menu for all the classes in my integration project

public class Main {

  public static void main(String[] args) {
	Boolean tryAgain = true;
	Scanner input = new Scanner(System.in);
	while (tryAgain) {
	    System.out.println("Choose an option below by typing a number to begin");
	    System.out.println("1. Introduction");
	    System.out.println("2. Hangman");
	    System.out.println("3. Calculator");
	    System.out.println("4. Car");
	
	    int menu = 0;
	    
	    try {
	    menu = input.nextInt();
	    }
	    catch (InputMismatchException ex) { //Specific exception handling
	    	System.out.println("Please enter a whole number");
	    	input.nextLine(); //Gets rid of garbage input
	    }
	    catch(Exception ex) { //More general exception
	    	System.out.println("Please enter a whole number");
	    	input.nextLine();
	    }
	    switch (menu) {
	      case 1:
	
	        Introduction.intro();
	        Introduction.normalMethod();
	        MethodOverride.normalMethod();
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
	      default:
	        System.out.println("Invalid selection, please type a number");
	    }
	    System.out.println("Would you like to try again? (yes or no)");
	    String restart = input.nextLine();
	    if (restart.equals("yes")) {
	    	tryAgain = true;
	    	input.reset();
	    }
	    else {
	    	System.out.println("Have a nice day!");
	    	tryAgain = false;
	    }
	}
	input.close();
  }
}