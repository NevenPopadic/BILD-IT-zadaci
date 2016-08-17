package zadaci_16_08_2016;

import java.util.Scanner;

public class Zadatak_3 {
	/*
	 * Napisati program koji pita korisnika da unese Social Security Number
	 * (SSN) u formatu DDD-DD-DDDD gdje D predstavlja broj. Program treba da
	 * provjerava da li je broj unesešen u ispravnom formatu. Ukoliko nije,
	 * program pita korisnika da pokuša ponovo. Ukoliko jeste unešen u pravom
	 * formatu, program završava sa radom.
	 */
	public static boolean isCorrect(String s) {
		if (s.length() == 11) {
			for (int i = 0; i < s.length() - 1; i++) {
				if (i == 3 || i == 6) {
					if (s.charAt(i) != '-')
						return false;
				} else if (!Character.isDigit(s.charAt(i)))
					return false;
			}
		} else {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// deklarisanje @check varijable koja sluzi za rad petlje dok je "True"
		boolean check = true;
		do {
			System.out.println("Unesite Social Security Number(SSN) "
					+ "u formatu DDD-DD-DDDD:");
			// unos stringa
			String s = input.nextLine();
			// pozivanje metode @isCorrect i provjera da li je string u
			// odgovarajucem formatu
			if (isCorrect(s)) {
				check = false;
			} else {
				System.out.println("Pogresan unos.");
			}
		} while (check);
		System.out.println("Unijeti (SSN) broj je u ispravnom formatu.");
		input.close();

	}

}
