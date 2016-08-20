package zadaci_19_08_2016;

public class Zadatak_1 {
	/*
	 * (Compute the weekly hours for each employee) Suppose the weekly hours for
	 * all employees are stored in a two-dimensional array. Each row records an
	 * employee’s seven-day work hours with seven columns. For example, the
	 * following array stores the work hours for eight employees. Write a
	 * program that displays employees and their total hours in decreasing order
	 * of the total hours.
	 */
	public static void main(String[] args) {
		// pozivanje metode za pravljenje matrice
		int[][] matrix = createMatrix();
		// matrica za unos radnika i radnih sati
		int[][] employee = new int[8][2];
		// petlja za racunanje sume iz svake sedmice i unosenje iste za datog
		// zaposlenog
		for (int i = 0; i < matrix.length; i++) {
			int sum = 0;
			for (int x = 0; x < matrix[i].length; x++) {
				sum += matrix[i][x];
			}
			employee[i][0] = i;
			employee[i][1] = sum;

		}
		// petlja za sortiranje u opadajucem redu
		for (int y = 0; y < employee.length - 1; y++) {
			for (int i = 1; i < employee.length; i++) {
				if (employee[i][1] > employee[i - 1][1]) {
					int tempSum = employee[i][1];
					employee[i][1] = employee[i - 1][1];
					employee[i - 1][1] = tempSum;

					int tempEmployee = employee[i][0];
					employee[i][0] = employee[i - 1][0];
					employee[i - 1][0] = tempEmployee;
				}
			}
		}
		// ispis radnika i ukupan broj radnih sati u opadajucem redoslijedu
		for (int i = 0; i < employee.length; i++) {
			System.out.println("Employee " + employee[i][0]
					+ " worked for total of " + employee[i][1] + " hours.");
		}
	}

	// pravljenje matrice
	private static int[][] createMatrix() {
		int[][] temp = { { 2, 4, 3, 4, 5, 8, 8 }, { 7, 3, 4, 3, 3, 4, 4 },
				{ 3, 3, 4, 3, 3, 2, 2 }, { 9, 3, 4, 7, 3, 4, 1 },
				{ 3, 5, 4, 3, 6, 3, 8 }, { 3, 4, 4, 6, 3, 4, 4 },
				{ 3, 7, 4, 8, 3, 8, 4 }, { 6, 3, 5, 9, 2, 7, 9 } };

		return temp;
	}
}
