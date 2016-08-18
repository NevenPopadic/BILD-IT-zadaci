package zadaci_17_08_2016;

import java.util.Scanner;

public class Zadatak_2 {
	/*
	 * Napisati program koji prima karakter te vraæa njegov Unicode. Primjer:
	 * ukoliko korisnik unese karakter E program mu vraæa 69 kao unicode za taj
	 * karakter.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite karakter:");
		char user = input.next().charAt(0);
		input.close();
		System.out.println((int) user);

	}

}
