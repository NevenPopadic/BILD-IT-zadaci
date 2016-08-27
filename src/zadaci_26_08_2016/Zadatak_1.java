package zadaci_26_08_2016;

import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// pravimo novi objekat @triangle1 i unosimu mu vrijednosti stranica
		System.out.println("Enter 3 sides of a triangle: ");
		Triangle triangle1 = new Triangle(input.nextDouble(),
				input.nextDouble(), input.nextDouble());
		// dodjeljujemo mu boju
		System.out.println("Insert the color of triangle: ");
		triangle1.setColor(input.next());
		// pitamo korisnika da li je puni trougao
		System.out.println("Is triangle filled (y/n)?");
		char user = input.next().charAt(0);
		if (user == 'y' || user == 'Y')
			triangle1.setFilled(true);
		else
			triangle1.setFilled(false);

		input.close();
		// ispis
		System.out.println(triangle1.toString());

	}

}

class Triangle extends GeometricObject {
	// pravljenje varijabli za stranice
	private double side1 = 1.0, side2 = 1.0, side3 = 1.0;

	Triangle() {
		this(1, 1, 1);
	}

	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	// getteri
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	// racunamo povrsinu
	public double getArea() {
		double A = getPerimeter() / 2;
		return Math.sqrt(A * (A - side1) * (A - side2) * (A - side3));

	}

	// racunamo obim
	public double getPerimeter() {
		return side1 + side2 + side3;

	}

	@Override
	public String toString() {
		return super.toString() + "\nTriangle: side1 = " + side1 + " side2 = "
				+ side2 + " side3 = " + side3 + "\nArea: " + getArea()
				+ "\nPerimiter: " + getPerimeter();

	}

}

class GeometricObject {
	// deklarisanje varijabli za klasu GeometricObject
	private String color;
	private boolean filled;
	private java.util.Date dateCreated;

	// konstruktori
	public GeometricObject() {
		this("white");
	}

	public GeometricObject(String color) {
		// kada pozovemo konstruktor @dateCreated dobija trenutni datum i
		// vrijeme
		dateCreated = new java.util.Date();
		this.color = color;
	}

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

	@Override
	public String toString() {
		return "Object is created on " + getDateCreated() + ", it's color is "
				+ this.getColor() + " and is filled: " + this.filled;

	}

}
