package zadaci_01_09_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak_2 {
	/*
	 * (Occurrences of each letter) Write a program that prompts the user to
	 * enter a file name and displays the occurrences of each letter in the
	 * file. Letters are case-insensitive.
	 */

	public static void main(String[] args) {
		System.out.print("Enter a filename: ");
		@SuppressWarnings("resource")
		// ucitavamo ime fajla preko inputa od strane korisnika
		File file = new File(new Scanner(System.in).next());
		// ukoliko fajl ne postoji ispisujemo poruku ispod i gasimo program
		if (!file.exists()) {
			System.out.println("File doesn't exist.");
			System.exit(1);
		}
		// pravimo string za smjestanje texta iz fajla
		String s = "";
		// pravimo array listu @letters za smjestanje koliko je se koje slovo
		// ponovilo sto radimo pomocu indexa
		int[] letters = new int[26];

		try {
			// otvaramo skener za citanje iz fjala
			Scanner input = new Scanner(file);
			// petlja radi dok ne dodjemo do zadnje linije u fajlu
			while (input.hasNext()) {
				// dodjeljujemo vrijednost linije na string @s
				s = input.nextLine();
				// prolazimo kroz karaktere iz array liste pomocu chara
				for (char ch : s.toCharArray()) {
					// svaki karakter prije provjere prebacujemo u veliko slovo
					// da je lakse brojati
					ch = Character.toUpperCase(ch);
					// provjeravamo da li je karakter slovo i ukoliko jeste na
					// njegovom indexu povecavamo vrijednost za 1
					if (isLetter(ch))
						// oduzimamo vrijednost sa @'A' iz razloga sto je to
						// prvo slovo pa cemo time npr ako od karaktera A
						// oduzmemo 'A' dobicemo 0 sto je prvi index u array
						// listi
						letters[ch - 'A']++;
				}
			}
			input.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
		// petlja sa kojom ispisujemo rezultat
		for (int i = 0; i < letters.length; i++)
			// ukoliko je mjesto u array listi prazno znaci da toga slova nije
			// bilo i njega cemo preskociti
			if (letters[i] > 0)
				System.out.println("Number of " + (char) (i + 'A') + "\'s: "
						+ letters[i]);

	}

	// metoda za provjeru da li je karakter slovo
	private static boolean isLetter(char ch) {
		return (ch >= 'A' && ch <= 'Z');
	}
}
