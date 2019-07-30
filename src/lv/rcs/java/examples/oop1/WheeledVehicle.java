package lv.rcs.java.examples.oop1;

public abstract class WheeledVehicle extends Vehicle {

	public abstract int getNumberOfWheels();

	public void printName() {
		System.out.println("Hello, I am WheeledVehicle");
	}

}
