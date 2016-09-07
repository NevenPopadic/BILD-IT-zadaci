package zadaci_06_09_2016;

public class Zadatak_3 {
	/*
	 * (Sum series) Write a recursive method to compute the following series:
	 * m(i) = 1 + 1 2 + 1 3 + c + 1 i Write a test program that displays m(i)
	 * for i = 1, 2, . . ., 10.
	 */

	public static void main(String[] args) {
		// 'm(i) = 1 + 1 2 + 1 3 + c + 1'
		for (int i = 1; i <= 10; i++) {
			System.out.printf("m(" + i + ")= %.3f\n", m(i));
		}
	}

	// vraca sumu od serije brojeva
	public static double m(int i) {
		if (i == 1) {
			return 1;
		}
		return m(i - 1) + (1.0 / i);
	}

}
