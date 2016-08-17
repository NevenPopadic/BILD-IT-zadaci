package zadaci_16_08_2016;

import java.util.Scanner;

public class Zadatak_2 {
	/*
	 * Napisati program koji pita korisnika da unese neki string te mu ispisuje
	 * dužinu tog stringa kao i prvo slovo stringa.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite neki string:");
		// unos stringa
		String s = input.nextLine();
		input.close();
		// ispis duzine unijetog stringa i prvog karaktera
		System.out.println("Duzina stringa iznosi " + s.length()
				+ ", a prvo slovo u stringu je " + s.charAt(0) + ".");
	}

}
