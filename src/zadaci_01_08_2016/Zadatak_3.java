package zadaci_01_08_2016;

import java.util.Scanner;

public class Zadatak_3 {

	public static int djelilac(int a, int b) { //metoda za pronalazanje najveceg djelioca
	
		if (a < b) { //stavljanje broja "a" kao najveci broj zbog petlje (da ide od najveceg broja)
			int temp = a;
			a = b;
			b = temp;
		}
		for (int i = b; i > 0; i--) { //petlja za prolazenje od najmanjeg broja do 0
			if (a % i == 0 && b % i == 0) { //provjeravanje da li su oba broja djeljiva sa "i"
				return i; //vracanje najveceg djelioca
			}
		}
		return 0; //sprecavanje greske

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //otvaranje skenera
		System.out.println("Unesite prvi broj: ");
		int num1 = input.nextInt(); //unos prvog broja
		System.out.println("Unesite drugi broj: ");
		int num2 = input.nextInt(); // unos drugog broja
		input.close(); //zatvaranje skenera
		System.out.println("Najveci zajednicki djelilac za brojeve " + num1
				+ " i " + num2 + " je " + djelilac(num1, num2) + "."); //pozivanje metode i ispis 
	}

}
