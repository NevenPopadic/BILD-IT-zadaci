package zadaci_22_06_2016;

import java.util.Scanner;

public class Zadatak_5 {
	/*
	 * (Geometry: intersecting point) Suppose two line segments intersect. The
	 * two endpoints for the first line segment are (x1, y1) and (x2, y2) and
	 * for the second line segment are (x3, y3) and (x4, y4). Write a program
	 * that prompts the user to enter these four endpoints and displays the
	 * intersecting point. As discussed in Programming Exercise 3.25, the
	 * intersecting point can be found by solving a linear equation. Use the
	 * LinearEquation class in Programming Exercise 9.11 to solve this equation.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// unos vrijednosti
		System.out.println("Enter the values for x1 and y1:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.println("Enter the values for x2 and y2:");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		System.out.println("Enter the values for x3 and y3:");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		System.out.println("Enter the values for x4 and y4:");
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();
		input.close();
		// racunanje tacaka
		double a = y1 - y2;
		double b = -(x1 - x2);
		double c = y3 - y4;
		double d = -(x3 - x4);
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;
		// kreiranje objekta
		LinearEquation le = new LinearEquation(a, b, c, d, e, f);
		// ispis rezultata
		if (le.isSolvable())
			System.out.printf("Intersection point is located at %.2f,%.2f",
					le.getX(), le.getY());
		else
			System.out.println("Lines are parallel.");
	}
}
