package zadaci_08_09_2016;

public class Zadatak_2 {
	/*
	 * (Generic linear search) Implement the following generic method for linear
	 * search. public static <E extends Comparable<E>> int linearSearch(E[]
	 * list, E key)
	 */
	public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
		// petlja za prolazak kroz listu
		for (int i = 0; i < list.length; i++) {
			// poredjenje "key" elementa sa trenutnim elementom na poziciji "i"
			// u listi, ukoliko je on u listi vracamo njegov index
			if (key.compareTo(list[i]) == 0) {
				return i;
			}
		}
		// ukoliko element nije u listi vracamo -1
		return -1;

	}

	public static void main(String[] args) {
		// kreiranje liste sa elementima
		Integer[] array = { 1, 2, 3, 4, 6, 8, 10 };
		int key = 6;
		// pozivanje metode i ipsis tacnosti
		if (linearSearch(array, key) > 0)
			System.out.println("Location of element " + key
					+ " is in the list at index: " + linearSearch(array, key));
		else
			System.out.println("Element " + key + " is not in the list.");
	}

}
