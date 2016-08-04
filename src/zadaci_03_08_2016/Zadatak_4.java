package zadaci_03_08_2016;

import java.util.Scanner;

public class Zadatak_4 {
	public static int[] locateLargest(double[][] a) {
		int[] temp = new int[2]; // varijabla za smjestanje indexa najveceg
									// broja
		double max = a[0][0]; // varijabla za smjestanje trenutnog navjeceg
								// broja
		for (int i = 0; i < a.length; i++) {
			for (int y = 0; y < a[i].length; y++) {
				System.out.print(a[i][y] + " ");
				// ^petlje za prolazak kroz matricu
				if (max < a[i][y]) { // poredjenje trenutnog najveceg sa
										// trenutnim po redu brojem u matrici
					max = a[i][y]; //
					temp[0] = i; // index reda
					temp[1] = y; // index kolone
				}
			}
			System.out.println();
		}
		return temp; // vracanje indeksa najveceg broja u matrici
	}


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj redova i broj kolona: ");

		double[][] matrix = new double[input.nextInt()][input.nextInt()]; //kreiranje matrice

		for (int i = 0; i < matrix.length; i++) {
			System.out.println("Unesite (" + matrix.length
					+ ") elemente u red " + (i + 1) + " ");
			for (int y = 0; y < matrix[i].length; y++) {
				matrix[i][y] = input.nextDouble(); //unos elemenata u matricu
			}
		}
		input.close();
		int[] result = locateLargest(matrix); //smjestanje indexa najveceg broja pri pozivanju metode
		System.out.println("Index najveceg broja u matrici je "
				+ (result[0] + 1) + " red, " + (result[1] + 1) + " kolona.");

	}

}
