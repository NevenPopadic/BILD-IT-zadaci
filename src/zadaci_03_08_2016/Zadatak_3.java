package zadaci_03_08_2016;

import java.util.Scanner;

public class Zadatak_3 {
	public static boolean equals(int[] niz1, int[] niz2) { //metoda za ispitivanje identicnosti nizova
		for (int i = 0; i < niz1.length; i++) {
			if (niz1[i] != niz2[i]) { //provjera da li su clanovi na istim pozicijama razliciti
				return false; 
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite duzinu nizova: ");
		int duzina = input.nextInt();
		int[] array1 = new int[duzina]; //deklarisanje prvog niza
		int[] array2 = new int[duzina]; //deklarisanje drugog niza
		System.out.println("Unesite prvi niz od " + duzina + " elemenata: ");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = input.nextInt(); //unos elemenata u prvi niz
		}
		System.out.println("Unesite drugi niz od " + duzina + " elemenata; ");
		for (int i = 0; i < array2.length; i++) {
			array2[i] = input.nextInt(); //unos elemenata u drugi niz
		}
		input.close();
		if (equals(array1, array2)) { //pozivanje metode i provjera identicnosti
			System.out.println("Nizovi su identicni.");
		} else {
			System.out.println("Nizovi nisu identicni.");
		}
	}

}
