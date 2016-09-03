package zadaci_02_09_2016;

public class Zadatak_4 {
	/*
	 * (The Colorable interface) Design an interface named Colorable with a void
	 * method named howToColor(). Every class of a colorable object must
	 * implement the Colorable interface. Design a class named Square that
	 * extends GeometricObject and implements Colorable. Implement howToColor to
	 * display the message Color all four sides. Draw a UML diagram that
	 * involves Colorable, Square, and GeometricObject. Write a test program
	 * that creates an array of five GeometricObjects. For each object in the
	 * array, display its area and invoke its howToColor method if it is
	 * colorable.
	 */

	public static void main(String[] args) {
		// lista objekata @shapes
		GeometricObject[] shapes = new GeometricObject[5];
		// dodjeljivanje shapeova u listu
		shapes[0] = new Rectangle(3.5, 4.3);
		shapes[1] = new Circle(5);
		shapes[2] = new Square(5);
		shapes[3] = new Circle(6);
		shapes[4] = new Square(8);
		// prolazak kroz petlju i ispisivanje povrsine svakog objekta
		for (int i = 0; i < shapes.length; i++) {
			System.out.println("Shape " + (i + 1) + " has area of: "
					+ shapes[i].getArea());
			if (shapes[i] instanceof Colorable) {
				System.out.println("How to color it: "
						+ ((Colorable) shapes[i]).howToColor());
			} else {
				System.out.println("Can't color it.");
			}
		}

	}

}

class Square extends GeometricObject implements Colorable {

	private double side;

	// konstruktori
	Square() {

	}

	Square(double side) {

		this.side = side;
	}

	// metoda za povrsinu
	public double getArea() {
		return side * side;
	}

	// howToColor metoda koja prosljedjuje poruku
	public String howToColor() {
		return "Color all four sides.";
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
}

// @Colorable interface
interface Colorable {

	String howToColor();
}