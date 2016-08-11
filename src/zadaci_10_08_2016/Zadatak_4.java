package zadaci_10_08_2016;

import java.util.Scanner;

public class Zadatak_4 {
	/*
	 * Napisati metodu koja pronalazi broj ponavljanja odre�enog karaktera u
	 * stringu. Metoda treba da koristi sljede�i header: public static int
	 * count(String str, char a). Na primjer, ukoliko pozovemo metodu na
	 * sljede�i na�in: count("Welcome", e) metoda treba da vrati 2. Napisati
	 * program koji pita korisnika da unese string i koji karakter �eli da
	 * prebroji u datom stringu te mu ispi�e koliko se puta odre�eni karakter
	 * ponovio u zadatom stringu.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite neki string: ");
		// unos stringa @s
		String s = input.nextLine();
		System.out.println("Unesite karakter koji zelite da izbrojite "
				+ "u stringu: ");
		// unos karaktera @c
		char c = input.next().charAt(0);
		input.close();
		// pozivanje metode za broj ponavljanja i ispis
		System.out.println("U stringu " + s + " karakter " + c
				+ " se pojavljuje " + countC(s, c));
	}

	private static int countC(String s, char c) {
		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) 
				counter++;
			
		}
		return counter;
	}

}
