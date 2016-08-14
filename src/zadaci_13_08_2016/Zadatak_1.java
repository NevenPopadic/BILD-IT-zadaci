package zadaci_13_08_2016;

import java.util.Scanner;

public class Zadatak_1 {
	/*
	 * (Izraèunavanje napojnice) Napisati program koji uèitava ukupan iznos
	 * raèuna koji treba uplatiti kao i procenat tog raèuna kojeg želimo platiti
	 * kao napojnicu te izraèunava ukupan raèun i napojnicu. Na primjer, ukoliko
	 * korisnik unese 10 kao raèun i 15 % kao procenat za napojnicu program
	 * treba da ispiše da je ukupan raèun za uplatiti 11.5 a napojnica 1.5.
	 */
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Unesite iznos racuna: ");
		// unos racuna
		double bill = input.nextDouble();
		System.out.println("Unesite iznos napojnice (u procentima): ");
		// unos procenta napojnice
		double tip = input.nextDouble();
		// racunanje i ispis
		System.out.println("Ukupan racun iznosi " + (bill + (tip / 100 * bill))
				+ " a napojnica iznosi " + (tip / 100 * bill));
	}

}
