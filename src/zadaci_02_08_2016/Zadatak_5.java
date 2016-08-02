package zadaci_02_08_2016;

import java.util.Scanner;

public class Zadatak_5 {
	public static void coin(int n) { //novcic metoda
		int counterP = 0; //brojac za pismo
		int counterG = 0; //brojac za glavu
		int temp; //privremena varijabla za smjestanje "random" broja
		for (int i = 0; i < n; i++) { //petlja za simulaciju bacanja novcica

			temp = (int) (Math.round(Math.random() * 1)); //dodjeljivanje vrijednosti novcica (mathrandom) na "temp" varijablu
			System.out.print(temp + " "); //ispisivanje rezultata
			if (temp == 0) { //ispitivanje uslova da li je rezultat 0 (pismo)
				counterP++; //povecavanje brojaca "pismo" za 1
			} else {
				counterG++; //povecavanje brojaca "glava" za 1
			}
		}
		System.out.println("\nNovcic je pao na pismo " + counterP
				+ " puta, a na glavu " + counterG + " puta."); //ispisivanje rezultata
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // otvaranje skenera
		System.out.println("Unesite koliko puta zelite baciti novcic: ");
		coin(input.nextInt()); // pozivanje metode prilikom unosa od strane
								// korisnika
		input.close(); // zatvaranje skenera
	}

}
