package zadaci_07_09_2016;

import java.util.Scanner;

public class Zadatak_5 {
	/*
	 * (Find the largest number in an array) Write a recursive method that
	 * returns the largest integer in an array. Write a test program that
	 * prompts the user to enter a list of eight integers and displays the
	 * largest element.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 8 integer number:");
		int[] array = new int[8];
		// unos brojeva u niz
		for (int i = 0; i < array.length; i++)
			array[i] = input.nextInt();
		input.close();
		// pozivanje metode
		System.out.println("Maxumum number in array is: "
				+ max(array, array.length - 1));
	}

	// metoda koja pomocu rekurzije trazi najveci broj u nizu
	private static int max(int[] array, int i) {
		if (i > 0)
			return Math.max(array[i], max(array, i - 1));
		else
			return array[0];
	}

}
