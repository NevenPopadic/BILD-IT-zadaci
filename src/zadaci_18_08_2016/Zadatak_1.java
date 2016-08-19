package zadaci_18_08_2016;

public class Zadatak_1 {
	/*
	 * (Count single digits) Write a program that generates 100 random integers
	 * between 0 and 9 and displays the count for each number. (Hint: Use an
	 * array of ten integers, say counts, to store the counts for the number of
	 * 0s, 1s, . . . , 9s.)
	 */

	public static void main(String[] args) {
		// lista za smjestanje koliko se koji broj puta ponovio
		int[] counts = new int[10];
		// petlja za generisanje 100 random brojeva
		for (int i = 0; i < 100; i++) {
			counts[(int)(Math.random()*10)]++;
		}
		// petlja za ispis koliko se koji broj puta ponovio
		for (int y = 0; y < counts.length; y++) {
			if (counts[y] != 0) {
				System.out.println("Broj " + y + " se ponovio " + counts[y]
						+ " puta.");
			}
		}
	}
}
