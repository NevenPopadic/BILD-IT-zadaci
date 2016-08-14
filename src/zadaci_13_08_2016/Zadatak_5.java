package zadaci_13_08_2016;

import java.util.Scanner;

public class Zadatak_5 {
	/*
	 * Pretpostavimo da kupujemo rižu ili neki drugi proizvod u dva razlièita
	 * pakovanja. Želimo napisati program koji uporeðuje cijene ta dva
	 * pakovanja. Program pita korisnika da unese težinu i cijenu oba pakovanja
	 * te ispisuje koje pakovanje ima bolju cijenu.
	 */
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Unesite cijenu i tezinu prvog pakovanja:");
		// unos cijene i tezine provog pakovanja
		double price1 = input.nextDouble();
		double weight1 = input.nextDouble();
		System.out.println("Unesite cijenu i tezinu drugog pakovanja:");
		// unos cijene i tezine drugog pakovanja
		double price2 = input.nextDouble();
		double weight2 = input.nextDouble();
		// poredjenje vrijednosti pakovanja
		if (weight1 / price1 > weight2 / price2) {
			System.out.println("Prvo pakovanje ima bolju cijenu.");
		} else if (weight1 / price1 == weight2 / price2) {
			System.out.println("Oba pakovanja isto vrijede.");
		} else {
			System.out.println("Drugo pakovanje ima bolju cijenu.");
		}
	}

}
