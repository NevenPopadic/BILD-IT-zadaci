package zadaci_05_08_2016;

import java.util.Scanner;

public class Zadatak_5 {
	/*
	 * Napisati metodu koja broji slova u stringu. Metoda treba koristiti
	 * sljedeæi header: public static int countLetters(String s). Napisati
	 * program koji pita korisnika da unese neki string te mu vrati koliko taj
	 * string ima slova.
	 */
	public static int countLetters(String s) {
		// @counter brojac za slova
		int counter = 0;
		// petlja za prolazak kroz string
		for (int i = 0; i < s.length(); i++) {
			// provjeravanje da li je karakter na datom indexu slovo
			if (Character.isLetter(s.charAt(i)))
				counter++;
		}
		return counter;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite string: ");
		// unos stringa
		String s = input.nextLine();
		input.close();
		// pozivanje metode, i stampanje rezultata
		System.out.println("Broj slova u datom stringu je " + countLetters(s)
				+ ".");
	}

}
