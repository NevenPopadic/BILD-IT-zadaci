package zadaci_29_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_3 {
	/*
	 * (InputMismatchException) Write a program that prompts the user to read
	 * two integers and displays their sum. Your program should prompt the user
	 * to read the number again if the input is incorrect.
	 */
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter 2 integers:");
		// petlja radi dok korisnik ne unese oba broja u integer formatu
		while (true) {
			System.out.println("Enter first integer");
			int n1 = inputCheck();
			System.out.println("Enter second integer");
			int n2 = inputCheck();
			System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
			break;

		}

	}

	private static int inputCheck() {

		int user = 0;
		boolean inputCheck = true;
		do {
			try {
				user = input.nextInt();
				// korisnik mora unijeti integer broj
				inputCheck = false;
			} catch (InputMismatchException ex) {
				System.out.println("Wrong input. Try again.");
				input.nextLine();
			}
		} while (inputCheck);
		return user;
	}
}
