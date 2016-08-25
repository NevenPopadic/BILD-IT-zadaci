package zadaci_24_08_2016;

import java.math.BigDecimal;

public class Zadatak_5 {
	/*
	 * (Divisible by 5 or 6) Find the first ten numbers greater than
	 * Long.MAX_VALUE that are divisible by 5 or 6.
	 */

	public static void main(String[] args) {
		BigDecimal bigNumber = new BigDecimal(Long.MAX_VALUE);
		int counter = 0;
		do {
			// deklarisanje djelioca 5 i 6
			BigDecimal bigFive = new BigDecimal(5);
			BigDecimal bigSix = new BigDecimal(6);
			// ispitujemo da li je broj djeljiv sa 5 ili 6
			if (bigNumber.remainder(bigFive).compareTo(BigDecimal.ZERO) == 0
					|| bigNumber.remainder(bigSix).compareTo(BigDecimal.ZERO) == 0) {
				counter++;
				System.out
						.println(counter
								+ ". broj (Long.MAX_VALUE) koji je djeljiv sa 5 ili 6 je: "
								+ bigNumber);
			}
			// povecavamo broj za 1
			bigNumber = bigNumber.add(BigDecimal.ONE);
		} while (counter < 10);
	}
}
