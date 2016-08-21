package zadaci_20_08_2016;

import java.util.Scanner;

public class Zadatak_5 {
	/*
	 * (The Location class) Design a class named Location for locating a maximal
	 * value and its location in a two-dimensional array. The class contains
	 * public data fields row, column, and maxValue that store the maximal value
	 * and its indices in a two-dimensional array with row and column as int
	 * types and maxValue as a double type. Write the following method that
	 * returns the location of the largest element in a two-dimensional array:
	 * public static Location locateLargest(double[][] a)
	 * 
	 * The return value is an instance of Location. Write a test program that
	 * prompts the user to enter a two-dimensional array and displays the
	 * location of the largest element in the array.
	 */
	public static Location locateLargest(double[][] a) {
		// ukoliko posaljemo praznu matricu vraca nam null
		if (a == null) {
			System.out.println("Array is empty.");
			return null;
		}
		// pravljenje @location1 za smjestanje najveceg broja
		Location location1 = new Location();
		// petlja koja poredi trenutni najveci sa iducim brojem u matrici
		for (int i = 0; i < a.length; i++) {
			for (int y = 0; y < a[i].length; y++) {
				if (a[i][y] > location1.maxValue) {
					location1.maxValue = a[i][y];
					location1.row = i;
					location1.column = y;
				}
			}
		}
		return location1;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns in the "
				+ "array:");
		// deklarisanje matrice i odredjivanje velicine od strane korisnika
		double[][] matrix = new double[input.nextInt()][input.nextInt()];
		System.out.println("Enter the array:");
		// unos elemenata u matricu
		for (int i = 0; i < matrix.length; i++) {
			for (int y = 0; y < matrix[i].length; y++) {
				matrix[i][y] = input.nextDouble();
			}
		}
		input.close();
		// pozivanje metode i smjestanje rezultata u @result
		Location result = locateLargest(matrix);
		// ispis rezultata
		System.out.printf("The location of the largest element is %.1f at "
				+ "(%d,%d)",result.maxValue, result.row, result.column);
	}
}

class Location {
	public int row;
	public int column;
	public double maxValue;
}
