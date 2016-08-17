package zadaci_15_08_2016;

import java.util.Scanner;

public class Zadatak_5 {
	/*
	 * Napisati metodu koja ispisuje n x n matricu koristeæi se sljedeæim
	 * headerom: public static void printMatrix(int n). Svaki element u matrici
	 * je ili 0 ili 1, nasumièno generisana. Napisati test program koji pita
	 * korisnika da unese broj n te mu ispiše n x n matricu u konzoli.
	 */

	public static void printMatrix(int n) {
		// petlja za prolazak kroz redove
		for (int i = 0; i < n; i++) {
			// petlja za prolazak kroz brojeve u redu
			for (int y = 0; y < n; y++) {
				// ispisivanje 0 ili 1 pomocu Math.random
				System.out.print((int) (Math.round(Math.random() * 1)) + " ");
			}
			// prelazak u novi red
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite n: ");
		// pozivanje metode prilikom unosa od strane korisnika
		printMatrix(input.nextInt());
		input.close();
	}

}
