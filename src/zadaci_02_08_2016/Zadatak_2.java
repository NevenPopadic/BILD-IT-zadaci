package zadaci_02_08_2016;

import java.util.Scanner;

public class Zadatak_2 {

	public static void questionare(int a) {
		Scanner input2 = new Scanner(System.in); //otvaranje skenera u questionare metodi
		int counterN = 0; //brojac negativnih odgovora
		int counterP = 0; //brojac pozitivnih odgovora
		for (int i = 0; i < a; i++) { //petlja za postavljanje zeljenog broja pitanja
			int x = (int) (Math.random() * 10); //dobijanje prvog broja
			int y = (int) (Math.random() * 10);	//dobijanje drugog broja 
			System.out.println("Koliko je " + x + " - " + y + " ?"); //postavljanje pitanja korisniku
			if (input2.nextInt() != (x - y)) { //ispitivanje da li je odgovor netacan
				counterN++; //ukoliko je netacan povecavamo brojac negativnih odgovora za 1
			} else {
				counterP++; //ukoliko je tavan povecavamo brojac pozitivnih odgovora za 1
			}
		}
		input2.close(); //zatvaranje skenera u questionare metodi
		System.out.println("Korisnik je imao " + counterP + " tacnih i "
				+ counterN + " netacnih odgovora."); //ispis broja tacnih i netacnih odgovora
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //otvaranje skenera u main metodi
		System.out.println("Unesite broj pitanja: ");
		int num = input.nextInt(); //broj pitanja koliko korisnik zeli da mu se postavi
		questionare(num); //pozivanje metode "questonare"
		input.close(); //zatvaranje skenera u main metodi

	}

}
