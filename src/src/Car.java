package src;

//Vladimir Hardy
//Class demonstration with Gets and Sets
public class Car {

	private String modelOfCar; 
	private String makeOfCar;
	private int yearOfCar;
	
	public void setModelOfCar(String model) { //can be any letter for setting a variable
		modelOfCar = model;
	}
	public void setMakeOfCar(String make) {
		makeOfCar = make;
	}
	public void setYearOfCar(int year) {
		yearOfCar = year;
	}
	
	public String getModelOfCar() {
		return modelOfCar;
	}
	public String getMakeOfCar() {
		return makeOfCar;
	}
	public int getYearOfCar() {
		return yearOfCar;
	}
	
	public Car() {
		System.out.println("I am in the constructor");
	}
	
	public static void car() {
		Car myCar = new Car();
		System.out.println(myCar);
	}
	              
			
}
