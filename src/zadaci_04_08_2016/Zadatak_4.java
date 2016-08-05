package zadaci_04_08_2016;

public class Zadatak_4 {
	/*
	 * Napisati metodu koja printa 100 nasumiènih uppercase karaktera i 100
	 * nasumiènih brojeva, 10 po liniji.
	 */
	public static void printRandomStuff(int quantity, int numPerLineSize) {
		//petlja za stampanje karaktera
		for (int i = 0; i < quantity; i++) {
			System.out.print((char) (Math.random() * 26 + 65) + " ");
			if ((i + 1) % numPerLineSize == 0) {
				System.out.println();
			}

		}
		System.out.println();
		//petlja za stampanje brojeva
		for (int i = 0; i < quantity; i++) {
			System.out.print((int) (Math.random() * 10) + " ");
			if ((i + 1) % numPerLineSize == 0) {
				System.out.println();
			}

		}
	}

	public static void main(String[] args) {
		//pozivanje metode
		printRandomStuff(100, 10);

	}

}
