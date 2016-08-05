
package zadaci_04_08_2016;

import java.util.Scanner;

public class Zadatak_1 {
	/* Napisati program koji pita korisnika da unese neki cijeli broj
	 * te ispisuje njegove najmanje faktore u rastuæem redosljedu. 
	 * Na primjer, ukoliko korisnik unese 120 program treba da ispiše
	 * 2, 2, 2, 3, 5. (2 * 2 * 2 * 3 * 5 = 120)
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite cijeli broj: ");
		int n = input.nextInt();
		input.close();
		int x = 2; // pocetni djelilac
		do {
			if (n % x == 0) { // ukoliko se broj moze podjeliti sa "x", ispisujemo "x"
				System.out.print(x + ", ");
				n = n / x;
			} else {
				x++; // ukoliko nemoze povecavamo x za 1 pa pokusavamo opet
			}
		} while (n != 1); // petlja ce raditi sve dok n ne postane 1, tj dok se
						  // nemoze vise podjeliti
	}

}
