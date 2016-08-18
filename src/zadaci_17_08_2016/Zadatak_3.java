package zadaci_17_08_2016;

import java.util.Scanner;

public class Zadatak_3 {
	/*
	 * U javi, short vrijednost se sprema u samo 16 bita. Napisati program koji
	 * pita korisnika da unese short broj te mu ispiše svih 16 bita za dati
	 * cijeli broj. Na primjer, ukoliko korisnik unese broj 5 - program mu
	 * ispisuje 0000000000000101
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite short broj:");
		// unos short broja
		short user = input.nextShort();
		input.close();
		// ispis binarnog broja; @%016D, gdje 0 oznacava da cemo prazna polja
		// popuniti sa "0", a 16 koliko polja zelimo ukupno da ispisemo;
		// @toBinaryString nam sluzi da konvertujemo short broj u binarni broj
		System.out.printf("%016d ",
				Integer.parseInt(Integer.toBinaryString(user)));
	}

}
