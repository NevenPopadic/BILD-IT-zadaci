package zadaci_08_09_2016;

import java.util.ArrayList;

public class Zadatak_1 {
	/*
	 * (Distinct elements in ArrayList) Write the following method that returns
	 * a new ArrayList. The new list contains the non-duplicate elements from
	 * the original list. public static <E> ArrayList<E>
	 * removeDuplicates(ArrayList<E> list)
	 */
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
		// kreiranje temp array liste
		ArrayList<E> temp = new ArrayList<E>();
		// prolazak kroz poslatu listu
		for (E e : list) {
			// ukoliko nova lista ne sadrzi trenutni element u poslatoj listi
			// dodajemo ga u temp listu
			if (!temp.contains(e)) {
				temp.add(e);
			}
		}
		// saljemo nazad temp listu
		return temp;
	}

	public static void main(String[] args) {
		// kreiranje nove liste i dodavanje elemenata u listu
		ArrayList<String> array = new ArrayList<>();
		array.add("Nesto");
		array.add("test");
		array.add("test");
		array.add("Nesto");
		array.add("poyy");
		array.add("details");
		array.add("Nesto");
		System.out.println("List with duplicates:");
		// ispis liste sa trenutnim elementima
		for (String string : array)
			System.out.print(string + " ");
		// pozivanje metode i mjenjanje nove liste bez duplikata sa starom
		array = removeDuplicates(array);
		System.out.println("\nList without duplicates:");
		// uspis nove liste
		for (String string : array)
			System.out.print(string + " ");

	}

}
