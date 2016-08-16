package zadaci_16_08_2016;

import java.util.Scanner;

public class Zadatak_2 {
	/*
	 * Napisati program koji igra sa protivnikom rock-paper-scissors.
	 * (papir-bunar-makaze ili tako nekako po naški) Program nasumièno generiše
	 * brojeve 0, 1 i 2 koji predstavljaju papir, bunar i makaze. Program pita
	 * korisnika da unese 0, 1 ili 2 te mu ispisuje poruku da li je korisnik
	 * pobijedio, da li je raèunar pobijedio ili je bilo neriješeno.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite 0 (papir), 1(bunar) ili 2(makaze):");
		// pravljenje stringa za nazive
		String[] types = { "papir", "bunar", "makaze" };
		// unos korisnika
		int user = input.nextInt();
		input.close();
		int pc = (int) (Math.random() * 3);
		// poredjenje rezultata i ispis rezultata
		if (user == pc) {
			System.out.println("Nerjeseno je, oboje ste unijeli " 
		+ types[user]);
		} else if (pc == 0) {
			if (user == 1) {
				System.out.println("Izgubili ste, odigrali ste " + types[user]
						+ ", a racunar je odigrao " + types[pc]);
			}
			if (user == 2)
				System.out.println("Pobjedili ste, odigrali ste " + types[user]
						+ ", a racunar je odigrao " + types[pc]);

		} else if (pc == 1) {
			if (user == 2) {
				System.out.println("Izgubili ste, odigrali ste " + types[user]
						+ ", a racunar je odigrao " + types[pc]);
			} else {
				System.out.println("Pobjedili ste, odigrali ste " + types[user]
						+ ", a racunar je odigrao " + types[pc]);
			}
		} else if (pc == 2) {
			if (user == 0) {
				System.out.println("Izgubili ste, odigrali ste " + types[user]
						+ ", a racunar je odigrao " + types[pc]);
			} else {
				System.out.println("Pobjedili ste, odigrali ste " + types[user]
						+ ", a racunar je odigrao " + types[pc]);
			}
		}

	}

}
