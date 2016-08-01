package zadaci_01_08_2016;

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //otvaranje skenera
		System.out.println("Unesite string: ");
		String rijec = input.next(); //unos stringa
		input.close(); //zatvaranje skenera
		int samoglasnici = 0; //promjenljiva za brojac samoglasnika
		int suglasnici = 0; //promjenljiva za brojac suglasnika
		for (int i = 0; i < rijec.length(); i++) { //petlja za prolazenje kroz string
			if (rijec.toUpperCase().charAt(i) == 'A' || rijec.toUpperCase().charAt(i) == 'E'
					|| rijec.toUpperCase().charAt(i) == 'I' || rijec.toUpperCase().charAt(i) == 'O'
					|| rijec.toUpperCase().charAt(i) == 'U') { //provjeravanje rijeci na datoj poziciji (i)
				
				samoglasnici++; //ukoliko je samoglasnik brojac se povecava za jedan
			} else {
			
				suglasnici++; //ukoliko je suglasnik brojac se povecava za jedan
			}
		}
		System.out.println("U stringu " + rijec + " imamo " + samoglasnici
				+ " samoglasnika i " + suglasnici + " suglasnika."); //ispis rezultata
	}
}
