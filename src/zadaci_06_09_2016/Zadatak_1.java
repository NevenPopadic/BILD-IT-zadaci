package zadaci_06_09_2016;

import java.util.Scanner;

public class Zadatak_1 {
	/*
	 * (Fibonacci numbers) Rewrite the fib method in Listing 18.2 using
	 * iterations. Hint: To compute fib(n) without recursion, you need to obtain
	 * fib(n - 2) and fib(n - 1) first. Let f0 and f1 denote the two previous
	 * Fibonacci numbers. The current Fibonacci number would then be f0 + f1.
	 * The algorithm can be described as follows: f0 = 0; // For fib(0) f1 = 1;
	 * // For fib(1) for (int i = 1; i <= n; i++) { currentFib = f0 + f1; f0 =
	 * f1; f1 = currentFib; } // After the loop, currentFib is fib(n) Write a
	 * test program that prompts the user to enter an index and displays its
	 * Fibonacci number.18.3 (Compute greatest common divisor using recursion)
	 * The gcd(m, n) can also be defined recursively as follows: * If m % n is
	 * 0, gcd(m, n) is n. * Otherwise, gcd(m, n) is gcd(n, m % n). Write a
	 * recursive method to find the GCD. Write a test program that prompts the
	 * user to enter two integers and displays their GCD.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an index for Fibonacci number: ");
		// unos indexa broja
		int index = input.nextInt();
		// pozivanje metode i ispis rezultata
		System.out.println("The Fibonacci number at index " + index + " is "
				+ fib(index));
		input.close();
	}

	public static int fib(int n) {
		// ukoliko je n 1 ili 0 vracamo ga nazad
		if (n == 1 || n == 0)
			return n;
		// kreiranje varijabli za pronalazenje fib broja
		int currentFib = 0;
		int f0 = 0;
		int f1 = 1;
		// petlja za prolazak od 2 do n
		for (int i = 2; i <= n; i++) {
			currentFib = f0 + f1;
			f0 = f1;
			f1 = currentFib;
		}
		// vracamo broj nazad
		return f1;
	}

}
