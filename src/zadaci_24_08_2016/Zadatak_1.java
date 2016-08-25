package zadaci_24_08_2016;

import java.math.BigDecimal;

public class Zadatak_1 {
	/*
	 * (Divisible by 2 or 3) Find the first ten numbers with 50 decimal digits
	 * that are divisible by 2 or 3.
	 */

	public static void main(String[] args) {
		String dec50 = "1";
		// kreairanje 50todecimalnog broja
		for (int i = 0; i < 49; i++) {

			dec50 += "0";
		}
		// pretvaranje stringa u @BigDecimal, tj numericki format
		BigDecimal opet50 = new BigDecimal(dec50);
		int counter = 0;
		do {
			// deklarisanje djelioca 1 i 2 tj (2 i 3)
			BigDecimal divider1 = opet50.remainder(new BigDecimal(2));
			BigDecimal divider2 = opet50.remainder(new BigDecimal(3));
			// ispitujemo da li je broj djeljiv sa @divider1 ili @divider 2
			if (divider1.equals(BigDecimal.ZERO)
					|| divider2.equals(BigDecimal.ZERO)) {
				counter++;
				System.out
						.println(counter
								+ ". broj (sa 50 decimala) koji je djeljiv sa 2 ili 3 je: "
								+ opet50);

			}
			// povecavamo broj za 1
			opet50 = opet50.add(BigDecimal.ONE);
		} while (counter < 10);
	}

}
