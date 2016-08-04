package zadaci_03_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_1 {
	public static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) { // petlja za ispitivanje da li je
											// broj prost
			if (number % i == 0 && i % 1 == 0) {
				return false; // ukoliko nije prost, vracamo false
			}
		}
		return true; // ukoliko nije djeljiv ni sa jednim brojem, onda je prost
						// broj i vracamo true
	}

	public static void prosti(int a, int b, int lines) {
		int counter = 0; // setovanje brojaca na 0 (pocetnu vrijednost)
		for (int i = a; i < b; i++) { // petlja za prolazak kroz opseg od
										// pocetnog do krajnjeg zadanog broja
			if (isPrime(i) && i != 1) { // "if" izraz u kome pozivamo "isPrime"
										// metodu koja provjerava da li je broj
										// prost
				System.out.print(i + " "); // stampanje prostog broja
				counter++; // povecavanje brojaca ukoliko smo istampali prost
							// broj
				if (counter % lines == 0) { // kada dodjemo do zadanog broja
											// brojeva po liniji prelazimo u
											// novi red
					System.out.println();
				}
			}
		}

	}

	public static int inputTry(int number) { //metoda za provjeravanje da li je uslov ispunjen
		if (number < 1)
			throw new InputMismatchException("Negativan broj.");
		return number;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = 0, y = 0, z = 0; //dodjeljivanje tipa varijablama
		boolean correct = true; //correct koristimo da unos traje sve dok korisnik ne unese odgovarajuce elemente
		while (correct) { //dok je uslov ispunjen program ce pitati korisnika da unese brojeve
			try { 

				System.out.println("Unesite pocetni broj (prirodan i veci od 0): ");
				x = input.nextInt(); // dodjela pocetnog broja
				inputTry(x); //slanje u inputTry metodu za provjeru uslova
				System.out.println("Unesite krajnji broj (prirodan i veci od 0): ");
				y = input.nextInt(); // dodjela krajnjeg broja
				inputTry(y);
				System.out.println("Unesite kolicinu brojeva po liniji (prirodan i veci od 0): ");
				z = input.nextInt(); // iznos elemenata/brojeva po liniji
				inputTry(z);
				correct = false; //petlja se zaustavlja i nastavlja se sa izvrsenjem programa
			} catch (InputMismatchException ex) { //hvatanje exceptiona i ispisivanje poruke
				System.out
						.println("Pogresno ste unijeli. Molimo vas unesite pozitivan cijeli broj(veci od 0).");
			}
		}
		input.close();
		prosti(x, y, z); // pozivanje metode

	}

}
