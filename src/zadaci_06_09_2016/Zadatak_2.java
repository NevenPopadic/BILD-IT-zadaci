package zadaci_06_09_2016;

import java.util.Scanner;

public class Zadatak_2 {
	/*
	 * (Compute greatest common divisor using recursion) The gcd(m, n) can also
	 * be defined recursively as follows: * If m % n is 0, gcd(m, n) is n. *
	 * Otherwise, gcd(m, n) is gcd(n, m % n). Write a recursive method to find
	 * the GCD. Write a test program that prompts the user to enter two integers
	 * and displays their GCD.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first integer: ");
		// unos prvog broja
		int n1 = input.nextInt();
		System.out.println("Enter second integer: ");
		// unos drugog broja
		int n2 = input.nextInt();
		input.close();
		// pozivanje metode i ispis rezultata
		System.out.print("Greatest common divisor for these two numbers is: "
				+ gcd(n1, n2));
	}

	// metoda za pronalazenje najveceg zajednickog djelioca
	public static int gcd(int m, int n) {
		// 'If m % n is 0, gcd(m, n) is n.'
		if (m % n == 0) {
			return n;
			// 'Otherwise, gcd(m, n) is gcd(n, m % n).'
		} else
			return gcd(n, m % n);
	}
}
