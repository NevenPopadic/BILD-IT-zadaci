package zadaci_10_08_2016;

import java.util.Scanner;

public class Zadatak_5 {
	/*
	 * Napisati program koji pita korisnika da unese dva stringa te provjerava i
	 * ispisuje da li je drugi string substring prvog stringa. Na primjer,
	 * ukoliko korisnik unese ABCD kao prvi string a BC kao drugi string program
	 * mu ispisuje da je BC substring ABCD stringa.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite prvi string: ");
		// unos prvog stringa
		String s1 = input.nextLine();
		System.out.println("Unesite drugi string: ");
		// unos drugog stringa
		String s2 = input.nextLine();
		input.close();
		// ispitivanje da li je drugi string sadrzan u prvom stringu
		if (s1.contains(s2)) {
			System.out.println("Drugi string " + s2
					+ " je substring prvom stringu " + s1);
		} else {
			System.out.println("Drugi string " + s2
					+ " nije substring prvom stringu " + s1);
		}
	}

}
