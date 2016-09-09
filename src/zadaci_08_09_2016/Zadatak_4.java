package zadaci_08_09_2016;

public class Zadatak_4 {
	/*
	 * (Maximum element in a two-dimensional array) Write a generic method that
	 * returns the maximum element in a two-dimensional array. public static <E
	 * extends Comparable<E>> E max(E[][] list)
	 */
	public static <E extends Comparable<E>> E max(E[][] list) {
		// pravimo @temp listu za smjestanje najveceg broja iz matrice
		E temp = list[0][0];
		for (int i = 0; i < list.length; i++) {
			for (int y = 0; y < list[i].length; y++) {
				// poredimo trenutni element u datom redu/koloni sa trenutnim
				// brojem u @temp, ukoliko je trenutni broj u listi veci od
				// @temp broja dodajemo taj broj na @temp i pri drugom prolasku
				// ga poredimo sa iducim, itd
				if (list[i][y].compareTo(temp) > 0) {
					temp = list[i][y];
				}
			}
		}
		// vracamo temp nazad
		return temp;
	}

	public static void main(String[] args) {
		// pravimo matricu
		Integer[][] matrix = { { 1, 2, 3 }, { 4, 6, 11 }, { 8, 10, 7 } };
		// pozivamo metodu i ispisujemo najveci element iz matrice
		System.out.println("Biggest element in matrix is: " + max(matrix));

	}

}
