package zadaci_11_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_5 {
	/*
	 * Napisati program koji uèitava neodreðen broj cijelih brojeva, odreðuje
	 * koliko je pozitivnih brojeva korisnik unijeo, koliko negativnih te
	 * izraèunava ukupnu sumu i prosjek svih unesenih brojeva. (Korisnik prekida
	 * unos tako što unese nulu). Na primjer, ukoliko korisnik unese 1 2 -1 3 0
	 * program treba da ispiše da je broj pozitivnih brojeva 3, negativnih
	 * brojeva 1, suma ili zbir su 5.0 a prosjek svih brojeva je 1.25.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out
				.println("Unesite neodredjeni broj cijelih brojeva(0 prekida unos):");
		// deklaracija brojaca @counter/counterP i sume @sum na 0
		int n = 0;
		int counter = 0;
		int countP = 0;
		double sum = 0;
		// petlja radi dok je @n tj unos razlicit on 0
		do {
			sum += n = input.nextInt();
			// u slucaju pozitivnih brojeva @countP se povecava za 1
			if (n > 0) {
				countP++;
			}
			// u slucaju bilo kog broja razlicitog on 0, @counter se povecava za 1
			if (n != 0) {
				counter++;
			}
		} while (n != 0);
		input.close();
		// provjera ukoliko je korisnik unijeo samo 0
		if (counter == 0) {
			System.out.println("Unijeli ste samo 0.");
		} else {
			// ispis rezultata
			System.out.println("Broj unesenih pozitivnih brojeva je " + countP
					+ ", negativnih " + (counter - countP)
					+ ", suma ili zbir su " + sum
					+ ", a prosjek svih brojeva je " + sum / counter);
		}
	}

}
