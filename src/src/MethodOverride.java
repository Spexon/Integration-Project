package src;

/** An example of method overriding.
 * @author Vladimir Hardy
 */
class MethodOverride extends Introduction {
  static void normalMethod() {
    System.out.println("This method overrides the normal method");
    System.out.println("The next two entities are in an overloaded method 'draw'");
  }

  public static void draw(String s) {
    String word = "Bicycle";
    System.out.println(word);
  }

  public static void draw(int i) {
    int number = 10;
    System.out.println(number);
  }
}