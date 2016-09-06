package zadaci_05_09_2016;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Zadatak_2 {
	/*
	 * (Use BigInteger for the Rational class) Redesign and implement the
	 * Rational class in Listing 13.13 using BigInteger for the numerator and
	 * denominator.
	 */

	public static void main(String[] args) {
		// pravimo 2 objekta r1/r2 sa zadatim vrijednostima
		RationalBI r1 = new RationalBI(new BigInteger("6"), new BigInteger("9"));
		RationalBI r2 = new RationalBI(new BigInteger("7"), new BigInteger("8"));
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
class RationalBI extends Number implements Comparable<RationalBI> {
	// element n je numerator, element d denominator
	private BigInteger n;
	private BigInteger d;

	// konstruktori
	public RationalBI() {
		this(BigInteger.ZERO, BigInteger.ONE);
	}

	public RationalBI(BigInteger n, BigInteger d) {
		BigInteger gcd = n.gcd(d);
		this.n = ((d.compareTo(BigInteger.ZERO) == 1) ? BigInteger.ONE
				: new BigInteger("-1")).multiply(n).divide(gcd);
		this.d = d.abs().divide(gcd);
	}

	public RationalBI(String s) {
		int index = (s.contains(".")) ? s.indexOf('.') : s
				.indexOf('/');
		BigInteger den;
		BigInteger num;
		// if string is in decimal form
		if (s.contains(".")) {
			int power = s.substring(index + 1, s.length()).length();
			den = new BigInteger((int) Math.pow(10, power) + "");
			num = new BigInteger(new StringBuilder(s).deleteCharAt(index)
					.toString());
		} else {
			// if string contains '/'
			num = new BigInteger(s.substring(0, index));
			den = new BigInteger(s.substring(index + 1, s.length()));
		}

		BigInteger gcd = gcd(num, den);
		this.n = ((den.compareTo(BigInteger.ZERO) > 0) ? BigInteger.ONE
				: new BigInteger("-1")).multiply(num).divide(gcd);
		this.d = den.abs().divide(gcd);

	}

	private static BigInteger gcd(BigInteger num, BigInteger den) {
		BigInteger n1 = num.abs();
		BigInteger n2 = den.abs();
		BigInteger gcd = BigInteger.ONE;

		for (BigInteger k = BigInteger.ONE; k.compareTo(n1) <= 0
				&& k.compareTo(n2) <= 0; k = k.add(BigInteger.ONE)) {
			if (n1.remainder(k).equals(BigInteger.ZERO)
					&& n2.remainder(k).equals(BigInteger.ZERO)) {
				gcd = k;
			}
		}
		return gcd;
	}

	// getteri
	public BigInteger getNumerator() {
		return n;
	}

	public BigInteger getDenominator() {
		return d;
	}

	// metoda za sabiranje racionalnih brojeva
	public RationalBI add(RationalBI secondRational) {
		BigInteger num = n.multiply(secondRational.getDenominator()).add(
				d.multiply(secondRational.getNumerator()));
		BigInteger den = d.multiply(secondRational.getDenominator());
		return new RationalBI(num, den);
	}

	// metoda za oduzimanje racionalnih brojeva
	public RationalBI subtract(RationalBI secondRational) {
		BigInteger num = n.multiply(secondRational.getDenominator()).subtract(
				d.multiply(secondRational.getNumerator()));
		BigInteger den = d.multiply(secondRational.getDenominator());
		return new RationalBI(num, den);
	}

	// metoda za mnozenje racionalnih brojeva
	public RationalBI multiply(RationalBI secondRational) {
		BigInteger num = n.multiply(secondRational.getNumerator());
		BigInteger den = d.multiply(secondRational.getDenominator());
		return new RationalBI(num, den);
	}

	// metoda za dijeljenje racionalnih brojeva
	public RationalBI divide(RationalBI secondRational) {
		BigInteger num = n.multiply(secondRational.getDenominator());
		BigInteger den = d.multiply(secondRational.getNumerator());
		return new RationalBI(num, den);
	}

	// metoda koja olaksava ispis
	@Override
	public String toString() {
		if (d.equals(BigInteger.ONE))
			return n + "";
		else
			return n + "/" + d;
	}

	// metoda za poredjenje jednakosti
	@Override
	public boolean equals(Object other) {
		if ((this.subtract((RationalBI) other)).getNumerator().compareTo(
				BigInteger.ZERO) == 0)
			return true;
		else
			return false;
	}

	// metoda koja vraca vrijednost brojeva u double formatu
	@Override
	public double doubleValue() {
		BigDecimal num = new BigDecimal(n);
		BigDecimal den = new BigDecimal(d);
		return num.divide(den).doubleValue();
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
	public int compareTo(RationalBI o) {
		if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) == 1)
			return 1;
		else if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) == -1)
			return -1;
		else
			return 0;
	}

}