package zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_2 {
	/*
	 * (Sort ArrayList) Write the following method that sorts an ArrayList of
	 * numbers: public static void sort(ArrayList<Integer> list) Write a test
	 * program that prompts the user to enter 5 numbers, stores them in an array
	 * list, and displays them in increasing order.
	 */
	public static void sort(ArrayList<Integer> list) {
		// sortiranje niza
		list.sort(null);
		// ispis sortiranog niza
		for (int i : list)
			System.out.print(i + " ");

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// kreiranje array liste
		ArrayList<Integer> array = new ArrayList<>();
		System.out.println("Enter 5 numbers(integer): ");
		// unos elemenata u array listu
		for (int i = 0; i < 5; i++) {
			array.add(input.nextInt());
		}
		input.close();
		// pozivanje metode
		sort(array);
	}

}
