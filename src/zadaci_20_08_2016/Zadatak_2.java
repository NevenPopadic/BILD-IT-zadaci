package zadaci_20_08_2016;

import java.util.Scanner;

public class Zadatak_2 {
	/*
	 * (Strictly identical arrays) The two-dimensional arrays m1 and m2 are
	 * strictly identical if their corresponding elements are equal. Write a
	 * method that returns true if m1 and m2 are strictly identical, using the
	 * following header: public static boolean equals(int[][] m1, int[][] m2)
	 * Write a test program that prompts the user to enter two 3 * 3 arrays of
	 * integers and displays whether the two are strictly identical.
	 */
	public static boolean equals(int[][] m1, int[][] m2) {
		for (int i = 0; i < m1.length; i++) {
			for (int y = 0; y < m1[i].length; y++) {
				// ukoliko se elementi na istim mjestima razlikuju matrice nisu
				// identicne i vracamo false
				if (m1[i][y] != m2[i][y])
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Unesite elemente u matricu m1:");
		int[][] m1 = newMatrix(3, 3);
		System.out.println("unesite elemente u matricu m2:");
		int[][] m2 = newMatrix(3, 3);
		// pozivamo metodu @equals, ukoliko su obe matrice identicne vraca nam
		// true, ukoliko nisu vraca false
		if (equals(m1, m2)) {
			System.out.println("The two arrays are strictly identical.");
		} else
			System.out.println("The two arrays are not strictly identical");

	}

	static Scanner input = new Scanner(System.in);

	// metoda za unos matrice m1 & m2
	private static int[][] newMatrix(int j, int k) {
		int[][] matrix = new int[j][k];
		for (int i = 0; i < matrix.length; i++) {
			for (int y = 0; y < matrix[i].length; y++) {
				matrix[i][y] = input.nextInt();
			}
		}
		return matrix;
	}

}
