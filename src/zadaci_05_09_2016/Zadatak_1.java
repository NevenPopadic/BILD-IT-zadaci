package zadaci_05_09_2016;

public class Zadatak_1 {
	/*
	 * (Demonstrate the benefits of encapsulation) Rewrite the Rational class in
	 * Listing 13.13 using a new internal representation for the numerator and
	 * denominator. Create an array of two integers as follows: private long[] r
	 * = new long[2]; Use r[0] to represent the numerator and r[1] to represent
	 * the denominator. The signatures of the methods in the Rational class are
	 * not changed, so a client application that uses the previous Rational
	 * class can continue to use this new Rational class without being
	 * recompiled.
	 */

	public static void main(String[] args) {
		// pravimo 2 objekta r1/r2 sa zadatim vrijednostima
		Rational r1 = new Rational(6, 9);
		Rational r2 = new Rational(7, 8);
		// sabiranje
		System.out.println(r1.add(r2));
		// oduzimanje
		System.out.println(r1.subtract(r2));
		// mnozenje
		System.out.println(r1.multiply(r2));
		// dijeljenje
		System.out.println(r1.divide(r2));
		// poredjenje jednakosti
		System.out.println(r1.equals(r2));
		// poredjenje vrijednosti
		System.out.println(r1.compareTo(r2));
	}

}

@SuppressWarnings("serial")
class Rational extends Number implements Comparable<Rational> {
	// element na indexu 0 je numerator, element na indexu 1 je denominator
	private long[] r = new long[2];

	// konstruktori
	public Rational(String s) {
		this(0, 1);
	}

	public Rational(long numerator, long deonminator) {
		long gcd = gcd(numerator, deonminator);
		this.r[0] = ((deonminator > 0) ? 1 : -1) * numerator / gcd;
		this.r[1] = Math.abs(deonminator) / gcd;
	}

	private static long gcd(long n, long d) {
		long n1 = Math.abs(n);
		long n2 = Math.abs(d);
		int gcd = 1;

		for (int k = 1; k <= n1 && k <= n2; k++) {
			if (n1 % k == 0 && n2 % k == 0) {
				gcd = k;
			}
		}
		return gcd;
	}

	// getteri
	public long getNumerator() {
		return r[0];
	}

	public long getDenominator() {
		return r[1];
	}

	// metoda za sabiranje racionalnih brojeva
	public Rational add(Rational secondRational) {
		long n = r[0] * secondRational.getDenominator() + r[1]
				* secondRational.getNumerator();
		long d = r[1] * secondRational.getDenominator();
		return new Rational(n, d);
	}

	// metoda za oduzimanje racionalnih brojeva
	public Rational subtract(Rational secondRational) {
		long n = r[0] * secondRational.getDenominator() - r[1]
				* secondRational.getNumerator();
		long d = r[1] * secondRational.getDenominator();
		return new Rational(n, d);
	}

	// metoda za mnozenje racionalnih brojeva
	public Rational multiply(Rational secondRational) {
		long n = r[0] * secondRational.getNumerator();
		long d = r[1] * secondRational.getDenominator();
		return new Rational(n, d);
	}

	// metoda za dijeljenje racionalnih brojeva
	public Rational divide(Rational secondRational) {
		long n = r[0] * secondRational.getDenominator();
		long d = r[1] * secondRational.getNumerator();
		return new Rational(n, d);
	}

	// metoda koja olaksava ispis
	@Override
	public String toString() {
		return r[1] == 1 ? r[0] + "" : r[0] + "/" + r[1];
	}

	// metoda za poredjenje jednakosti
	@Override
	public boolean equals(Object other) {
		return (this.subtract((Rational) (other))).getNumerator() == 0;
	}

	// metoda koja vraca vrijednost brojeva u double formatu
	@Override
	public double doubleValue() {
		return r[0] * 1.0 / r[1];
	}

	// metoda koja vraca vrijednost brojeva u float formatu
	@Override
	public float floatValue() {
		return (float) doubleValue();
	}

	// metoda koja vraca vrijednost brojeva u integer formatu
	@Override
	public int intValue() {
		return (int) doubleValue();
	}

	// metoda koja vraca vrijednost brojeva u long formatu
	@Override
	public long longValue() {
		return (long) doubleValue();
	}

	// metoda za poredjenje
	@Override
	public int compareTo(Rational o) {
		if (this.subtract(o).getNumerator() > 0)
			return 1;
		else if (this.subtract(o).getNumerator() < 0)
			return -1;
		else
			return 0;

	}

}
