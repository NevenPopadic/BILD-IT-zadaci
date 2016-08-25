package zadaci_24_08_2016;

import java.math.BigInteger;

public class Zadatak_3 {
	/*
	 * (Large prime numbers) Write a program that finds five prime numbers
	 * larger than Long.MAX_VALUE.
	 */
	// evo pa testiraj...
	public static void main(String[] args) {
		// pocetna Int vrijednost
		BigInteger soBig = new BigInteger(Long.MAX_VALUE + "");
		int counter = 0;
		// ide petlja i ode, radi do djurdjeva dana, cooler vristi
		do {
			int hype = 0;
			// radi dok ne nadjemo prvi prime broj
			while (true) {
				// ako nadje broj, povecava @counter za 1 i ispisuje ga, zatim
				// prekida @while petlju
				if (isPrime(soBig)) {
					counter++;
					System.out
							.println(counter
									+ ". prime number bigger than LONG.MAX_VALUE range is "
									+ soBig);
					break;
				}
				// povecavamo trenutni broj za 1
				soBig = soBig.add(BigInteger.ONE);
				// hype metar
				if (hype % 10 == 0) {
					System.out.println("Samo sto nije...");
				}
				hype++;

			}
			// povecava broj za 1 ukoliko nadjemo prime
			soBig = soBig.add(BigInteger.ONE);
		} while (counter < 5);

	}

	public static boolean isPrime(BigInteger soBig) {
		// pocetni broj stavljamo na pola od dobijenog
		BigInteger n = soBig.divide(new BigInteger("2"));
		// petlja za ispitivanje da li je broj prost
		for (BigInteger i = new BigInteger("2"); i.compareTo(n) <= 0; i = i
				.add(BigInteger.ONE)) {
			if (soBig.remainder(i).equals(BigInteger.ZERO))
				// je djeljiv sa i, vracamo false
				return false;
		}
		return true;
	}
}
