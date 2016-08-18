package zadaci_17_08_2016;

import java.util.Scanner;

public class Zadatak_1 {
	/*
	 * Napisati program koji prima ASCII kod (cijeli broj izmeðu 0 i 127) te
	 * ispisuje koji je to karakter. Na primjer, ukoliko korisnik unese 69 kao
	 * ASCII kod, program mu ispisuje da je karakter sa tim brojem karakter E.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite ASCII broj:");
		// unos broja
		int user = input.nextInt();
		input.close();
		// ispis broja kao karakter
		System.out.println((char) user);
	}

}
