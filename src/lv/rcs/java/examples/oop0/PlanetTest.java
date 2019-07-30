package lv.rcs.java.examples.oop0;

public class PlanetTest {
	public static void main(String[] args) {
		
		Planet planet = Planet.EARTH;
		System.out.println("planet: " + planet);
		
		planet = Planet.JUPITER;
		System.out.println("planet: " + planet);
		System.out.println("planet radius: " + planet.radius);

	}
}
