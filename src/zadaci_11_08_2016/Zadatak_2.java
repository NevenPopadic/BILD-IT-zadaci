package zadaci_11_08_2016;

public class Zadatak_2 {
	/*
	 * Napisati program koji ispisuje sve proste brojeve od 2 do 1000,
	 * ukljuæujuæi i 2 i 1000. Program treba da ispiše 8 brojeva po liniji te
	 * razmak izmeðu brojeva treba da bude jedan space.
	 */

	public static void main(String[] args) {
		int counter = 0;
		// petlja za prolazak od 2 do 1000
		for (int i = 2; i <= 1000; i++) {
		// izraz za upit da li je trenutni broj prost pomocu metode @isPrime
			if (isPrime(i)) {
				System.out.print(i + " ");
				counter++;
				// izraz za ispitivanje da li je brojac djeljiv sa 8
				if (counter % 8 == 0) {
					System.out.println();
				}
			}
		}

	}

	private static boolean isPrime(int i) {
		for (int y = 2; y < i; y++) {
			if (i % y == 0 && y % 1 == 0) {
				return false;
			}
		}
		return true;
	}

}
