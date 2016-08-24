package zadaci_23_08_2016;

public class Zadatak_3 {
	/*
	 * (The MyPoint class) Design a class named MyPoint to represent a point
	 * with x- and y-coordinates. The class contains: * The data fields x and y
	 * that represent the coordinates with getter methods. * A no-arg
	 * constructor that creates a point (0, 0). * A constructor that constructs
	 * a point with specified coordinates. * A method named distance that
	 * returns the distance from this point to a specified point of the MyPoint
	 * type. * A method named distance that returns the distance from this point
	 * to another point with specified x- and y-coordinates.
	 */

	public static void main(String[] args) {
		// kreiranje dva objekta pomocu klase @MyPoint
		MyPoint point1 = new MyPoint();
		MyPoint point2 = new MyPoint(5.4, 13);
		// ispis tacaka prvog i drugog objekta i racunanje njihove udaljenosti
		// pomocu @distance metode iz MyPoint klase
		System.out.printf("Distance between point (" + point1.getX() + ","
				+ point1.getY() + ") and point (" + point2.getX() + ","
				+ point2.getY() + ") is %.2f", point1.distance(point2));
	}
}

class MyPoint {
	private double x, y;

	public MyPoint() {
		this(0, 0);
	}

	public MyPoint(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	// metoda za racunanje udaljenosti prve i druge tacke
	public double distance(double x, double y) {
		return Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2));
	}

	public double distance(MyPoint location) {
		return distance(location.getX(), location.getY());

	}
}