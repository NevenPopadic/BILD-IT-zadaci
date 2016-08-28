package zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_3 {
	/*
	 * (Sum ArrayList) Write the following method that returns the sum of all
	 * numbers in an ArrayList: public static double sum(ArrayList<Double> list)
	 * Write a test program that prompts the user to enter 5 numbers, stores
	 * them in an array list, and displays their sum.
	 */
	public static double sum(ArrayList<Double> list) {
		// deklarisanje sum varijable za smjestanje sume
		double sum = 0;
		// petlja za prolazak kroz listu i dodavanje zbira na @sum
		for (int i = 0; i < list.size(); i++)
			sum += list.get(i);
		// vracanje varijable sum
		return sum;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// kreiranje array liste
		ArrayList<Double> array = new ArrayList<>();
		System.out.println("Enter 5 numbers(integer): ");
		// unos elemenata u array listu
		for (int i = 0; i < 5; i++) {
			array.add(input.nextDouble());
		}
		input.close();
		// pozivanje metode i ispis
		System.out.println("Sum of elements in list is: " + sum(array));
	}
}
