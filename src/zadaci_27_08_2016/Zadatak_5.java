package zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_5 {
	/*
	 * (Combine two lists) Write a method that returns the union of two array
	 * lists of integers using the following header: public static
	 * ArrayList<Integer> union( ArrayList<Integer> list1, ArrayList<Integer>
	 * list2)For example, the union of two array lists {2, 3, 1, 5} and {3, 4,
	 * 6} is {2, 3, 1, 5, 3, 4, 6}. Write a test program that prompts the user
	 * to enter two lists, each with five integers, and displays their union.
	 * The numbers are separated by exactly one space in the output.
	 */
	public static ArrayList<Integer> union(ArrayList<Integer> list1,
			ArrayList<Integer> list2) {
		// kreiranje @temp array liste
		ArrayList<Integer> temp = new ArrayList<Integer>();
		// smjestanje elemenata list1 u @temp
		for (int i = 0; i < list1.size(); i++)
			temp.add(list1.get(i));
		// smjestanje elemenata list2 u @temp
		for (int i = 0; i < list2.size(); i++)
			temp.add(list2.get(i));
		// slanje @temp array liste nazad
		return temp;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// kreiranje array liste
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		System.out.println("Enter five integers for list1: ");
		// unos elemenata u list1
		for (int i = 0; i < 5; i++) {
			list1.add(input.nextInt());
		}
		System.out.println("Enter five integers for list2: ");
		// unos elemenata u list2
		for (int i = 0; i < 5; i++) {
			list2.add(input.nextInt());
		}
		input.close();
		// kreiranje @listCombined array liste i pozivanje metode union
		ArrayList<Integer> listCombined = union(list1, list2);
		// ispis kombinovane liste
		for (int i : listCombined) {
			System.out.print(i + " ");
		}
	}

}
