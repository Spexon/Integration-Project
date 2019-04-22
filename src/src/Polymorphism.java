package src;
 
/**Makes use of polymorphism with my opinions about different consoles.
 * @author Vladimir Hardy
 */
public class Polymorphism {
  /** Method that uses polymorphism.
   * 
   */
  public static void polymorphism() {
    Console xbox = new Xbox();
    Console computer = new Computer();

    System.out.println("My preffered console is " + computer.showConsole());
    System.out.println("My favorite computer games are " + ComputerGame.myComputerGame());
    System.out.println("My brother loves to play " + xbox.showConsole());
    System.out.println("His favorite games to play are: " + XboxGame.broXboxGame());
    // System.out.println("But I think that " + xbox.xboxOpinion());
  }
}

