package zadaci_23_08_2016;

public class Zadatak_2 {
	/*
	 * (The MyInteger class) Design a class named MyInteger. The class contains:
	 * * An int data field named value that stores the int value represented by
	 * this object. * A constructor that creates a MyInteger object for the
	 * specified int value. * A getter method that returns the int value. * The
	 * methods isEven(), isOdd(), and isPrime() that return true if the value in
	 * this object is even, odd, or prime, respectively. * The static methods
	 * isEven(int), isOdd(int), and isPrime(int) that return true if the
	 * specified value is even, odd, or prime, respectively. * The static
	 * methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) that
	 * return true if the specified value is even, odd, or prime, respectively.
	 * * The methods equals(int) and equals(MyInteger) that return true if the
	 * value in this object is equal to the specified value. * A static method
	 * parseInt(char[]) that converts an array of numeric characters to an int
	 * value. * A static method parseInt(String) that converts a string into an
	 * int value.
	 */

	public static void main(String[] args) {
		// kreiranje novog objekta sa zadatom vrijednoscu
		MyInteger user = new MyInteger(8);
		// kreiranje niza @arrayC
		char[] arrayC = { '1', '2', '3' };
		// ispis za objekat user
		System.out.println("Number " + user.getValue() + " is even: "
				+ user.isEven());
		System.out.println("Number " + user.getValue() + " is odd: "
				+ user.isOdd());
		System.out.println("Number " + user.getValue() + " is prime: "
				+ user.isPrime());
		// ispis sa pozivanjem klase @MyInteger i prosljedjujuci joj zadatu
		// vrijednost
		System.out
				.println("Number " + 23 + " is even: " + MyInteger.isEven(23));
		System.out.println("Number " + 23 + " is odd: " + MyInteger.isOdd(23));
		System.out.println("Number " + 23 + " is prime: "
				+ MyInteger.isPrime(23));
		// konverzija karaktera u int
		System.out.println("Char to Int: " + MyInteger.parseInt(arrayC));
		// konverzija stringa u int
		System.out.println("String of \"321\" to Int: "
				+ MyInteger.parseInt("321"));
	}

}

class MyInteger {
	private int value;

	public MyInteger(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public boolean isEven() {
		return (value % 2 == 0) ? true : false;
	}

	public boolean isOdd() {
		return (value % 2 != 0) ? true : false;
	}

	public boolean isPrime() {
		for (int i = 2; i < value; i++) {
			if (value % i == 0)
				return false;
		}
		return true;
	}

	public static boolean isEven(int n) {
		return (n % 2 == 0) ? true : false;
	}

	public static boolean isOdd(int n) {
		return (n % 2 != 0) ? true : false;
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static boolean isEven(MyInteger n) {
		return isEven(n);
	}

	public static boolean isOdd(MyInteger n) {
		return isOdd(n);
	}

	public static boolean isPrime(MyInteger n) {
		return isPrime(n);
	}

	boolean equals(int n) {
		return (value == n) ? true : false;
	}

	boolean equals(MyInteger n) {
		return equals(n);
	}

	static int parseInt(char[] c) {
		int n = 0;
		for (char d : c) {
			n *= 10;
			n += d - 48;
		}
		return n;
	}

	static int parseInt(String s) {
		return Integer.parseInt(s);
	}

}