package src;

class SUv extends Car {
  int maxSpeed = 140;

  void pimpedOutSUv() {
    System.out.println("My pimped out SUV drives " + super.maxSpeed + " miles per hour");
  }

  void normalSUv() {
    System.out.println("The average SUV drives up to " + maxSpeed + " miles per hour");
  }
}