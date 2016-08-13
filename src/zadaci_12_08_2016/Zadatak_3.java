package zadaci_12_08_2016;

public class Zadatak_3 {
	/*
	 * Napisati metodu sa sljedeæim headerom: public static int isPrime(int n)
	 * koja provjerava da li je broj prost/prime. Napsati test program koji
	 * poziva ovu metodu i ispisuje sve proste brojeve u rasponu od 0 do 100000.
	 */
	public static int isPrime(int n) {
		// petlja za ispitivanje da li je broj prost
		for (int i = 2; i < n; i++) {
			if (n % i == 0 && i % 1 == 0) {
				// ukoliko nije prost, vracamo 0
				return 0;
			}
		}
		// ukoliko nije djeljiv ni sa jednim brojem, onda je prost
		// broj i vracamo @n
		return n;
	}

	public static void main(String[] args) {
		// brojac za redove
		int counter = 0;
		// petlja za prolaz kroz brojeve
		for (int i = 0; i <= 100000; i++) {
			// izraz za pozivanje metode i upit da li je broj prost
			if (isPrime(i) != 0) {
				System.out.print(i + " ");
				counter++;
				if (counter % 10 == 0)
					System.out.println();
			}
		}
	}

}
