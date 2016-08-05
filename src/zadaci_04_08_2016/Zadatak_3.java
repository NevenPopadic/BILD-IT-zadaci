package zadaci_04_08_2016;

import java.util.Scanner;

public class Zadatak_3 {
	/*
	 * Napisati metodu sa sljedeæim headerom koja ispisuje tri broja u rastuæem
	 * redosljedu: public static void displaySortedNumbers(double num1, double
	 * num2, double num3). Napisati program koji pita korisnika da unese tri
	 * broja te ispiše ta tri broja u rastuæem redosljedu.
	 */

	public static void displaySortedNumbers(double num1, double num2,
			double num3) {
		double temp; //privremena promjenljiva
		//poredimo prvi i drugi broj, ukoliko je prvi veci, zamjenjuju mjesta
		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		//poredimo prvi i treci broj, ako je prvi veci zamjenjuju mjesta
		if (num1 > num3) {
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		//poredimo drugi i treci broj, ako je drugi veci zamjenjuju mjesta
		if (num2 > num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		//ispis sortiranih brojeva
		System.out.println(num1 + " " + num2 + " " + num3);

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite 3 broja: ");
		//unos 3 broja
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		input.close();
		//pozivanje metode za sortiranje
		displaySortedNumbers(number1, number2, number3);
	}

}
