package zadaci_19_08_2016;

public class Zadatak_3 {
	/*
	 * (Largest row and column) Write a program that randomly fills in 0s and 1s
	 * into a 4-by-4 matrix, prints the matrix, and finds the first row and
	 * column with the most 1s.
	 */
	private static int[][] newMatrix(int a, int b) {
		// pravljenje @temp matrice
		int[][] temp = new int[a][b];
		// petlja za unos elemenata u matricu
		for (int i = 0; i < temp.length; i++) {
			for (int y = 0; y < temp[i].length; y++) {
				// unos elemenata u matricu pomocu @Math.random
				temp[i][y] = (int) (Math.round(Math.random() * 1));
				System.out.print(temp[i][y]);
			}
			System.out.println();
		}
		// slanje matrice nazad
		return temp;
	}

	public static int sumColumn(int[][] m, int columnIndex) {
		// varijabla @sum za smjestanje zbira elemenata iz trenutne kolone
		int sum = 0;
		// petlja za prolazak kroz redove
		for (int i = 0; i < m.length; i++) {
			sum += m[i][columnIndex];
		}
		// vracanje sume
		return sum;

	}

	public static int sumRow(int[][] m, int rowIndex) {
		// varijabla @sum za smjestanje zbira elemenata iz trenutnog reda
		int sum = 0;
		// petlja za prolazak kroz kolone
		for (int i = 0; i < m[0].length; i++) {
			sum += m[rowIndex][i];
		}
		// vracanje sume
		return sum;

	}

	public static void main(String[] args) {
		// pravljenje nove matrice pomocu metode @newMatrix
		int[][] matrix = newMatrix(4, 4);
		int max = 0;
		int maxColumn = 0;
		int maxRow = 0;
		// pronalazenje kolone sa najvecim brojem jedinica
		for (int i = 0; i < matrix.length; i++) {
			int temp = sumColumn(matrix, i);
			if (temp > max) {
				maxColumn = i;
				max = temp;
			}
		}
		// vracanje max na 0
		max = 0;
		// pronalazenje reda sa najvecim brojem jedinica
		for (int y = 0; y < matrix[0].length; y++) {
			int temp = sumRow(matrix, y);
			if (temp > max) {
				maxRow = y;
				max = temp;
			}
		}
		// ispis rezultata
		System.out.println("The largest row index is:" + maxRow);
		System.out.println("The largest column index:" + maxColumn);

	}

}
