package zadaci_17_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_5 {
	/*
	 * Napisati program koji uèitava 10 brojeva te ispisuje koilko je
	 * jedinstvenih brojeva unijeto te sve jedinstvene brojeve koji su unijeti,
	 * razmaknute jednim spaceom. Ukoliko se neki broj pojavljuje više puta,
	 * broj treba ispisati samo jednom.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// deklaracija @temp za unos od strane korisnika
		int temp;
		// kreiranje array liste
		ArrayList<Integer> tempArray = new ArrayList<Integer>();
		System.out.println("Unesite 10 brojeva:");
		// petlja za unos 10 brojeva
		for (int i = 0; i < 10; i++) {
			// dodjeljujemo unesen broj na @temp
			temp = input.nextInt();
			// ukoliko ArrayLista sadrzi @temp ne radimo nista
			if (tempArray.contains(temp)) {
			} else {
				// ukoliko ne sadrzi @temp, onda joj dodajemo @temp
				tempArray.add(temp);
			}
		}
		input.close();
		// ispis liste brojeva
		for (int i = 0; i < tempArray.size(); i++) {
			System.out.print(tempArray.get(i) + ", ");
		}

	}
}
