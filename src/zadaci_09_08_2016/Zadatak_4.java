package zadaci_09_08_2016;

import java.util.Scanner;

public class Zadatak_4 {
	/*
	 * Napišite program koji uèitava neodreðen broj cijelih brojeva (unos
	 * prekida nula), pronalazi najveæi od unijetih brojeva te ispisuje koliko
	 * se najveæi broj puta ponovio. Na primjer, ukoliko unesemo 3 5 2 5 5 5 0
	 * program ispisuje da je najveæi broj 5 te ispisuje da se isti ponavlja 4
	 * puta.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite neodredjen broj cijelih brojeva (0 prekida unos): ");
		// @current trenutni unos; @max trenutni najveci broj; @counter brojac
		int current;
		int max = 0;
		int counter = 0;
		// petlja koja radi sve dok je unos razlicit od nule
		do {
			current = input.nextInt();
			if (current > max) {
				max = current;
				counter = 1;
			} else if (current == max) {
				counter++;
			}
		} while (current != 0);
		input.close();
		// stampanje rezultata
		if (max == 0) {
			System.out.println("Unijeli ste samo nulu...");
		} else {
			System.out.println("Najveci u listi je " + max + ", a ponavlja se "
					+ counter + " puta.");
		}

	}
}
