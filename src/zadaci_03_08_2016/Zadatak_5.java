package zadaci_03_08_2016;

import java.util.Scanner;

public class Zadatak_5 {
	public static double[][] sortRows(double[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int y = 0; y < array[i].length - 1; y++) {
				if (array[i][y] > array[i][y + 1]) {
					double temp = array[i][y];
					array[i][y] = array[i][y + 1];
					array[i][y + 1] = temp;
				}
			}
		}
		return array;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj redova i broj kolona: ");

		double[][] matrix = new double[input.nextInt()][input.nextInt()]; //kreiranje matrice

		for (int i = 0; i < matrix.length; i++) {
			System.out.println("Unesite (" + matrix.length
					+ ") elemente u red " + (i + 1) + " ");
			for (int y = 0; y < matrix[i].length; y++) {
				matrix[i][y] = input.nextDouble(); //smjestanje elemenata u matricu
			}
		}
		input.close();
		double[][] matrixSort = new double[matrix.length][matrix[0].length];
		matrixSort = sortRows(matrix); //smjestanje sortirane matrice u novu matricu
		for (int i = 0; i < matrixSort.length; i++) {
			for (int y = 0; y < matrixSort[i].length; y++) {
				System.out.print(matrixSort[i][y] + " "); //ispis sortirane matrice
			}
			System.out.println();
		}
	}

}
