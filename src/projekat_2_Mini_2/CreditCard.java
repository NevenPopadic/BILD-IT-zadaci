package projekat_2_Mini_2;

import java.util.Scanner;

public class CreditCard {
	static int VISA = 4;
	static int MASTER = 5;
	static int AMERICAN = 37;
	static int DISCOVER = 6;

	// Return true if the card number is valid
	public static boolean isValid(long number) {
		if (getSize(number) > 12 && getSize(number) < 17) {
			if ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0) {
				return true;
			}
		}
		return false;
	}

	// Get the result from Step 2
	public static int sumOfDoubleEvenPlace(long number) {
		String userS = Long.toString(number);
		int sum = 0;
		for (int i = 0; i < userS.length(); i += 2) {
			sum += getDigit(2 * Character.getNumericValue(userS.charAt(i)));
		}
		return sum;
	}

	// Return this number if it is a single digit, otherwise, return the sum of
	// the two digits

	public static int getDigit(int number) {
		if (number > 9) {
			return (number % 10 + number / 10);
		}
		return number;
	}

	// Return sum of odd-place digits in number
	public static int sumOfOddPlace(long number) {
		String userS = Long.toString(number);
		int sum = 0;
		for (int i = 1; i < userS.length(); i += 2) {
			sum += Character.getNumericValue(userS.charAt(i));
		}
		return sum;
	}

	// Return true if the digit d is a prefix for number
	public static boolean prefixMatched(long number, int d) {
		return (getPrefix(number, getSize(d))) == d;
	}

	// Return the number of digits in d
	public static int getSize(long d) {
		return Long.toString(d).length();

	}

	// Return the first k number of digits from number. If the number of digits
	// in number is less than k, return number.

	public static long getPrefix(long number, int k) {
		String userS = Long.toString(number);
		if (userS.length() < k) {
			return number;
		}
		return Long.valueOf(userS.substring(0, k));
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a credit card as a long integer: ");
		long user = input.nextLong();
		input.close();
		if (isValid(user)) {
			System.out.println(user + " is valid");
		} else {
			System.out.println(user + " is invalid");
		}

	}

}
