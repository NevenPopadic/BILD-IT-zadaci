package zadaci_18_08_2016;

import java.util.Scanner;

public class Zadatak_4 {
	/*
	 * (Sum elements column by column) Write a method that returns the sum of
	 * all the elements in a specified column in a matrix using the following
	 * header: public static double sumColumn(double[][] m, int columnIndex)
	 */
	public static double sumColumn(double[][] m, int columnIndex) {
		// varijabla @sum za smjestanje zbira elemenata iz trenutne kolone
		double sum = 0;
		// petlja za prolazak kroz redove
		for (int i = 0; i < m.length; i++) {
			sum += m[i][columnIndex];
		}
		// vracanje sume
		return sum;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// deklarisanje matrice
		double[][] matrix = new double[3][4];
		// petlja za prolazak kroz redove
		for (int i = 0; i < matrix.length; i++) {
			System.out.println("Unesite brojeve u red " + i + ":");
			// petlja za prolazak kroz brojeve u redu
			for (int y = 0; y < matrix[i].length; y++) {
				// unos elemenata u matricu od strane korisnika
				matrix[i][y] = input.nextDouble();
			}
		}
		input.close();
		// prolazak kroz kolone matrice i pozivanje @sumColumn metode
		for (int i = 0; i < matrix[0].length; i++) {
			System.out.println("Sum of elements at column " + i + " is "
					+ sumColumn(matrix, i));
		}
	}
}
