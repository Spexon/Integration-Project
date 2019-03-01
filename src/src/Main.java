package src;

import java.util.Scanner;
//Vladimir Hardy
//Menu for all the classes in my integration project

public class Main {

	public static void main(String[] args) {
		System.out.println("Choose an option below by typing a number to begin");
		System.out.println("1. Introduction");
		System.out.println("2. Hangman");
		System.out.println("3. Calculator");
		
		int menu = 0;
		Scanner input = new Scanner(System.in);
		menu = input.nextInt();
		switch (menu) {
		case 1:
			Introduction.main(args);
			break;
		case 2:
			Hangman.main(args);
			break;
		case 3:
			Calculator.main(args);
			break;
		default:
			System.out.println("Invalid selection, please type a number");
		}
		input.close();
	}
	
}
