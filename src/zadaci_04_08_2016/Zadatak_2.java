

package zadaci_04_08_2016;

import java.util.Scanner;

public class Zadatak_2 {
	/* ISBN-10 (International Standard Book Number) se sadrži od 10 brojeva: d1 d2 
	 * d3 d4 d5 d6 d7 d8 d9 d10. Posljednji broj, d10, služi kao checksum i njega 
	 * izraèunavamo iz prvih devet brojeva koristeæi se sljedeæom formulom: (d1 * 1
	 *  + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11.
	 * Ukoliko je checksum 10, zadnji broj oznaèavamo sa X u skladu sa ISBN-10 konvencijom.
	 * Napisati program koji pita korisnika da unese prvih 9 brojeva te ispiše desetocifreni ISBN-10 broj.
	 * (Primjer: ukoliko unesemo, kao prvih 9 brojeva, 013601267 program nam ispisuje 0136012671 kao ISBN-10 broj.
	 * Ukoliko unesemo 013031997 kao prvih 9 brojeva, program nam ispisuje 013031997X kao ISBN-10 broj)
	 * */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite 9 brojeva od ISBN: ");
		//unos ISBN-10 brojeva
		int d1 = input.nextInt();
		int d2 = input.nextInt();
		int d3 = input.nextInt();
		int d4 = input.nextInt();
		int d5 = input.nextInt();
		int d6 = input.nextInt();
		int d7 = input.nextInt();
		int d8 = input.nextInt();
		int d9 = input.nextInt();

		input.close();
		//dobijanje d10 broja
		int d10 = (((d1 * 1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5)
				+ (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9)) % 11);
		
		if (d10 == 10) {
			System.out.println("ISBN je: " + d1 + d2 + d3 + d4 + d5 + d6 + d7
					+ d8 + d9 + "X");

		} else {
			System.out.println("ISBN je: " + d1 + d2 + d3 + d4 + d5 + d6 + d7
					+ d8 + d9 + d10);
		}
	}
}
