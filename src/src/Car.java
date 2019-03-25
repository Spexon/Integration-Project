package src;

// Vladimir Hardy
// Class demonstration with Gets, Sets, and Constructors
public class Car {

  private String modelOfCar;
  private String makeOfCar;
  private int yearOfCar;
  int maxSpeed = 180;
//Mutator Methods
  public void setModelOfCar(String model) { // can be any letter for setting a variable
    modelOfCar = model; 
  }

  public void setMakeOfCar(String makeOfCar) { //constructor variables don't have to be descriptive
    this.makeOfCar = makeOfCar;
  }

  public void setYearOfCar(int year) {
    yearOfCar = year;
  }
//Accessor Methods
  public String getModelOfCar() {
    return modelOfCar;
  }

  public String getMakeOfCar() {
    return makeOfCar;
  }

  public int getYearOfCar() {
    return yearOfCar;
  } 

  public Car() { //Constructor without parameters
    //this will return null
  }
  
  public Car(String model, String make, int year) { //Constructor with parameters
    model = modelOfCar;
    make = makeOfCar;
    year = yearOfCar;
  }
  
  public static void car() { 
    Car myCar = new Car("SUV", "Ford", 2015); 
    System.out.println(myCar);
    //Car momsCar = new Car("Ford");
    
  }
}
class SUV extends Car {
  static int maxSpeed = 120;
  static void pimpedOutSUV() {
    System.out.println("My pimped out SUV drives " + super.maxSpeed + " miles per hour");
  }
}
