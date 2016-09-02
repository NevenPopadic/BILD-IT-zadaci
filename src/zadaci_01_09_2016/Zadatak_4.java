package zadaci_01_09_2016;

import java.util.ArrayList;
import java.util.Collections;

public class Zadatak_4 {
	/*
	 * (Shuffle ArrayList) Write the following method that shuffles an ArrayList
	 * of numbers: public static void shuffle(ArrayList<Number> list)
	 */
	public static void shuffle(ArrayList<Number> list) {
		// mjesamo listu
		Collections.shuffle(list);
		System.out.print("\nShuffled: ");
		// ispisujemo izmjesanu listu
		for (Number i : list) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		// kreiramo array listu
		ArrayList<Number> array = new ArrayList<Number>();
		// unosimo nasumicne vrijednosti u listu
		for (int i = 0; i < 10; i++) {
			array.add(i);
			System.out.print(array.get(i) + " ");
		}
		// pozivamo metodu za sortiranje
		shuffle(array);
	}

}
