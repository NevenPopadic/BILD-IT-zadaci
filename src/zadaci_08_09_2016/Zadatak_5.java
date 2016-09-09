package zadaci_08_09_2016;

public class Zadatak_5 {
	/*
	 * (Generic binary search) Implement the following method using binary
	 * search. public static <E extends Comparable<E>> int binarySearch(E[]
	 * list, E key)
	 */
	public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
		// temporary varijable za odredjivanje granica pomocu kojih trazimo datu
		// vrijednost
		int low = 0;
		int high = list.length - 1;
		// petlja radi dok se low i high ne dobiju istu vrijednost
		while (high >= low) {
			// dobijamo srednju vrijednost na osnovu razlike izmedju @high i
			// @low
			int mid = (high - low) / 2 + low;
			// ukoliko smo pronasli trazenu vrijednost saljemo nazad @mid
			if (list[mid].compareTo(key) == 0)
				return mid;
			// ukoliko je vrijednost koju trazimo manja od key onda trazimo
			// vrijednosti ispod nje
			if (list[mid].compareTo(key) > 0) {
				high = mid - 1;
				// u protivnom drazimo vrijednosti iznad nje
			} else {
				low = mid + 1;
			}
		}
		// vracamo negativnu vrijednost ukoliko nismo nasli trazenu vrijednost
		return -1;
	}

	public static void main(String[] args) {
		// kreiranje liste sa elementima
		Integer[] array = { 1, 2, 3, 4, 6, 8, 10 };
		int key = 6;
		// pozivanje metode i ipsis tacnosti
		if (binarySearch(array, key) > 0)
			System.out.println("Location of element " + key
					+ " is in the list at index: " + binarySearch(array, key));
		else
			System.out.println("Element " + key + " is not in the list.");
	}

}
