package zadaci_08_08_2016;

import java.util.Scanner;

public class Zadatak_5 {
	/*
	 * Neke web stranice forsiraju odreðena pravila za passworde. Napisati
	 * metodu koja provjerava da li je unijeti string validan password. Pravila
	 * da bi password bio validan su sljedeæa: 1. Password mora biti saèinjen od
	 * najmanje 8 karaktera. 2. Password smije da se sastoji samo od slova i
	 * brojeva. 3. Password mora sadržati najmanje 2 broja. Napisati program
	 * koji pita korisnika da unese password te mu ispisuje
	 * "password je validan" ukoliko su sva pravila ispoštovana ili
	 * "password nije validan" ukoliko pravila nisu ispoštovana.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite password: ");
		// unos passworda
		String pass = input.nextLine();
		input.close();
		// provjera da li password ispunjava kriterijume
		if (pass.length() >= 7 && checkLetNum(pass) && check2Num(pass)) {
			System.out.println("Password je validan.");

		} else {
			System.out.println("Password nije validan.");
		}
	}

	// metoda za provjeru da li password sadrzi najmanje 2 broja
	public static boolean check2Num(String pass) {
		int counter = 0;

		for (int i = 0; i < pass.length(); i++) {
			if (Character.isDigit(pass.charAt(i))) {
				counter++;
				if (counter == 2) {
					return true;
				}
			}
		}
		return false;
	}

	// metoda za provjeru da li su svi elementi u stringu brojevi ili slova
	public static boolean checkLetNum(String pass) {
		for (int i = 0; i < pass.length(); i++) {
			if (!Character.isLetterOrDigit(pass.charAt(i))) {
				return false;
			}
		}
		return true;
	}

}
