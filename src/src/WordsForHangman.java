package src;

import java.util.Random;

//Vladimir Hardy
//A program that chooses a random word for the Hangman game.
public class WordsForHangman {

	public static String words(String word,String[] wordArray, int restartNum) {
		String word1 = "Planet"; //ArrayList could work really well for this
		String word2 = "Tiger";
		String word3 = "Human";
		String word4 = "Apple";
		String word5 = "Shuttle";
		String[] wordArray1 = {"P","l","a","n","e","t"};
		String[] wordArray2 = {"T","i","g","e","r"};
		String[] wordArray3 = {"H","u","m","a","n"};
		String[] wordArray4 = {"A","p","p","l","e"};
		String[] wordArray5 = {"S","h","u","t","t","l","e"};
		restartNum = numberGenerator();
		System.out.println(restartNum);
		if (restartNum == 1) {
			word = word1;
			//wordArray[] = wordArray1[]; //can't change size of array?
		}
		else if (restartNum == 2) {
			word = word2;
		}
		else if (restartNum == 3) {
			word = word3;
		}
		else if (restartNum == 4) {
			word = word4;
		}
		else {
			word = word5;
		}
		System.out.println(word);
		return word;
	}

	public static int numberGenerator() { // Use this to pick a random word from the list
		Random rndNum = new Random();
		int restartNum = rndNum.nextInt(5)+1;
		return restartNum;
	}
}
