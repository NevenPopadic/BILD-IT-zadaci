package zadaci_05_08_2016;

import java.util.Scanner;

public class Zadatak_3 {
	/*
	 * Napisati program koji pita korisnika da unese 2 stringa te ispisuje
	 * najveæi zajednièki prefix za ta dva stringa, ukoliko isti postoji. Na
	 * primjer, ukoliko korisnik unese sljedeæa dva stringa "Dobrodošli u Dubai"
	 * i "Dobrodošli u Vankuver" program treba da ispiše: Najveæi zajednièki
	 * prefix za dva stringa je "Dobrodošli u".
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite prvi string: ");
		// unos prvog stringa
		String s1 = input.nextLine();
		System.out.println("Unesite drugi string: ");
		// unos drugog stringa; deklarisanje praznog stringa @temp koji
		// ce se koristiti za smijestanje zajednickog prefiksa
		String s2 = input.nextLine(), temp = "";
		input.close();
		// petlja za poredjenje stringova, i dok imaju zajednicke unose na datim pozicijama
		// smjestaju se u temp string, u protivnom se izlazi iz petlje sa @break
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == s2.charAt(i))
				temp += s1.charAt(i);
			else
				break;
		}
		//ukoliko duzina @temp stringa iznosi 0, stringovi nemaju zajednicki prefix
		if (temp.length() == 0) {
			System.out.println("Stringovi nemaju zajednicki prefix.");

		} else {
			System.out.println("Najveci zajednicki prefix za dva stringa je \""
					+ temp + "\"");
		}

	}

}
