package zadaci_03_09_2016;

public class Zadatak_1 {
	/*
	 * (Enable Circle comparable) Rewrite the Circle class in Listing 13.2 to
	 * extend GeometricObject and implement the Comparable interface. Override
	 * the equals method in the Object class. Two Circle objects are equal if
	 * their radii are the same. Draw the UML diagram that involves Circle,
	 * GeometricObject, and Comparable.
	 */

	public static void main(String[] args) {
		// pravimo 2 objekta
		Circle c1 = new Circle(6.9);
		Circle c2 = new Circle(6.9);
		// pozivamo metodu da provjeri da li su jednaki
		if (c1.compareTo(c2) == 0)
			System.out.print("Circles are equal.");
		else
			System.out.print("Circles are not equal.");

	}

}

abstract class GeometricObject implements Comparable<GeometricObject> {

	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	// konstruktori
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}

	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	// getteri/setteri
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	// metoda koja olaksava stampanje
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color
				+ " and filled: " + filled;
	}

	public abstract double getArea();

	// metoda koja poredi dva objekta
	public int compareTo(GeometricObject go) {
		if (this.getArea() > go.getArea())
			return 1;
		else if (this.getArea() < go.getArea())
			return -1;
		else
			return 0;
	}

	// metoda koja poredi povrsinu dva objekta i vraca veci
	public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
		if (o1.compareTo(o2) == 1)
			return o1;
		else
			return o2;
	}
}

class Circle extends GeometricObject {

	private double radius;

	// konstruktori
	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}

	// getteri/setteri
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

	// metoda za racunanje precnika
	public double getDiameter() {
		return 2 * radius;
	}

	// za racunanje obima
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	// metoda za olaksavanje pri stampanju
	public String toString() {
		return "circle with radius of: " + this.radius;

	}

}