package zadaci_16_08_2016;

import java.util.Scanner;

public class Zadatak_5 {
	/*
	 * Napisati program koji pita korisnika da unese cijeli broj te ispisuje
	 * piramidu svih brojeva do tog broja. (Na primjer, ukoliko korisnik unese 7
	 * vrh piramide je broj 1, red ispod vrha piramide je 2 1 2, red ispod je 3
	 * 2 1 2 3, red ispod 4 3 2 1 2 3 4 itd.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite cijeli broj:");
		int num = input.nextInt();
		input.close();
		// petlja za prolazak kroz redove
		for (int i = 1; i <= num; i++) {
			// petlja za ubacivanje razmaka prije svakog broja
			for (int y = 1; y <= num - i; y++) {
				System.out.print("  ");
			}
			// petlja za upis brojeva do 1
			for (int x = i; x > 0; x--) {
				System.out.print(x + " ");
			}
			// petlja za upis brojeva od 1 pa do trenutnog "i" broja
			for (int z = 1; z < i; z++) {
				System.out.print(z + 1 + " ");
			}
			System.out.println();
		}
	}

}
