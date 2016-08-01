package zadaci_01_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_1 {

	public static Integer max(ArrayList<Integer> list) {

		if (list.size() == 0) { //provjeravanje da li je lista prazna
			return null; //ukoliko je prazna vraca se null vrijednost
		}
		int num = list.get(0); //dodjeljivanje privremene varijable za porednjeje elemenata u listi
		for (int i = 0; i < list.size(); i++) { 
			if (list.get(i) > num) { //poredjenje elemenata u listi
				num = list.get(i); // num uzima vrijednost veceg elementa
			}
		}
		return num; //vracamo najveci element u listi

	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //otvaranje skenera
		ArrayList<Integer> lista = new ArrayList<Integer>(); //kreiranje array liste
		System.out.println("Unesite duzinu liste: "); 
		int duzina = input.nextInt(); //unos duzine liste
		System.out.println("Unesite " + duzina + " elemenata: ");
		for (int i = 0; i < duzina; i++) { //petlja za unos elemenata
			lista.add(input.nextInt()); //dodjeljivanje elemenata listi
		}
		input.close(); //zatvaranje skenera
		System.out.println(max(lista)); // pozivanje metode ^

	}
}
