package zadaci_16_08_2016;

public class Zadatak_4 {
	/*
	 * Napisati metodu koja izraèunava zbir svih brojeva u cijelom broju.
	 * Koristite sljedeæi header: public static int sumDigits(long n). Na
	 * primjer, ako pozovemo metodu i proslijedimo joj broj 234 (sumDigits(234))
	 * metoda treba da vrati 9. (2 + 3 + 4 = 9)
	 */
	public static int sumDigits(long n) {
		int sum = 0;
		// petlja radi dok je proslijedjen broj razlicit od 0
		while (n != 0) {
			// dodavanje najmanje decimale na sumu
			sum += n % 10;
			// skracivanje brojeva, tj oduzimanje zadnje decimale od
			// proslijedjenog broja
			n /= 10;
		}
		// vracanje sume
		return sum;
	}

	public static void main(String[] args) {
		// pozivanje metode @sumDigits i ispis sume proslijedjenih brojeva
		System.out.println(sumDigits(234));

	}

}
