package zadaci_02_09_2016;

public class Zadatak_3 {
	/*
	 * (The ComparableCircle class) Define a class named ComparableCircle that
	 * extends Circle and implements Comparable. Draw the UML diagram and
	 * implement the compareTo method to compare the circles on the basis of
	 * area. Write a test class to find the larger of two instances of
	 * ComparableCircle objects.
	 */

	public static void main(String[] args) {
		// pravimo 2 objekta @circle
		ComparableCircle circle1 = new ComparableCircle(4.3);
		ComparableCircle circle2 = new ComparableCircle(5.7);
		// pozivamo metodu compareTo iz klase ComparableCricle da poredimo
		// krugove i ispisujemo poruku na osnovi toga
		if (circle1.compareTo(circle2) == 0) {
			System.out.println("Both circles are equal in size.");
		} else if (circle1.compareTo(circle2) > 0) {
			System.out.println("Circle1 is bigger than circle2.");
		} else {
			System.out.println("Circle2 is bigger than circle1.");
		}
	}

}

class ComparableCircle extends Circle implements Comparable<GeometricObject> {
	// konstruktor
	public ComparableCircle(double r) {
		super(r);
	}

	// metoda za poredjenje povrsine krugova
	public int compareTo(ComparableCircle compare) {
		if (getArea() == compare.getArea())
			return 0;
		else if (getArea() > compare.getArea())
			return 1;
		else
			return -2;
	}

}