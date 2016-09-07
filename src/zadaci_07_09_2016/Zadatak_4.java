package zadaci_07_09_2016;

import java.util.Scanner;

public class Zadatak_4 {
	/*
	 * (Sum the digits in an integer using recursion) Write a recursive method
	 * that computes the sum of the digits in an integer. Use the following
	 * method header: public static int sumDigits(long n) For example,
	 * sumDigits(234) returns 2 + 3 + 4 = 9. Write a test program that prompts
	 * the user to enter an integer and displays its sum.
	 */
	public static int sumDigits(long n) {
		if (n == 0)
			return (int) n;

		return (int) n % 10 + (int) (sumDigits(n / 10));
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter integer number:");
		// unos broja i pozivanje metode
		System.out.println(sumDigits(input.nextInt()));
		input.close();
	}

}
