package zadaci_10_08_2016;

public class Zadatak_2 {
	/*
	 * Twin prime brojevi su par prostih brojeva koji se razlikuju za 2. Na
	 * primjer, brojevi 3 i 5 su twin primes, brojevi 5 i 7 i 11 i 13 su takoðer
	 * twin primes. Napisati program koji ispisuje sve twin prime brojeve manje
	 * od 10000, 10 parova po liniji.
	 */

	public static void main(String[] args) {
		int counter = 0;
		// petlja za prolazak od 2 do 10000
		for (int i = 2; i < 10000; i++) {
			// upit da li su oba broja prime
			if (numIsPrime(i) && numIsPrime(i + 2)) {
				System.out.print(i + " " + (i + 2) + "  ");
				counter++;
				if (counter % 10 == 0)
					System.out.println();

			}
		}
	}

	private static boolean numIsPrime(int i) {
		for (int y = 2; y < i; y++) {
			if (i % y == 0)
				return false;
		}
		return true;
	}

}
