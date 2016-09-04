package zadaci_03_09_2016;

import zadaci_03_09_2016.GeometricObject;

public class Zadatak_2 {
	/*
	 * (Enable Rectangle comparable) Rewrite the Rectangle class in Listing 13.3
	 * to extend GeometricObject and implement the Comparable interface.
	 * Override the equals method in the Object class. Two Rectangle objects are
	 * equal if their areas are the same. Draw the UML diagram that involves
	 * Rectangle, GeometricObject, and Comparable.
	 */

	public static void main(String[] args) {
		// pravimo 2 objekta
		Rectangle r1 = new Rectangle(6.9, 3.4);
		Rectangle r2 = new Rectangle(6.9, 3.4);
		// pozivamo metodu da provjeri da li su jednaki
		if (r1.compareTo(r2) == 0)
			System.out.print("Circles are equal.");
		else
			System.out.print("Circles are not equal.");
	}

}

class Rectangle extends GeometricObject {

	private double height;
	private double width;

	// konstruktori
	public Rectangle() {
	}

	public Rectangle(double Width, double Height) {
		this.height = Width;
		this.width = Height;
	}

	public Rectangle(double Width, double Height, String Color, boolean Filled) {
		this.height = Width;
		this.width = Height;
		setColor(Color);
		setFilled(Filled);
	}

	// getteri/setteri
	public double getWidth() {
		return height;
	}

	public double getHeight() {
		return width;
	}

	public void setHeight(double Height) {
		this.width = Height;
	}

	// metoda za povrsinu
	public double getArea() {
		return height * width;
	}

	// metoda za obim
	public double getPerimeter() {
		return 2 * (height + width);
	}

	// to string metoda
	public String toString() {
		return "recatangle with width of: " + this.width + " and height of: "
				+ this.height;
	}

	public String howToColor() {
		return "Color all four sides. (2x a and 2x b)";
	}
}