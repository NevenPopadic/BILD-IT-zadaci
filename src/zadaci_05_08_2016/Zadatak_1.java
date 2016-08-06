package zadaci_05_08_2016;

import java.util.Scanner;

public class Zadatak_1 {
	/*
	 * Pretpostavimo da uplatimo $100 svaki mjesec na �tedni ra�un koji ima
	 * godi�nju interesnu stopu od 5%. Mjese�na interesna stopa je stoga 0.05 /
	 * 12 = 0.00417. Nakon prvog mjeseca vrijednost na ra�unu postaje 100 * (1 +
	 * 0.00417) = 100.417. Nakon drugog mjeseca, vrijednost na ra�unu postaje
	 * (100 + 100.417) * (1 + 0.00417) = 201.252. Nakon tre�eg mjeseca,
	 * vrijednost na ra�unu postaje (100 + 201.252) * (1 + 0.00417) = 302.507 i
	 * tako dalje. Napisati program koji pita korisnika da unese mjese�ni iznos
	 * �tednje te broj mjeseci nakon kojeg bi �elio znati stanje ra�una.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite mjesecni isnos stednje: ");
		// @amount deklarisanje i unosenje kolicine novca koju korisnik zeli;
		// @total deklarisanje ukupnog iznosa nakon odredjenog mjesecnog perioda
		double amount = input.nextDouble(), total = 0;
		System.out.println("Unesite broj mjeseci nakon kojega bi zeljeli "
				+ "znati iznos na racunu: ");
		// @months unosenje perioda u mjesecima
		int months = input.nextInt();
		input.close();
		// simulacija proteka mjeseci, i dobijanje iznosa racuna
		for (int i = 0; i < months; i++) {
			total = (amount + total) * ((1 + 0.00417));
		}
		// stampanje kolicine proteklog vremena i iznosa racuna
		System.out.printf("Za %d mjeseci vasa ustedjevina ce da iznosi %.2f",
				months, total);
	}
}
