package zadaci_01_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // otvaranje skenera
		ArrayList<Integer> lista = new ArrayList<Integer>(); // deklarisanje
																// liste
		System.out.println("Unesite elemente niza(0 zatvara unos):");
		int temp = 1; // promjenljiva potrebna za ispunjavanje "while"
						// uslova/ulaska u petlju, i kasnije sluzi za
						// pronalazenje najveceg broja
		int counter = 0; // brojac za brojenje ponavljanja najveceg broja u
							// listi
		while (temp != 0) { // petlja za unos brojeva u listu, gdje nula prekida
							// unos
			temp = input.nextInt(); // dodjeljivanje broja promjenljivoj
			lista.add(temp); // ubacivanje promjenljive "temp" u listu
		}
		input.close(); // zatvaranje skenera
		for (int i = 0; i < lista.size() - 1; i++) { // petlja za trazenje
														// najveceg broja u
														// listi
			if (lista.get(i) < lista.get(i + 1)) {
				temp = lista.get(i + 1);
			} else {
				temp = lista.get(i);
			}
		}
		for (int i = 0; i < lista.size(); i++) { // prolazenje kroz niz i
													// brojenje koliko se
													// najveci broj ponovio u
													// datoj listi
			if (temp == lista.get(i)) { // provjeravanje da li se najveci broj i
										// broj na datom indexu u listi
										// poklapaju
				counter++; // ukoliko se poklapaju/su jednaki, brojac se
							// povecava
			}
		}
		System.out.println("Najveci broj u listi je " + temp
				+ " i on se ponavlja " + counter + " puta."); // ispisivanje
																// trazenog

	}
}
