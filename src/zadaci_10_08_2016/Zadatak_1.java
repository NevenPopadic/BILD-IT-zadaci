package zadaci_10_08_2016;

import java.util.Scanner;

public class Zadatak_1 {
	/*
	 * Napisati metodu koja vraæa broj dana u godini. Metoda koristi sljedeæi
	 * header: public static int numberOfDayInAYear(int year). Napisati program
	 * koji pita korisnika da unese poèetnu godinu, krajnju godinu te ispisuje
	 * broj dana za svaku godinu u rasponu.
	 */
	public static int numberOfDayInAYear(int year) {
		// ispitivanje da li je godina prestupna i slanje broja dana nazad
		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
			return 366;
		else
			return 365;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite pocetnu godinu: ");
		int yearStart = input.nextInt();
		System.out.println("Unesite krajnju godinu: ");
		int yearEnd = input.nextInt();
		input.close();
		// izraz za biranje odgovarajuce petlje
		if (yearStart < yearEnd) {
			for (int i = yearStart; i <= yearEnd; i++) {
				// stampanje broja dana za svaku godinu
				System.out.println(i + " godina ima " + numberOfDayInAYear(i)
						+ " dana.");
			}
		} else {
			for (int i = yearStart; i >= yearEnd; i--) {
				// stampanje broja dana za svaku godinu
				System.out.println(i + " godina ima " + numberOfDayInAYear(i)
						+ " dana.");
			}
		}
	}

}
