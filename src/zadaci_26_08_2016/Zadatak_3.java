package zadaci_26_08_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_3 {
	/*
	 * (Maximum element in ArrayList) Write the following method that returns
	 * the maximum value in an ArrayList of integers. The method returns null if
	 * the list is null or the list size is 0. public static Integer
	 * max(ArrayList<Integer> list)
	 */

	public static Integer max(ArrayList<Integer> list) {
		// deklarisanje @temp varijable za smjestanje najveceg broja
		int temp = 0;
		// petljom prolazimo kroz listu
		for (int i = 0; i < list.size(); i++) {
			if (temp < list.get(i))
				temp = list.get(i);
		}
		return temp;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// pravljenje liste
		ArrayList<Integer> array = new ArrayList<>();
		System.out.println("Insert integer numbers (0 stops input):");
		int user;
		// unos elemenata u listu dok korisnik ne unese 0
		do {
			try {
				System.out.println("Enter integer number: ");
				user = input.nextInt();
				if (user == 0) {
					break;
				}
				array.add(user);
			} catch (InputMismatchException potato) {
				System.out.println("Wrong input.");
				input.nextLine();
			}

		} while (true);
		input.close();
		// ukoliko je lista prazna ispisujemo prvu poruku, ukoliko nije pozivamo
		// metodu i ispisujemo najveci broj u listi
		if (array.size() == 0)
			System.out.println("You didn't insert any values except 0.");
		else
			System.out.println("Maximum value that you insert is: "
					+ max(array));
	}

}
