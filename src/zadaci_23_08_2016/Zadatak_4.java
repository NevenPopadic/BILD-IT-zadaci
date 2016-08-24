package zadaci_23_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_4 {
	/*
	 * (Displaying the prime factors) Write a program that prompts the user to
	 * enter a positive integer and displays all its smallest factors in
	 * decreasing order. For example, if the integer is 120, the smallest
	 * factors are displayed as 5, 3, 2, 2, 2. Use the StackOfIntegers class to
	 * store the factors (e.g., 2, 2, 2, 3, 5) and retrieve and display them in
	 * reverse order.
	 */
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// pravimo objekat @factors koristeci klasu @StackOfIntegers
		StackOfIntegers factors = new StackOfIntegers();

		int user = 0;
		System.out.println("Enter a positive integer: ");
		// unos broja od strane korisnika; petlja radi sve dok korisnik ne unese
		// pozitivan broj
		do {
			user = inputCheck();
		} while (user == 0);
		// pocetni djelilac @d stavljamo na 2 i dijelimo broj sve dok je on veci
		// od 1
		int d = 2;
		while (user > 1) {
			if (user % d == 0) {
				factors.push(d);
				user /= d;
			} else
				d++;
		}
		// ispisujemo faktore krecuci od zadnjeg indexa
		System.out.println("Factors:");
		for (int i = factors.getSize(); i > 0; i--) {
			System.out.print(factors.pop() + " ");

		}
	}

	private static int inputCheck() {
		int user = 0;
		boolean inputCheck = true;
		do {
			try {
				user = input.nextInt();
				// korisnik mora unijeti pozitivan broj
				if (user > 0)
					inputCheck = false;
				else
					System.out.println("Wrong input. Try again.");
			} catch (InputMismatchException ex) {
				System.out.println("Wrong input. Try again.");
				input.nextLine();
			}
		} while (inputCheck);
		return user;
	}
}