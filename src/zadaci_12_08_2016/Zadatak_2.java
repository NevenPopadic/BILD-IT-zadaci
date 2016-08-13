package zadaci_12_08_2016;

import java.util.Scanner;

public class Zadatak_2 {
	/*
	 * Napisati program koji pita korisnika da unese dva cijela, pozitivna broja
	 * te ispisuje najveæi i najmanji zajednièki djelilac za ta dva broja.
	 */
	protected static int high;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("unesite dva cijela, pozitivna broja: ");
		// unos dva broja
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		input.close();
		// unos varijable za najmanjeg djelioca
		Integer low = null;
		for (int i = 0; i <= Math.min(num1, num2); i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				low = i;
				// ukoliko @low vrijednost nije null, onda se unos u @high, tj
				// najveceg djelioca, u slucaju da su oba broja djeljiva sa @i
				if (!low.equals(null)) {
					high = i;
				}
			}
		}
		// ispis rezultata
		System.out.println("Najmanji zajednicki djelilac je " + low
				+ ", a najveci zajednicki djelilac je " + high + ".");

	}

}
