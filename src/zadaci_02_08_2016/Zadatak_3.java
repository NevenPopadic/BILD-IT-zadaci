package zadaci_02_08_2016;

import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) throws Exception {
		java.io.File file = new java.io.File(
				"C:\\Users\\Neven\\git\\BILD-IT-zadaci\\src\\zadaci_02_08_2016\\NestoNesto.txt"); //ucitavanje fajla u "file" iz odgovarajuceg direktorija
		Scanner input = new Scanner(file); //citanje iz fajla
		int words = 0; //brojac za rijeci
		int lines = 0; //brojac za redove
		int characters = 0; //brojac za broj karaktera u fajlu

		while (input.hasNext()) { //prolazak kroz rijeci u text fajlu
			words++; //za svaku rijec se brojac povecava za jedan
			String temp = input.next(); //ciscenje/sklanjanje/smjestanje trenutne rijeci, da bi smo presli na sledecu, tj ucitavamo ju u "temp" varijablu
		}
		input.close(); //zatvaranje citaca/skenera
		Scanner inputL = new Scanner(file); //otvaranje novog skenera
		while (inputL.hasNextLine()) { //prolazak kroz redove
			String[] temp = inputL.nextLine().split(" "); //uklanjanje razmaka u redu i dodjeljivanje takvog na "temp" varijablu
			for (String string : temp) { //prolazak kroz temp varijablu
				characters += string.length(); //brojenje/dodavanje broja karaktera na "characters" varijablu
			}
			if (temp.length > 0)
				lines++; //povecavanje broja redova za 1 ukoliko red nije prazan
		}

		System.out.println("Broj karaktera u datom fajlu je: " + characters
				+ " , rijeci " + words + " i redova " + lines); //ispis rezultata
		inputL.close(); //zatvaranje citaca/skenera
	}

}
