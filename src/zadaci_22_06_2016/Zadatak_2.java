package zadaci_22_06_2016;

public class Zadatak_2 {
	/*
	 * (Geometry: n-sided regular polygon) In an n-sided regular polygon, all
	 * sides have the same length and all angles have the same degree (i.e., the
	 * polygon is both equilateral and equiangular). Design a class named
	 * RegularPolygon that contains: * A private int data field named n that
	 * defines the number of sides in the polygon with default value 3. * A
	 * private double data field named side that stores the length of the side
	 * with default value 1. * A private double data field named x that defines
	 * the x-coordinate of the polygon’s center with default value 0. * A
	 * private double data field named y that defines the y-coordinate of the
	 * polygon’s center with default value 0. * A no-arg constructor that
	 * creates a regular polygon with default values. * A constructor that
	 * creates a regular polygon with the specified number of sides and length
	 * of side, centered at (0, 0). * A constructor that creates a regular
	 * polygon with the specified number of sides, length of side, and x- and
	 * y-coordinates. * The accessor and mutator methods for all data fields. *
	 * The method getPerimeter() that returns the perimeter of the polygon. *
	 * The method getArea() that returns the area of the polygon.
	 */

	public static void main(String[] args) {
		// pravljenje objekata
		RegularPolygon object1 = new RegularPolygon();
		RegularPolygon object2 = new RegularPolygon(4, 4);
		RegularPolygon object3 = new RegularPolygon(10, 4, 5.6, 7.8);
		// stampanje rezultata
		System.out.printf(
				"Polygon 1 has perimiter of " + object1.getPerimiter()
						+ ", and area of %.2f.", object1.getArea());
		System.out.printf(
				"\nPolygon 2 has perimiter of " + object2.getPerimiter()
						+ ", and area of %.2f.", object2.getArea());
		System.out.printf(
				"\nPolygon 3 has perimiter of " + object3.getPerimiter()
						+ ", and area of %.2f.", object3.getArea());

	}
}

class RegularPolygon {
	private int n = 3;
	private double side = 1;
	private double x = 0;
	private double y = 0;

	public RegularPolygon() {

	}

	public RegularPolygon(int n, double side) {
		this(n, side, 0, 0);
	}

	public RegularPolygon(int n, double side, double x, double y) {
		super();
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getPerimiter() {
		return this.n * this.side;
	}

	public double getArea() {
		return ((this.n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / this.n)));
	}

}
