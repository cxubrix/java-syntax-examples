package lv.rcs.java.examples.oop2;

public abstract class AbstractColoredShap implements Shape, HasColor {

	@Override
	public String getColor() {
		return "Unknown";
	}
	
	
}
