package src;

// Vladimir Hardy
// Class demonstration with Gets, Sets, and Constructors
public class Car {

	private String modelOfCar;
	private String makeOfCar;
	private int yearOfCar;
	int maxSpeed = 180;

	// Mutator Methods
	public void setModelOfCar(String model) { // can be any letter for setting a variable
		modelOfCar = model;
	}

	public void setMakeOfCar(String makeOfCar) { // constructor variables don't have to be descriptive
		this.makeOfCar = makeOfCar;
	}

	public void setYearOfCar(int year) {
		yearOfCar = year;
	}

	// Accessor Methods
	public String getModelOfCar() {
		return modelOfCar;
	}

	public String getMakeOfCar() {
		return makeOfCar;
	}

	public int getYearOfCar() {
		return yearOfCar;
	}

	public Car() { // Constructor without parameters
		// this will return null
	}

	public Car(String model, String make, int year) { // Constructor with parameters
		modelOfCar = model;
		makeOfCar = make;
		yearOfCar = year;
	}

	public static void car() {
		Car myCar = new Car("SUV", "Ford", 2015);
		System.out.print("The make of my car is " + myCar.modelOfCar);
		System.out.print(", the Model is " + myCar.modelOfCar);
		System.out.println(", and the year is " + myCar.yearOfCar + ".");
		/*
		 * This Works the same way as the constructor above with parameters!
		 * myCar.setMakeOfCar("SUV"); myCar.setModelOfCar("Ford");
		 * myCar.setYearOfCar(2015);
		 * System.out.print("The make of my car is "+myCar.getMakeOfCar());
		 * System.out.print(", the Model is "+myCar.getModelOfCar());
		 * System.out.println(", and the year is "+myCar.getYearOfCar()+".");
		 */
	}
}

class SUV extends Car {
	int maxSpeed = 140;

	void pimpedOutSUV() {
		System.out.println("My pimped out SUV drives " + super.maxSpeed + " miles per hour");
	}

	void normalSUV() {
		System.out.println("The average SUV drives up to " + maxSpeed + " miles per hour");
	}
}
