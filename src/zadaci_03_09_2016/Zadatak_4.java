package zadaci_03_09_2016;

public class Zadatak_4 {
	/*
	 * (Sum the areas of geometric objects) Write a method that sums the areas
	 * of all the geometric objects in an array. The method signature is: public
	 * static double sumArea(GeometricObject[] a). Write a test program that
	 * creates an array of four objects (two circles and two rectangles) and
	 * computes their total area using the sumArea method.
	 */
	public static double sumArea(GeometricObject[] a) {
		// temp varijabla za smjestanje sume
		double temp = 0;
		// petlja za prolazak kroz listu koja poziva metodu @getArea i dodaje
		// rezultat te metode na temp
		for (GeometricObject geometricObject : a) {
			temp += geometricObject.getArea();
		}
		return temp;

	}

	public static void main(String[] args) {
		// kreiramo objekte c1/c2 za krugove
		Circle c1 = new Circle(6.9);
		Circle c2 = new Circle(6.9);
		// kreiramo objekte r1/r2 za pravougaonike
		Rectangle r1 = new Rectangle(6.9, 3.4);
		Rectangle r2 = new Rectangle(6.9, 3.4);
		// pravimo niz objekata @array
		GeometricObject[] array = { c1, c2, r1, r2 };
		// pozivanje metode i ispis rezultata
		System.out.printf("Total area of these 4 objects is: %.2f",
				sumArea(array));

	}
}
