package zadaci_02_08_2016;

import java.util.Scanner;

public class Zadatak_4 {
	public static void printMatrix(int n){ //matrix metoda
		for(int i = 0; i<n; i++){ //petlja za prolazak kroz redove
			for(int y = 0; y<n; y++){ //petlja za prolazak kroz brojeve u redu
				System.out.print((int)(Math.round(Math.random() * 1)) + " "); //ispisivanje 0 ili 1 pomocu Math.random
			}
			System.out.println(); //prelazak u novi red
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //otvaranje skenera
		System.out.println("Unesite n: "); 
		printMatrix(input.nextInt()); //pozivanje metode prilikom unosa od strane korisnika
		input.close(); //zatvaranje skenera
	}

}
