package zadaci_01_09_2016;

import java.util.ArrayList;

public class Zadatak_5 {
	/*
	 * (Sort ArrayList) Write the following method that sorts an ArrayList of
	 * numbers. public static void sort(ArrayList<Number> list)
	 */
	public static void sort(ArrayList<Number> list) {
		// sortiramo listu
		list.sort(null);
		System.out.print("\nSorted: ");
		// ispisujemo sortiranu listu
		for (Number i : list) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		// kreiramo array listu
		ArrayList<Number> array = new ArrayList<Number>();
		// unosimo nasumicne vrijednosti u listu
		for (int i = 0; i < 10; i++) {
			array.add((int) (Math.random() * 10));
			System.out.print(array.get(i) + " ");
		}
		// pozivamo metodu za sortiranje
		sort(array);
	}
}
