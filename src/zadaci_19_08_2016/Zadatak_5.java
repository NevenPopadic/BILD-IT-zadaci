package zadaci_19_08_2016;

public class Zadatak_5 {
	/*
	 * (Even number of 1s) Write a program that generates a 6-by-6
	 * two-dimensional matrix filled with 0s and 1s, displays the matrix, and
	 * checks if every row and every column have an even number of 1s.
	 */
	private static int[][] newMatrix(int a, int b) {
		// pravljenje @temp matrice
		int[][] temp = new int[a][b];
		// petlja za unos elemenata u matricu
		for (int i = 0; i < temp.length; i++) {
			for (int y = 0; y < temp[i].length; y++) {
				// unos elemenata u matricu pomocu @Math.random
				temp[i][y] = (int) (Math.round(Math.random() * 1));
				System.out.print(temp[i][y] + " ");
			}
			System.out.println();
		}
		// slanje matrice nazad
		return temp;
	}

	public static void main(String[] args) {
		int[][] matrix = newMatrix(6, 6);
		// test za paran broj jedinica u svakom redu/koloni
		/*
		 * int[][] matrix = { { 1, 0, 0, 1, 0, 0 }, { 1, 0, 0, 1, 1, 1 }, { 0,
		 * 0, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 0 }, { 0, 1, 1, 0, 0, 0 }, { 1, 0,
		 * 1, 1, 1, 0 } };
		 */
		// @check odreduje tacnost uslova
		boolean check = true;
		// petljom prolazimo kroz redove/kolone u matrici
		for (int i = 0; i < matrix.length; i++) {
			// ukoliko red ili kolona nemaju paran broj jedinica stavljamo
			// @check na false
			if (Zadatak_3.sumRow(matrix, i) % 2 != 0
					|| Zadatak_3.sumColumn(matrix, i) % 2 != 0) {
				check = false;
			}

		}
		// ukoliko je check ostao true, onda svu svi redovi/kolone imali paran
		// broj jedinica
		if (check) {
			System.out.println("Svaki red i kolona imaju paran broj jedinica.");
		} else {
			System.out
					.println("Svaki red i kolona nemaju paran broj jedinica.");
		}

	}

}
