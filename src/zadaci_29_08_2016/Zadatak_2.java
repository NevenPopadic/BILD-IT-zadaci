package zadaci_29_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_2 {
	/*
	 * (Algebra: perfect square) Write a program that prompts the user to enter
	 * an integer m and find the smallest integer n such that m * n is a perfect
	 * square. (Hint: Store all smallest factors of m into an array list. n is
	 * the product of the factors that appear an odd number of times in the
	 * array list. For example, consider m = 90, store the factors 2, 3, 3, 5 in
	 * an array list. 2 and 5 appear an odd number of times in the array list.
	 * So, n is 10.)
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer m: ");
		// unos m broja
		int m = input.nextInt();
		// cuvamo @m u @mSaved
		int mSaved = m;
		input.close();
		// kreiramo @array listu @array i pocetnog djelioca @i
		ArrayList<Integer> array = new ArrayList<Integer>();
		int i = 2;
		// petlja ce da radi dok @m ne bude jednak 1
		while (m != 1) {
			// ukoiko je @m djeljivo sa @i dodajemo i u listu @array
			if (m % i == 0) {
				array.add(i);
				m /= i;
				// ukoliko nije povecavamo @i tj djelilac sa 1
			} else
				i++;
		}
		// deklarisemo @temp za smjestanje sume; @counter kao brojac
		int temp = 1;

		// petlja za prolazak kroz @array listu
		for (int y = 0; y < array.size(); y++) {
			// pri svakom prolasku counter se setuje na 0
			int counter = 0;
			// ukoliko su trenutni broj na indexu @y i broj na indexu @x jednaki
			// povecavamo brojac za 1
			for (int x = 0; x < array.size(); x++) {
				if (array.get(y) == array.get(x))
					counter++;
			}
			// ukoliko brojac podjeljen sa 2 daje ostatak, mnozimo ga sa
			// @temp varijablom i dodajemo joj tu vrijednost
			if (counter % 2 == 1)
				temp *= array.get(y);
		}
		// ispis rezultata
		System.out
				.println("The smallest number n for m * n to be a perfect square is "
						+ temp + " m*n is " + (mSaved * temp));

	}
}
