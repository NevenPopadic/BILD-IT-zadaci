package zadaci_13_08_2016;

import java.util.Scanner;

public class Zadatak_1 {
	/*
	 * (Izra�unavanje napojnice) Napisati program koji u�itava ukupan iznos
	 * ra�una koji treba uplatiti kao i procenat tog ra�una kojeg �elimo platiti
	 * kao napojnicu te izra�unava ukupan ra�un i napojnicu. Na primjer, ukoliko
	 * korisnik unese 10 kao ra�un i 15 % kao procenat za napojnicu program
	 * treba da ispi�e da je ukupan ra�un za uplatiti 11.5 a napojnica 1.5.
	 */
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Unesite iznos racuna: ");
		// unos racuna
		double bill = input.nextDouble();
		System.out.println("Unesite iznos napojnice (u procentima): ");
		// unos procenta napojnice
		double tip = input.nextDouble();
		// racunanje i ispis
		System.out.println("Ukupan racun iznosi " + (bill + (tip / 100 * bill))
				+ " a napojnica iznosi " + (tip / 100 * bill));
	}

}
