package zadaci_07_09_2016;

import java.util.Scanner;

public class Zadatak_1 {
	/*
	 * (Print the digits in an integer reversely) Write a recursive method that
	 * displays an int value reversely on the console using the following
	 * header: public static void reverseDisplay(int value) For example,
	 * reverseDisplay(12345) displays 54321. Write a test program that prompts
	 * the user to enter an integer and displays its reversal.
	 */
	public static void reverseDisplay(int value) {
		// ukoliko je broj 0 ili manji od 0 prekidamo metodu
		if (value < 10)
			return;
		else {
			System.out.print(value % 10);
			reverseDisplay(value / 10);
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter integer number:");
		// unos broja i pozivanje metode
		reverseDisplay(input.nextInt());
		input.close();
	}

	// metoda za obrtanje broja

}
