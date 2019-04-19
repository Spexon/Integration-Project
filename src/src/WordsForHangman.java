package src;

import java.util.Random;

//Vladimir Hardy
//A program that chooses a random word for the Hangman game.
public class WordsForHangman {

	public static String words(String word,String[] wordArray, int restartNum) {
		String word1 = "planet"; //ArrayList could work really well for this
		String word2 = "tiger";
		String word3 = "human";
		String word4 = "apple";
		String word5 = "shuttle";
		restartNum = numberGenerator();
		
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
		//System.out.println(restartNum);
		//System.out.println(word);
		return word;
	}

	public static int numberGenerator() { // Use this to pick a random word from the list
		Random rndNum = new Random();
		int restartNum = rndNum.nextInt(5)+1;
		return restartNum;
	}
}
