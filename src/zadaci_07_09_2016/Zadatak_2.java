package zadaci_07_09_2016;

import java.util.Scanner;

public class Zadatak_2 {
	/*
	 * (Print the characters in a string reversely) Write a recursive method
	 * that displays a string reversely on the console using the following
	 * header: public static void reverseDisplay(String value) For example,
	 * reverseDisplay("abcd") displays dcba. Write a test program that prompts
	 * the user to enter a string and displays its reversal.
	 */
	public static void reverseDisplay(String value) {
		// ukoliko string ima samo 1 slovo ispisemo ga
		if (value.length() == 1)
			System.out.print(value);
		// u protivnom ispisujemo slovo na zadnjem indexu, a zatim brisemo to
		// zadnje slovo i pozivamo ponovo metodu
		else {
			System.out.print(value.charAt(value.length() - 1));
			reverseDisplay(value.substring(0, value.length() - 1));
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string:");
		// unos stringa i pozivanje metode
		reverseDisplay(input.next());
		input.close();
	}

}
