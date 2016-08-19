package zadaci_18_08_2016;

import java.util.Scanner;

public class Zadatak_5 {
	/*
	 * (Algebra: add two matrices) Write a method to add two matrices. The
	 * header of the method is as follows: public static double[][]
	 * addMatrix(double[][] a, double[][] b)
	 */
	static Scanner input = new Scanner(System.in);

	public static double[][] addMatrix(double[][] a, double[][] b) {
		// pravljenje @temp privremene matrice
		double[][] temp = new double[a.length][b.length];
		// petlja za unos elemenata iz matrice a i b u matricu temp (sabiranjem)
		for (int i = 0; i < a.length; i++) {
			for (int y = 0; y < a[i].length; y++)
				temp[i][y] = a[i][y] + b[i][y];
		}
		// slanje @temp matrice nazad
		return temp;
	}

	public static void main(String[] args) {
		// deklarisanje matrica 1 i 2
		System.out.println("Enter matrix1:");
		// pozivanje @newMatrix metode za unos elemenata u prvu matricu
		double[][] matrix1 = newMatrix(3, 3);
		System.out.println("Enter matrix2:");
		// pozivanje @newMatrix metode za unos elemenata u drugu matricu
		double[][] matrix2 = newMatrix(3, 3);
		// kreiranje @sum matrice i pozivanje metode za sabiranje
		double[][] matrixSum = addMatrix(matrix1, matrix2);
		System.out.println("The matrices are added as follows");
		// ispis rezultata
		// petlja za prolaz kroz redove
		for (int i = 0; i < matrixSum.length; i++) {
			// ispis elemenata prve matrice
			for (int y = 0; y < matrixSum[i].length; y++) {
				System.out.print(matrix1[i][y] + " ");
			}
			// ukoliko je drugi red stavljamo "plus"
			if (i == 1) {
				System.out.print("  +   ");
			} else {
				System.out.print("      ");
			}
			// ispis elemenata druge matrice
			for (int x = 0; x < matrix2[i].length; x++) {
				System.out.print(matrix2[i][x] + " ");
			}
			// ukoliko je drugi red stavljamo "jednako"
			if (i == 1) {
				System.out.print("  =   ");
			} else {
				System.out.print("      ");
			}
			// ispis elemenata @sum matrice
			for (int z = 0; z < matrixSum[i].length; z++) {
				System.out.print(matrixSum[i][z] + " ");
			}
			// prelazak u novi red
			System.out.println();
		}

	}

	private static double[][] newMatrix(int a, int b) {
		// pravljenje @temp matrice
		double[][] temp = new double[a][b];
		// petlja za unos elemenata u matricu
		for (int i = 0; i < temp.length; i++) {
			System.out.println("Unesite brojeve u red " + i + ":");
			for (int y = 0; y < temp[i].length; y++) {
				// unos elemenata u matricu od strane korisnika
				temp[i][y] = input.nextDouble();
			}
		}
		// slanje matrice nazad
		return temp;
	}
}
