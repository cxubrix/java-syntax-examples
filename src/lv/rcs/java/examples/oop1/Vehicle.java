package lv.rcs.java.examples.oop1;

import java.util.Random;

public class Vehicle {
	
	Random r = new Random();
	
	@Override
	public String toString() {
		return prepareToString();
	}
	
	private String prepareToString() {
		return "Vehicle-" + r.nextInt(10);
	}
	
}
