package zadaci_02_09_2016;

public class Zadatak_2 {

	/*
	 * (Enable GeometricObject comparable) Modify the GeometricObject class to
	 * implement the Comparable interface, and define a static max method in the
	 * GeometricObject class for finding the larger of two GeometricObject
	 * objects. Draw the UML diagram and implement the new GeometricObject
	 * class. Write a test program that uses the max method to find the larger
	 * of two circles and the larger of two rectangles.
	 */

	public static void main(String[] args) {
		// kreiranje objekata @Circle
		GeometricObject circle1 = new Circle(2.1);
		GeometricObject circle2 = new Circle(4.2);
		// kreiranje objekata @Rectangle
		GeometricObject rectangle1 = new Rectangle(4.0, 2.5);
		GeometricObject rectangle2 = new Rectangle(3.7, 3.4);
		// stampanje rezultata
		System.out.println("Bigger is "
				+ GeometricObject.max(circle1, circle2).toString());
		System.out.println("Bigger is "
				+ GeometricObject.max(rectangle1, rectangle2));

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

class Circle extends GeometricObject implements Colorable {

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

	public String howToColor() {
		return "Color it around the border.";
	}

}

class Rectangle extends GeometricObject implements Colorable {

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
