package src;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Make main menu driven
		System.out.println("1. Introduction");
		System.out.println("2. Hangman");
		System.out.println("3. Cards");
		
		
		int menu = 0;
		Scanner input = new Scanner(System.in);
		menu = input.nextInt();
		switch (menu) {
		case 1:
			//call the other classes here
			break;
		case 2:
			//call the other classes here
			break;
		case 3:
			//call the other classes here
			break;
		default:
			System.out.println("Invalid number");
		}
		input.close();
	}
	
}
