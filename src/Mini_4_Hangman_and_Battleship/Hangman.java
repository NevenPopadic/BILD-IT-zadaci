package Mini_4_Hangman_and_Battleship;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Hangman {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// char @user za unos korisnika
		char user;
		// random varijabla za biranje rijeci iz string arraya
		Random random = new Random();
		// string array za smjestanje rijeci
		String[] words = { "NestoNesto", "TestTest", "MiniProjekat" };
		// dok je @playing true, igra se izvrsava
		boolean playing = true;

		// glavna petlja igre
		while (playing) {
			System.out.println("Welcome to game of hangman!");
			// uzimamo nasumicnu rijec iz string arraya
			char[] randomWord = words[random.nextInt(words.length)]
					.toCharArray();
			char[] playerGuess = new char[randomWord.length];
			// popunjavamo korisnikov array sa "_"
			for (int i = 0; i < playerGuess.length; i++) {
				playerGuess[i] = '_';

			}
			// deklarisanje @win koji sluzi za odredjivanje pobjednika i
			// zaustavljanje petlje
			boolean win = false;
			// varijabla za broj preostalih pokusaja
			int tries = 0;
			// petlja u kojoj se igra izvrsava sve dok korisnik ne pobjedi ili
			// dok ne pogrijesi 7 puta
			while (!win && tries != 7) {
				// @correct nam sluzi za provjeru da li je korisnik unijeo tacan
				// unos
				boolean correct = true;
				System.out.println("Current guesses: ");
				// stampanje arraya praznog + sa trenutnim pogodjenim slovima
				// unesenim od korisnika
				printArray(playerGuess);
				System.out.printf("You have %d tries left.\n", 7 - tries);
				System.out
						.println("Enter a single character (*to exit input 0*): ");

				user = checkInput();
				// ukoliko korisnik unese 0 igra se zaustavlja
				if (user == '0') {
					win = true;
					playing = false;
					break;
					// provjeravamo unos korisnika da li se uneseni karakter
					// nalazi u trenutnoj rijeci
				} else {
					for (int i = 0; i < randomWord.length; i++) {
						if (Character.toLowerCase(randomWord[i]) == user
								|| Character.toUpperCase(randomWord[i]) == user) {
							playerGuess[i] = user;
							correct = true;
						}

					}
					// ukoliko korisnik nije pogodio slovo, broj pokusaja @tries
					// se povecava za 1
					if (!correct)
						tries++;
				}
				// pozivanje metode za provjeru da li je korisnik pobjedio
				if (checkWin(playerGuess)) {
					win = true;
					System.out.println("Good Game, Well Played!");
				}
			}
			// ukoliko korisnik ostaje bez pokusaja ispisuje ovo poruku, zatim
			// ga pita da li hoce igrati jos
			if (!win)
				System.out.println("You have no guesses left :O");
			if (playing) {
				System.out
						.println("Do you wanna play another game? (insert N to exit, any other letter to play again)");
				user = checkInput();
				if (user == 'N' || user == 'n')
					playing = false;

			}

		}
	}

	// metoda za provjeru unosa
	private static char checkInput() {
		char user = '_';
		boolean inputCheck = true;
		do {
			try {
				user = input.next().charAt(0);
				// korisnik mora unijeti broj slovo
				// korisnik mora unijeti slovo ili "0" (da prekine igru)
				if (Character.isAlphabetic(user) || user == '0')
					inputCheck = false;
				else
					System.out.println("Wrong input. Try again.");
			} catch (InputMismatchException ex) {
				System.out.println("Wrong input. Try again.");
				input.nextLine();
			}
		} while (inputCheck);
		return user;
	}

	// ukoliko u korisnikovom arrayu nema vise "_" crtica, znaci da je korisnik
	// unijeo cijelu rijec i vracamo true, sto setuje @win na true i time
	// ispisuje poruku da je korisnik pobjedio
	private static boolean checkWin(char[] playerGuess) {
		for (int i = 0; i < playerGuess.length; i++) {
			if (playerGuess[i] == '_')
				return false;
		}
		return true;
	}

	// metoda za stampanje korisnikovog arraya
	private static void printArray(char[] playerGuess) {
		for (int i = 0; i < playerGuess.length; i++) {
			System.out.print(playerGuess[i] + " ");
		}
		System.out.println();
	}

}
