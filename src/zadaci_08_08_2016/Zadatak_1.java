package zadaci_08_08_2016;

import java.util.Scanner;

public class Zadatak_1 {
	/*
	 * Napisati program koji ispisuje tri nasumièna cijela broja te pita
	 * korisnika da unese njihov zbir. Ukoliko korisnik pogriješi, program
	 * ispisuje pitanje ponovo sve sa porukom da pokuša ponovo. Ukoliko korisnik
	 * unese taèan odgovor, program mu èestita i završava sa radom.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// dobijanje random vrijednosti @x @y @z
		int x = (int) (Math.random() * 10);
		int y = (int) (Math.random() * 10);
		int z = (int) (Math.random() * 10);
		// petlja se izvrsava sve dok je zbir zadata tri broja razlicit od unosa
		do {
			System.out.println("Koliko iznosi zbir " + x + "+" + y + "+" + z + " ?");

		} while (x + y + z != input.nextInt());
		input.close();
		System.out.println("Tacan odgovor!");
	}

}
