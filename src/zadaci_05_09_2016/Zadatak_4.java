package zadaci_05_09_2016;

public class Zadatak_4 {
	/*
	 * (Math: The Complex class) A complex number is a number in the form a +
	 * bi, where a and b are real numbers and i is 2-1. The numbers a and b are
	 * known as the real part and imaginary part of the complex number,
	 * respectively. You can perform addition, subtraction, multiplication, and
	 * division for complex numbers using the following formulas: a + bi + c +
	 * di = (a + c) + (b + d)i a + bi - (c + di) = (a - c) + (b - d)i (a +
	 * bi)*(c + di) = (ac - bd) + (bc + ad)i (a + bi)/(c + di) = (ac + bd)/(c2 +
	 * d2) + (bc - ad)i/(c2 + d2) You can also obtain the absolute value for a
	 * complex number using the following formula:  a + bi  = 2a2 + b2 (A
	 * complex number can be interpreted as a point on a plane by identifying
	 * the (a,b) values as the coordinates of the point. The absolute value of
	 * the complex number corresponds to the distance of the point to the
	 * origin, as shown in Figure 13.10b.) Design a class named Complex for
	 * representing complex numbers and the methods add, subtract, multiply,
	 * divide, and abs for performing complexnumber operations, and override
	 * toString method for returning a string representation for a complex
	 * number. The toString method returns (a + bi) as a string. If b is 0, it
	 * simply returns a. Your Complex class should also implement the Cloneable
	 * interface. Provide three constructors Complex(a, b), Complex(a), and
	 * Complex(). Complex() creates a Complex object for number 0 and Complex(a)
	 * creates a Complex object with 0 for b. Also provide the getRealPart() and
	 * getImaginaryPart() methods for returning the real and imaginary part of
	 * the complex number, respectively. Write a test program that prompts the
	 * user to enter two complex numbers and displays the result of their
	 * addition, subtraction, multiplication, division, and absolute value.
	 */

	public static void main(String[] args) {
		// testiranje rezultata po zadatim zadacima iz knjige
		System.out.println(new Complex(3.5, 5.5).add(new Complex(-3.5, 1)));
		System.out
				.println(new Complex(3.5, 5.5).subtract(new Complex(-3.5, 1)));

		System.out
				.println(new Complex(3.5, 5.5).multiply(new Complex(-3.5, 1)));
		System.out.println(new Complex(3.5, 5.5).divide(new Complex(-3.5, 1)));
	}

}

class Complex {
	private double a;
	private double b;

	// konstruktori
	public Complex() {
		this(0);
	}

	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public Complex(double a) {
		this(a, 0);
	}

	// metoda za sabiranje
	public Complex add(Complex complex) {
		return new Complex((a + complex.a), (b + complex.b));
	}

	// metoda za oduzimanje
	public Complex subtract(Complex complex) {

		return new Complex((a - complex.a), (b - complex.b));

	}

	// metoda za mnozenje
	public Complex multiply(Complex complex) {

		return new Complex((a * complex.a - b * complex.b), (b * complex.a + a
				* complex.b));

	}

	// metoda za djeljenje
	public Complex divide(Complex complex) {

		return new Complex((a * complex.a + b * complex.b)
				/ ((Math.pow(complex.a, 2) + Math.pow(complex.b, 2))), (b
				* complex.a - a * complex.b)
				/ ((Math.pow(complex.a, 2) + Math.pow(complex.b, 2))));
	}

	// metoda za dobijanje absolutne vrijednosti
	public double abs() {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}

	// dobijanje realnog
	public double getReal() {
		return a;
	}

	// dobijanje imaginarnog broja
	public double getImaginary() {
		return b;
	}

	// metoda za olaksavanje pri ispisu
	@Override
	public String toString() {
		if (b == 0) {
			return a + "";
		} else {
			return String.format("(%.2f + %.2fi)", this.a, this.b);
		}
	}

	// metoda za kloniranje
	@Override
	public Complex clone() {
		return new Complex(this.a, this.b);

	}

}