package zadaci_12_08_2016;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak_4 {
	/*
	 * Napisati program koji pita korisnika da unese 3 cijela broja te mu ispi�e
	 * ta ista tri broja u rastu�em redosljedu. Bonus: Napisati metodu koja
	 * prima tri cijela broja kao argumente te vra�a brojeve u rastu�em
	 * redosljedu.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite 3 cijela broja: ");
		// unos elemenata u niz i pozivanje metode @sort
		int[] array = sort(input.nextInt(), input.nextInt(), input.nextInt());
		input.close();
		// ispis sortiranog niza
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	private static int[] sort(int n1, int n2, int n3) {
		// preuzimanje elemenata
		int[] sortedArray = { n1, n2, n3 };
		// sortiranje elemenata
		Arrays.sort(sortedArray);
		return sortedArray;
	}

}
