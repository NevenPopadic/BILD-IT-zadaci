package zadaci_05_09_2016;

import java.util.ArrayList;

public class Zadatak_3 {
	/*
	 * (Create a rational-number calculator) Write a program similar to Listing
	 * 7.9, Calculator.java. Instead of using integers, use rationals, as shown
	 * in Figure 13.10a. You will need to use the split method in the String
	 * class, introduced in Section 10.10.3, Replacing and Splitting Strings, to
	 * retrieve the numerator string and denominator string, and convert strings
	 * into integers using the Integer.parseInt method.
	 */

	public static void main(String[] args) {
		// provjera da li je prosljedjen argument korektne duzine
		if (args.length != 3) {
			System.out.println("Invalid arguments.");
			System.exit(1);
		}
		// dodjeljivanje args u string s preko metode getLine
		String[] s = getLine(args);
		// dodjeljivanje nultog elementa u @op1; dodjeljivanje drugog elementa u
		// @op2
		Rational op1 = new Rational(s[0]);
		Rational op2 = new Rational(s[2]);
		// na osnovu operatora koji se nalazi na indexu 1 biramo sta cemo
		// ispisati
		switch (args[1]) {
		case "+":
			System.out.println(op1 + " " + args[1] + " " + op2 + " = "
					+ op1.add(op2));
			break;
		case "-":
			System.out.println(op1 + " " + args[1] + " " + op2 + " = "
					+ op1.subtract(op2));
			break;
		case "*":
			System.out.println(op1 + " " + args[1] + " " + op2 + " = "
					+ op1.multiply(op2));
			break;
		case "/":
			System.out.println(op1 + " " + args[1] + " " + op2 + " = "
					+ op1.divide(op2));
			break;
		}

	}

	// metoda za uzimanje argumenata iz args
	private static String[] getLine(String[] strings) {
		String line = " ";
		for (String s : strings) {
			line += " " + s;
		}

		String[] formated = line.split("[\\s ]");
		ArrayList<String> temp = new ArrayList<>();

		for (String s : formated) {
			if (s.length() != 0) {
				temp.add(s);
			}
		}
		return temp.toArray(new String[temp.size()]);
	}
}
