package zadaci_07_09_2016;

import java.util.Scanner;

public class Zadatak_3 {
	/*
	 * (Occurrences of a specified character in a string) Write a recursive
	 * method that finds the number of occurrences of a specified letter in a
	 * string using the following method header: public static int count(String
	 * str, char a) For example, count("Welcome", 'e') returns 2. Write a test
	 * program that prompts the user to enter a string and a character, and
	 * displays the number of occurrences for the character in the string.
	 */
	public static int count(String str, char a) {
		// ukoliko je duzina stringa 0, vracamo 0
		if (str.length() == 0)
			return 0;
		int count = 0;
		if (str.charAt(str.length() - 1) == a)
			count++;

		// pozivamo opet metodu, string umanjujemo za 1, i dodajemo count
		// vrijedost
		return count(str.substring(0, str.length() - 1), a) + count;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string:");
		// unos stringa
		String s = input.nextLine();
		System.out.println("Enter the character:");
		// unos karaktera
		char ch = input.next().charAt(0);
		input.close();
		// pozivanje metode
		System.out.println(count(s, ch));
	}

}
