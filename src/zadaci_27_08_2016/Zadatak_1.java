package zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_1 {
	/*
	 * (Largest rows and columns) Write a program that randomly fills in 0s and
	 * 1s into an n-by-n matrix, prints the matrix, and finds the rows and
	 * columns with the most 1s. (Hint: Use two ArrayLists to store the row and
	 * column indices with the most 1s.)
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the array size n: ");
		// unos velicine matrice
		int n = input.nextInt();
		input.close();
		int[][] matrix = new int[n][n];
		System.out.println("The random array is");
		// unos random elemenata u matricu (0 ili 1)
		for (int i = 0; i < matrix.length; i++) {
			for (int y = 0; y < matrix[i].length; y++) {
				matrix[i][y] = (int) (Math.round(Math.random() * 1));
				System.out.print(matrix[i][y]);
			}
			System.out.println();
		}
		// pozivanje metode
		largestRC(matrix);
	}

	private static void largestRC(int[][] matrix) {
		// pravljenje 2 @temp arraya
		ArrayList<Integer> temp1 = new ArrayList<>();
		ArrayList<Integer> temp2 = new ArrayList<>();
		// varijable @rowMax/columnMax za smjestanje najveceg reda/kolone
		int rowMax = 0;
		int columnMax = 0;
		// varijable @sumRow/sumColumn za smjestanje sume trenutnog reda/kolone
		int sumRow, sumColumn;
		// petlje za prolazak kroz redove i kolone
		for (int i = 0; i < matrix.length; i++) {
			sumRow = 0;
			sumColumn = 0;

			for (int y = 0; y < matrix[i].length; y++) {
				sumRow += matrix[i][y];
				sumColumn += matrix[y][i];
			}
			// izrazi za poradjenje sume i trenutnog najveceg reda/kolone
			if (rowMax < sumRow) {
				temp1.clear();
				rowMax = sumRow;
				temp1.add(i);
			} else if (rowMax == sumRow)
				temp1.add(i);
			if (columnMax < sumColumn) {
				temp2.clear();
				columnMax = sumColumn;
				temp2.add(i);
			} else if (columnMax == sumColumn)
				temp2.add(i);

		}
		// ispis indexa najveceg reda
		System.out.println("Largest row index: ");
		for (int i : temp1) {
			System.out.print(i + " ");
		}
		// ispis indexa najvece kolone
		System.out.println("\nThe largest column index: ");
		for (int y : temp2) {
			System.out.print(y + " ");
		}

	}
}
