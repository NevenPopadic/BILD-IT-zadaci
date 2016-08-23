package zadaci_22_06_2016;

import java.util.Scanner;

public class Zadatak_4 {
	/*
	 * (Algebra: 2 * 2 linear equations) Design a class named LinearEquation for
	 * a 2 * 2 system of linear equations: ax + by = e cx + dy = f x = ed - bf
	 * ad - bc y = af - ec ad - bc The class contains: * Private data fields a,
	 * b, c, d, e, and f. * A constructor with the arguments for a, b, c, d, e,
	 * and f. * Six getter methods for a, b, c, d, e, and f. * A method named
	 * isSolvable() that returns true if ad - bc is not 0. * Methods getX() and
	 * getY() that return the solution for the equation.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the values for a,b,c,d,e and f:");
		// pravljenje novog objekta i unos vrijednosti a,b,c,d,e i f
		LinearEquation le1 = new LinearEquation(input.nextDouble(),
				input.nextDouble(), input.nextDouble(), input.nextDouble(),
				input.nextDouble(), input.nextDouble());
		input.close();
		// ispitivanje da li je moguce rijesiti jednacinu i ispis odgovarajuce
		// poruke
		if (le1.isSolvable())
			System.out.println("X = " + le1.getX() + "\nY= " + le1.getY());
		else
			System.out.println("The equation has no solution.");

	}

}
