package zadaci_20_08_2016;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak_1 {
	/*
	 * (Row sorting) Implement the following method to sort the rows in a
	 * twodimensional array. A new array is returned and the original array is
	 * intact. public static double[][] sortRows(double[][] m) Write a test
	 * program that prompts the user to enter a 3 * 3 matrix of double values
	 * and displays a new row-sorted matrix.
	 */
	public static double[][] sortRows(double[][] m) {
		double[] temp = new double[m.length];
		for (int i = 0; i < m.length; i++) {
			for (int y = 0; y < m[i].length; y++) {
				temp[y] = m[i][y];
			}
			Arrays.sort(temp);
			for (int x = 0; x < m.length; x++) {
				m[i][x] = temp[x];
			}
		}
		return m;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// deklarisanje matrice 3x3
		double[][] matrix = new double[3][3];
		System.out.println("Unesite 3x3 matricu:");
		// unos vrijednosti matrice 3x3 od strane korisnika
		for (int i = 0; i < matrix.length; i++) {
			for (int y = 0; y < matrix[i].length; y++) {
				matrix[i][y] = input.nextDouble();
			}
		}
		input.close();
		// kreiranje nove matrice i smijestanje sortirane matrice u nju pomocu
		// metode @sortRows
		double[][] sortedArray = sortRows(matrix);
		// ispis sortirane matrice
		for (double[] ds : sortedArray) {
			for (double d : ds) {
				System.out.print(d + " ");
			}
			System.out.println();
		}
	}
}
