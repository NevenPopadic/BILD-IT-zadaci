package zadaci_05_09_2016;

import java.util.Scanner;

public class Zadatak_5 {
	/*
	 * (Convert decimals to fractions) Write a program that prompts the user to
	 * enter a decimal number and displays the number in a fraction. Hint: read
	 * the decimal number as a string, extract the integer part and fractional
	 * part from the string, and use the BigInteger implementation of the
	 * Rational class in Programming Exercise 13.15 to obtain a rational number
	 * for the decimal number.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a decimal number: ");
		// unos broja od strane korisnika
		String s = input.nextLine();
		input.close();
		// kreiranje novog @RationalBI objekta @rat sa unesenim brojem
		RationalBI rat = new RationalBI(s);
		System.out.println("The fraction number is "
				+ rat.getNumerator().toString() + "/"
				+ rat.getDenominator().toString());

	}
}
