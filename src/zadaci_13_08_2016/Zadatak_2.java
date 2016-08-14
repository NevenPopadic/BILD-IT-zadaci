package zadaci_13_08_2016;

import java.util.Scanner;

public class Zadatak_2 {
	/*
	 * Napišite metodu sa sljedeæim headerom koja vraæa naopako ispisan broj
	 * koji joj je proslijeðen kao argument: public static void reverse(int
	 * number). Na primjer, reverse(3456) treba da vrati 6543. Napisati program
	 * koji pita korisnika da unese neki cijeli broj te mu vrati isti ispisan
	 * naopako.
	 */
	static Scanner input = new Scanner(System.in);

	public static void reverse(int number) {
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
		// ispis
		System.out.print("Taj broj ispisan naopako: " + reverse);
	}

	public static void main(String[] args) {
		System.out.println("Unesite neki broj:");
		// unos i pozivanje metode
		reverse(input.nextInt());

	}

}
