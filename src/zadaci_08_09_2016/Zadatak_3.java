package zadaci_08_09_2016;

public class Zadatak_3 {
	/*
	 * (Maximum element in an array) Implement the following method that returns
	 * the maximum element in an array. public static <E extends Comparable<E>>
	 * E max(E[] list)
	 */
	public static <E extends Comparable<E>> E max(E[] list) {
		// provjeravamo da li poslata lista ima elemente
		if (list == null || list.length == 0)
			return null;
		// petlja za prolazak kroz listu
		for (int i = 0; i < list.length; i++) {
			// poredimo nulti element u listi sa trenutnim elementom i ukoliko
			// je razlika negativna, th ukoliko je drugi veci od prvog element
			// na nultom indexu postaje taj element na "i" indexu
			if (list[0].compareTo(list[i]) < 0) {
				list[0] = list[i];
			}
		}
		// saljemo element na nultoj poziciji nazad
		return list[0];
	}

	public static void main(String[] args) {
		// pravimo listu i pozivamo metodu
		Integer[] array = { 1, 2, 3, 4, 6, 11, 8, 10 };
		System.out.println("Biggest element in array is: " + max(array));
	}

}
