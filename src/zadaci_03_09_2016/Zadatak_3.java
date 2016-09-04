package zadaci_03_09_2016;

public class Zadatak_3 {
	/*
	 * (The Octagon class) Write a class named Octagon that extends
	 * GeometricObject and implements the Comparable and Cloneable interfaces.
	 * Assume that all eight sides of the octagon are of equal length. The area
	 * can be computed using the following formula: area = (2 + 4/22)* side *
	 * side Draw the UML diagram that involves Octagon, GeometricObject,
	 * Comparable, and Cloneable. Write a test program that creates an Octagon
	 * object with side value 5 and displays its area and perimeter. Create a
	 * new object using the clone method and compare the two objects using the
	 * compareTo method.
	 */

	public static void main(String[] args) {
		// kreiranje novog objekta
		Octagon o1 = new Octagon(5);
		// ispis povrsine objekta o1
		System.out.println("Area: " + o1.getArea());
		// ispis obima objekta o1
		System.out.println("Perimiter: " + o1.getPerimeter());
		// kloniranje objekta @o1 u @o2
		Octagon o2 = o1.clone();
		// poredjenje 2 objekta i ispis rezultata porednjenja
		if (o1.compareTo(o2) < 0)
			System.out.println("Octagon o2 is bigger.");
		else if (o1.compareTo(o2) > 0)
			System.out.println("Octagon o1 is bigger.");
		else
			System.out.println("Octagons are equals size.");

	}

}

class Octagon extends GeometricObject implements Cloneable,
		Comparable<GeometricObject> {

	private double side;

	// konstruktori
	public Octagon() {

	}

	public Octagon(double side) {
		this.side = side;

	}

	@Override
	// metoda za racunanje povrsine oktagona
	public double getArea() {
		return (2 + (4 / Math.sqrt(2)) * side * side);
	}

	// metoda za racunanje obima oktagona
	public double getPerimeter() {
		return 8 * side;
	}

	// metoda za kloniranje oktagona
	public Octagon clone() {
		Octagon temp = new Octagon(this.side);
		return temp;
	}

	// metoda za poredjenje objekata i da li su oni jednaki
	public int compareTo(Octagon o) {
		if (this.getArea() > o.getArea())
			return 1;
		else if (this.getArea() < o.getArea())
			return -1;
		else
			return 0;

	}

}