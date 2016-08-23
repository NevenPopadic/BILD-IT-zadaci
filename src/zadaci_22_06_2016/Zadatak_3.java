package zadaci_22_06_2016;

import java.util.Scanner;

public class Zadatak_3 {
	/*
	 * (Algebra: quadratic equations) Design a class named QuadraticEquation for
	 * a quadratic equation ax2 + bx + x = 0. The class contains: Private data
	 * fields a, b, and c that represent three coefficients. A constructor for
	 * the arguments for a, b, and c. Three getter methods for a, b, and c. A
	 * method named getDiscriminant() that returns the discriminant, which is b2
	 * - 4ac. The methods named getRoot1() and getRoot2() for returning two
	 * roots of the equation (in java.pdf file) These methods are useful only if
	 * the discriminant is nonnegative. Let these methods return 0 if the
	 * discriminant is negative.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the values for a,b and c:");
		// pravljenje novog objekta @qe1 (Quadratic Equation) i unos a,b,c
		QuadraticEquation qe1 = new QuadraticEquation(input.nextDouble(),
				input.nextDouble(), input.nextDouble());
		input.close();
		// dobijanje diskriminante
		double discriminant = qe1.getDiscriminant();
		// ispitivanje vrijednosti diskriminante i ispis odgovarajuce poruke
		if (discriminant > 0) {
			System.out.printf("Root 1 = %.2f \nRoot 2 = %.2f", qe1.getRoot1(),
					qe1.getRoot2());
		} else if (discriminant == 0) {
			System.out.printf("Root = %.2f", qe1.getRoot1());
		} else {
			System.out.println("The equation has no roots.");
		}

	}

}

class QuadraticEquation {
	private double a;
	private double b;
	private double c;

	public QuadraticEquation(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getDiscriminant() {
		return ((b * b) - (4 * a * c));
	}

	public double getRoot1() {
		double discriminant = getDiscriminant();
		if (discriminant > 0) {
			return (-b + Math.sqrt(getDiscriminant())) / (a + a);
		} else {
			return 0;
		}
	}

	public double getRoot2() {
		double discriminant = getDiscriminant();
		if (discriminant > 0) {
			return (-b - Math.sqrt(getDiscriminant())) / (a + a);
		} else {
			return 0;
		}
	}
}