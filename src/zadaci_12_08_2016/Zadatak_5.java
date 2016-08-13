package zadaci_12_08_2016;

import java.util.InputMismatchException;

public class Zadatak_5 {
	/*
	 * Napisati program koji uèitava cijele brojeve u rasponu od 1 do 100 te
	 * broji i ispisuje koliko je koji broj puta unijet. Pretpostavimo da nula
	 * prekida unos brojeva. Ukoliko unesemo sljedeæi niz brojeva 2 5 6 23 42 58
	 * 2 6 0 program nam ispisuje da se broj 2 ponavlja 2 puta, broj 5 jednom,
	 * broj 6 2 puta, broj 23 jednom, itd.
	 */

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Unesite cijele brojeve u rasponu od "
				+ "1 do 100(0 prekida unos):");
		// kreiranje niza sa 100 elemenata za unos brojeva na indexe od 1 do 100
		int[] array = new int[100];
		// provjera unosa, da li je broj u opsegu
		int n = checkInput();
		// petlja ce da radi dok korisnik ne unese 0
		while (n != 0) {
			// ukoliko se unos i broj u nizu podudaraju, index (null) na tom
			// mjestu
			// se povecava za 1
			for (int i = 1; i < array.length; i++) {
				if (n == i) {
					array[i]++;
				}
			}
			n = checkInput();
		}
		// prelazenje preko indexa, i ukoliko index nije null, ispisuje se
		// vrijednost tog indexa
		for (int y = 0; y < array.length; y++) {
			if (array[y] != 0) {
				System.out.println("Broj " + y + " se ponovio " + array[y]
						+ " puta.");
			}
		}

	}

	private static int checkInput() {
		int num = 0;
		boolean error = false;
		do {
			try {

				num = input.nextInt();
				if (num > -1 && num <= 100) {
					error = false;
				} else {
					System.out
							.println("Broj mora biti veci od 0 i manji od 100, "
									+ "nulom se prekida unos.");
					error = true;
				}
			} catch (InputMismatchException e) {
				System.out.println("Pokusajte ponovo.");
				input.nextLine();
			}
		} while (error);
		return num;
	}

}
