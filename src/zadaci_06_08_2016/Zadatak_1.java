package zadaci_06_08_2016;

import java.util.Scanner;

public class Zadatak_1 {
	/*
	 * Napisati program koji u�itava iznos investicije, godi�nju interesnu stopu
	 * i broj godina te vra�a budu�u vrijednost investicije koriste�i se
	 * sljede�om formulom: buducaVrijednostInvesticije = iznosInvesticije * (1 +
	 * mjesecnaInteresnaStopa)^brojGodina*12. Na primjer, ukoliko uneste kao
	 * iznos investicije 1000, 3.25 kao godi�nju interesnu stopu i 1 kao broj
	 * godina program vam vra�a 1032.98 kao buducu vrijednost investicije.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite isnos investicije: ");
		// @amount deklarisanje i unosenje kolicine novca koju korisnik zeli;
		double amount = input.nextDouble();
		System.out.println("Unesite godisnju interesnu stopu i broj godina: ");
		// @yearInterestRate godisnja interesna stopa
		double yearInterestRate = input.nextDouble();
		// @years iznos godina za simulaciju stednje
		int years = input.nextInt();
		input.close();
		// stampanje iznosa racuna nakon proteklog vremena
		System.out.printf("Buduca vrijednost investicije ce da iznosi %.2f",
		amount * Math.pow((1 + yearInterestRate/(100 * 12)), (years*12)));
	}
}
