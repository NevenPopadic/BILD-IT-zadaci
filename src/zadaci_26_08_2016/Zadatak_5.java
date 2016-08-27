package zadaci_26_08_2016;

import java.util.ArrayList;

public class Zadatak_5 {
	/*
	 * (Shuffle ArrayList) Write the following method that shuffles the elements
	 * in an ArrayList of integers. public static void
	 * shuffle(ArrayList<Integer> list)
	 */
	public static void shuffle(ArrayList<Integer> list) {
		// deklarisanje @temp varijable za smjestanje trenutnog elementa
		// deklarisanje @index varijable za smjestanje indexa trenutnog elementa
		int temp, index;
		// petlja koja prolazi kroz listu i nasumicno mjenja indexe pomocu
		// @Math.random
		for (int i = 0; i < list.size(); i++) {
			index = (int) (Math.random() * list.size());
			temp = list.get(index);
			list.set(index, list.get(i));
			list.set(i, temp);
		}
	}

	public static void main(String[] args) {
		// kreiranje niza
		ArrayList<Integer> array = new ArrayList<Integer>();
		// unos elemenata u niz
		for (int i = 0; i < 10; i++)
			array.add(i);
		// ispis originalnog niza
		System.out.println("Array: ");
		for (Integer integer : array)
			System.out.print(integer.intValue() + " ");
		// ispis izmjesanog niza
		shuffle(array);
		System.out.println("\nShuffled array:");
		for (Integer integer : array)
			System.out.print(integer.intValue() + " ");

	}

}
