package src;

import java.util.Random;

// Vladimir Hardy
// A program that chooses a random word for the Hangman game.
public class WordsForHangman {

  /** The main code that uses a random number to pick a word.
   * @param word for the user to guess.
   * @param restartNum the random number that picks a word.
   * @return returns the word that the user will need to guess.
   */
  public static String words(String word,String hint, int restartNum) {
    String word1 = "planet"; // ArrayList could work really well for this
    String word2 = "tiger";
    String word3 = "human";
    String word4 = "apple";
    String word5 = "shuttle";
    restartNum = numberGenerator();
    if (restartNum == 1) {
      word = word1;
    } else if (restartNum == 2) {
      word = word2;
    } else if (restartNum == 3) {
      word = word3;
    } else if (restartNum == 4) {
      word = word4;
    } else {
      word = word5;
    }
    // System.out.println(restartNum);
    // System.out.println(word);
    return word;
  }

  /**Picks a random number and brings it over to the words method.
   * @return returns the random number to be used to pick a random word.
   */
  public static int numberGenerator() { // Use this to pick a random word from the list
    Random rndNum = new Random();
    int restartNum = rndNum.nextInt(5) + 1;
    return restartNum;
  }
}
