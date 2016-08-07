package zadaci_06_08_2016;

import java.util.Scanner;

public class Zadatak_2 {
	/*
	 * Napisati program koji ispisuje sve prijestupne godine, 10 po liniji, u
	 * rasponu godina koje korisnik unese. Program pita korisnika da unese
	 * poèetnu godinu, krajnju godinu te ispisuje sve godine u tom rasponu.
	 * Razmak izmeðu godina treba biti jedan space.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite pocetnu i krajnju godinu: ");
		// unos pocetne @yearStart i krajnje godine @yearEnd
		int yearStart = input.nextInt();
		int yearEnd = input.nextInt();
		input.close();
		// deklarisanje brojaca @counter na 0
		int counter = 0;
		// petlja za prolazak od pocetne do krajnje zadate godine
		for (int i = yearStart; i < yearEnd; i++) {
			// ispitivanje uslova da li je godina prestupna
			if ((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0)) {
				System.out.print(i + " ");
				// povecavanje brojaca za 1 za svaku prestupnu godinu
				counter++;
				if (counter % 10 == 0)
					System.out.println();

			}
		}
	}

}
