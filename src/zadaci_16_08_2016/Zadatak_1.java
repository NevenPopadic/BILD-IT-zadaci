package zadaci_16_08_2016;

import java.util.Scanner;

public class Zadatak_1 {
	/*
	 * Napisati program koji pita korisnika da unese cijeli trocifreni broj te
	 * provjerava da li je unijeti broj palindrom. Broj je palindrom ukoliko se
	 * èita isto i sa lijeva na desno i sa desna na lijevo npr. 121, 131, itd.
	 */
	public static int checkReverse(int number) {
		int reverse = 0;
		// petlja radi sve dok ne dodjemo do 0
		while (number != 0) {
			// obrnut broj se povecava za 10
			reverse *= 10;
			// dodaje se najmanja decimala na @reverse
			reverse += number % 10;
			// uklanjamo najmanju decimalu sa @number
			number /= 10;
		}
		return (reverse);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite cijeli trocifreni broj:");
		// unos trocifrenog broja
		int num = input.nextInt();
		input.close();
		// pozivanje metode koja obrce broj i provjera da li su isti
		if (num == checkReverse(num)) {
			System.out.println("Broj " + num + " je palindrom.");
		} else
			System.out.println("Broj " + num + " nije palindrom.");

	}

}
