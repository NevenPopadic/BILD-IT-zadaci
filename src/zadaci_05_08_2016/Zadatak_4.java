package zadaci_05_08_2016;

import java.util.Scanner;

public class Zadatak_4 {
	/*
	 * Napisati program koji prima 10 cijelih brojeva te ih ispisuje u obrnutom
	 * redosljedu.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite 10 cijelih brojeva: ");
		// kreiranje niza
		int[] array = new int[10];
		// unos elemenata u niz
		for (int i = 0; i < 10; i++) {
			array[i] = input.nextInt();
		}
		input.close();
		
		System.out.println("Uneseni brojevi istampani obrnuto: ");
		// stampanje niza obrnuto
		for (int i = 9; i >= 0; i--) {
			System.out.print(array[i] + " ");

		}
	}

}
