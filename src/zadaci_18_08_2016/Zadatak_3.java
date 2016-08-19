package zadaci_18_08_2016;

import java.util.Scanner;

public class Zadatak_3 {
	/*
	 * (Pattern recognition: consecutive four equal numbers) Write the following
	 * method that tests whether the array has four consecutive numbers with the
	 * same value. public static boolean isConsecutiveFour(int[] values). Write
	 * a test program that prompts the user to enter a series of integers and
	 * displays if the series contains four consecutive numbers with the same
	 * value. Your program should first prompt the user to enter the input
	 * size—i.e., the number of values in the series.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite duzinu liste:");
		// pravljene liste, kojoj korisnik odredjuje duzinu
		int[] array = new int[input.nextInt()];
		System.out.println("Unesite " + array.length + " vrijednosti u listu:");
		// stavljanje brojaca na 1
		int counter = 1;
		// unos prvog elementa
		array[0] = input.nextInt();
		// unos ostalih elemenada
		for (int i = 1; i < array.length; i++) {
			array[i] = input.nextInt();
			// poredjenje ukoliko su 2 uzastopna broja ista
			if (array[i - 1] == array[i] && counter != 4) {
				counter++;
			} else if (counter != 4) {
				counter = 1;
			}
		}
		input.close();
		// ispis rezultata
		if (counter == 4) {
			System.out.println("Lista ima uzastopna 4 broja.");
		} else
			System.out.println("Lista nema uzastopna 4 broja.");
	}

}
