package zadaci_19_08_2016;

public class Zadatak_4 {
	/*
	 * (Sort two-dimensional array) Write a method to sort a two-dimensional
	 * array using the following header: public static void sort(int m[][]). The
	 * method performs a primary sort on rows and a secondary sort on columns.
	 */

	public static void sort(int m[][]) {
		for (int y = 0; y < m.length - 1; y++) {

			int indexNumber = y;
			// @currentRow na kome indexu se trenutno nalazimo
			int[] currentRow = m[y];
			for (int i = (y + 1); i < m.length; i++) {
				/*
				 * ukoliko je trenutni broj u trenutnim redu, veci od nekog
				 * broja u sledecim redovima; ili ukoliko je broj u trenutnom
				 * redu jednak broju u nekom od iducih redova dok je on veci od
				 * iducih brojeva, smjesticemo taj broj u trenutni broj/index
				 */
				if (currentRow[0] > m[i][0] || currentRow[0] == m[i][0]
						&& currentRow[1] > m[i][1]) {
					currentRow = m[i];
					indexNumber = i;
				}
			}
			// ukoliko smo zamjenili mjesta brojevima mjenjamo i index
			if (indexNumber != y) {
				m[indexNumber] = m[y];
				m[y] = currentRow;
			}
		}
		// ispis sortiranog niza
		for (int[] is : m) {
			for (int i : is) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// deklarisanje 2d niza
		int[][] array = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 },
				{ 4, 1 } };
		// pozivanje metode
		sort(array);

	}

}
