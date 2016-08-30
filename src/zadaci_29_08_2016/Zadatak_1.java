package zadaci_29_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_1 {
	/*
	 * (Area of a convex polygon) A polygon is convex if it contains any line
	 * segments that connects two points of the polygon. Write a program that
	 * prompts the user to enter the number of points in a convex polygon, then
	 * enter the points clockwise, and display the area of the polygon.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of the points: ");
		// kreiranje array liste za X koordinate @coX i array liste za Y
		// koordinate @coY
		ArrayList<Double> coX = new ArrayList<Double>();
		ArrayList<Double> coY = new ArrayList<Double>();
		// unos broja tacaka @temp
		int temp = input.nextInt();
		System.out.println("Enter the coordinates of the points: ");
		// petlja za unos koordinata u nizove
		for (int i = temp; i > 0; i--) {
			coX.add(input.nextDouble());
			coY.add(input.nextDouble());
		}
		input.close();
		// deklarisanje @temp1 i @temp2 za smjestanje sume
		double temp1 = 0;
		double temp2 = 0;
		for (int y = 0; y < coX.size(); y++) {
			if (y != coX.size() - 1) {
				temp1 += coX.get(y) * coY.get(y + 1);
				temp2 += coX.get(y + 1) * coY.get(y);
			} else {
				temp1 += coX.get(y) * coX.get(0);
				temp2 += coX.get(0) * coY.get(y);
			}
		}
		// ispis povrsine
		System.out.println("The total area is " + (temp2 - temp1) / 2);

	}

}
