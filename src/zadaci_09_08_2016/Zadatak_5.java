package zadaci_09_08_2016;

import java.util.Scanner;

public class Zadatak_5 {
	/*
	 * Napisati metodu koja pretavara milisekunde u sate, minute i sekunde.
	 * Metoda treba da koristi sljedeæi header: public static String
	 * convertMillis(long millis). Metoda treba da vraæa vrijeme kao string u
	 * formatu sati:minute:sekunde. Na primjer convertMillis(100000) treba da
	 * vrati 0:1:40.
	 */
	public static String convertMillis(long millis) {
		// pretvaranje milisekundi u  u sekunde
		long s = millis / 1000;
		// dobijanje broja minuta
		long m = s / 60 % 60;
		// dobijanje broja sati
		long h = s / 60 / 60 % 24;
		// dobijanje broja sekundi
		s = s % 60;
		// vracanje vrijednosti u main metodu
		return h + ":" + m + ":" + s;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite vrijeme u milisekundama: ");
		// unos milisekundi
		long milli = input.nextInt();
		input.close();
		// stampanje i pozivanje metode @convertMillis
		System.out.println(milli + " milisekundi iznosi " + convertMillis(milli) + ".");

	}

}
