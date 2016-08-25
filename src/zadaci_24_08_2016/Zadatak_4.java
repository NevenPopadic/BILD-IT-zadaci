package zadaci_24_08_2016;

import java.math.BigDecimal;

public class Zadatak_4 {
	/*
	 * (Mersenne prime) A prime number is called a Mersenne prime if it can be
	 * written in the form 2p - 1 for some positive integer p. Write a program
	 * that finds all Mersenne primes with p … 100 and displays the output as
	 * shown below. (Hint: You have to use BigInteger to store the number,
	 * because it is too big to be stored in long. Your program may take 
	 * SEVERAL
	 * HOURS
	 *  to run.)
	 */

	public static void main(String[] args) {
		// bigBoi promjenljiva za velike brojeve
		BigDecimal bigBoi;
		System.out.println("p   2^p - 1");
		int counter = 0;
		// petlja 
		for (int i = 2; counter <= 100; i++) {
			if (isPrime(new BigDecimal(i))) {
				bigBoi = mPrime(i);

				if (isPrime(bigBoi)) {
					System.out.printf("%-6d%s\n", i, bigBoi);
					counter++;
				}
			}
		}

	}

	private static BigDecimal mPrime(int num) {
		return new BigDecimal(2).pow(num).subtract(BigDecimal.ONE);
	}

	private static boolean isPrime(BigDecimal bigBoi) {
		// ukoliko je broj 2 da ispise njegov 2^p-1 prime
		if (bigBoi.compareTo(new BigDecimal(2)) == 0)
			return true;
		// stavljamo pocetni djelilac na 3 i u petlji cemo ga povecavati za dva, da
		// prodjemo kroz sve neparne brojeve
		BigDecimal divider = new BigDecimal(3);
		while (divider.multiply(divider).compareTo(bigBoi) <= 0) {
			if (bigBoi.remainder(divider).compareTo(BigDecimal.ZERO) == 0) {
				return false;
			}
			divider = divider.add(new BigDecimal(2));
		}

		return true;
	}

}
