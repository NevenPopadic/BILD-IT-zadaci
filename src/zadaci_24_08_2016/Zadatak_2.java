package zadaci_24_08_2016;

import java.math.BigDecimal;

public class Zadatak_2 {
	/*
	 * (Square numbers) Find the first ten square numbers that are greater than
	 * Long.MAX_VALUE. A square number is a number in the form of n2. For
	 * example, 4, 9, and 16 are square numbers. 
	 * Find an efficient approach to run your program fast.
	 */

	public static void main(String[] args) {
		// uzimamo pocetni kvadratni broj
		BigDecimal s = new BigDecimal((long) Math.sqrt(Long.MAX_VALUE));
		int counter = 0;
		
		while (counter < 10) {
			// mnozimo prvi broj sa istim
			BigDecimal square = s.multiply(s);
			// povecavanje brojaca za 1 i ispis broja
			counter++;
			System.out
					.println(counter
							+ ". kvadratni broj u formi n^2 u (Long.MAX_VALUE) opsegu je: "
							+ square);
			// povecavanje broja za 1
			s = s.add(BigDecimal.ONE);
		}
	}
}
