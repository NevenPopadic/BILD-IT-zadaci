package zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_4 {
	/*
	 * (Remove duplicates) Write a method that removes the duplicate elements
	 * from an array list of integers using the following header: public static
	 * void removeDuplicate(ArrayList<Integer> list) Write a test program that
	 * prompts the user to enter 10 integers to a list and displays the distinct
	 * integers separated by exactly one space.
	 */
	public static void removeDuplicate(ArrayList<Integer> list) {
		// prva petlja za prolazak indexa broja koji provjeravamo
		for (int i = 0; i < list.size() - 1; i++) {
			// druga petlja za poredenje indexa broja koji trenutno provjeravamo
			// sa ostalim indexima vecim od njega
			for (int y = i + 1; y < list.size(); y++) {
				// ukoliko imaju 2 jednaka drugi uklanjamo iz liste
				if (list.get(i).equals(list.get(y))) {
					list.remove(y);
					y--;
				}

			}
		}
		// ispis nove liste
		System.out.println("The distinct integers are ");
		for (int i : list)
			System.out.print(i + " ");

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// kreiranje array liste
		ArrayList<Integer> array = new ArrayList<>();
		System.out.println("Enter 10 integers: ");
		// unos elemenata u array listu
		for (int i = 0; i < 10; i++) {
			array.add(input.nextInt());
		}
		input.close();
		// pozivanje metode
		removeDuplicate(array);
	}

}
