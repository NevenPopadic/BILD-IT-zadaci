package zadaci_29_08_2016;

import java.util.Scanner;

public class Zadatak_4 {
	/*
	 * (ArrayIndexOutOfBoundsException) Write a program that meets the following
	 * requirements: * Creates an array with 100 randomly chosen integers. *
	 * Prompts the user to enter the index of the array, then displays the
	 * corresponding element value. If the specified index is out of bounds,
	 * display the message Out of Bounds.
	 */
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// @user varijabla za unos korisnika
		int user;
		// kreiranje array liste sa 100 elemenata
		int[] array = new int[100];
		// unos random elemenata u array listu
		for (int i = 0; i < array.length; i++)
			array[i] = (int) (Math.random() * 10);
		// petlja radi dok korisnik ne unese tacnu vrijednost
		while (true) {
			try {
				System.out.println("Enter index of an array:");
				user = input.nextInt();
				System.out.println("Number at index you enter is "
						+ array[user]);
				break;
			} catch (IndexOutOfBoundsException poyy) {
				System.out.println("OUT OF BOUNDS. Try again.");

			}

		}

	}
}
