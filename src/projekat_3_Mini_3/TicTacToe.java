package projekat_3_Mini_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {
	/*
	 * (Game: play a tic-tac-toe game) In a game of tic-tac-toe, two players
	 * take turns marking an available cell in a 3 * 3 grid with their
	 * respective tokens (either X or O). When one player has placed three
	 * tokens in a horizontal, vertical, or diagonal row on the grid, the game
	 * is over and that player has won. A draw (no winner) occurs when all the
	 * cells on the grid have been filled with tokens and neither player has
	 * achieved a win. Create a program for playing tic-tac-toe.
	 */
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// pravimo matricu za tabelu
		char[][] table = new char[3][3];

		// ispisujemo praznu matricu
		printTable(table);
		// @row za index reda; @column za index kolone; @counter broji koliko je
		// poteza proslo
		int row, column, counter = 0;
		// dok nemamo pobjednika @do/while petlja ce da radi
		boolean winner = false;
		do {
			do {
				// unos indexa reda i kolone za igraca X
				System.out.println("Enter a row (0,1, or 2) for player X:");
				row = inputCheck();
				System.out.println("Enter a column (0,1, or 2) for player X:");
				column = inputCheck();
				// petlja ce da radi sve dok korisnik ne unese validne
				// vrijednosti
			} while (empty(row, column, table));
			// u tabelu stavljamo X na dati index
			table[row][column] = 'X';
			counter++;
			printTable(table);
			// pozivanje metode koja provjerava da li je igrac pobjedio
			winner = winner(table);
			// ukoliko jeste ispisuje poruku i zavrsava program
			if (!winner) {
				System.out.println("X player won ");
				break;
				// ukoliko brojac dodje do 9, ispisujemo datu poruku i
				// zavrsavamo program
			} else if (counter == 9) {
				System.out.println("It's a tie.");
				break;
			}
			do {
				// unos indexa reda i kolone za igraca O
				System.out.println("Enter a row (0,1, or 2) for player O:");
				row = inputCheck();
				System.out.println("Enter a row (0,1, or 2) for player O:");
				column = inputCheck();
			} while (empty(row, column, table));
			// u tabelu stavljamo O na dati index
			table[row][column] = 'O';
			counter++;
			printTable(table);
			winner = winner(table);
			// ukoliko je igrac pobjedio, ispisujemo poruku i zavrsavamo program
			if (!winner) {
				System.out.println("O player won ");
				break;
			}

		} while (winner);

	}

	// metoda za provjeru da li je igrac pobjedio
	public static boolean winner(char[][] table) {

		// varijabla @sum za smjestanje zbira elemenata iz trenutne kolone
		int sum = 0;
		int sum2 = 0;
		// prolazimo kroz redove i kolone u tabeli
		for (int i = 0; i < table.length; i++) {
			for (int y = 0; y < table[i].length; y++) {
				sum += table[i][y];
				sum2 += table[y][i];
			}
			// X i O imaju vrijednosi 88 i 79, ukoliko dobijemo sumu jednaku
			// jedno od to dvoje (X ili O, tj 88 ili 79)*3 onda je igrac
			// pobjedio
			if (sum == (237) || sum == (264) || sum2 == (237) || sum2 == (264))
				return false;
			// ukoliko nije, vracamo sume na 0
			else {
				sum = 0;
				sum2 = 0;
			}
		}
		// nakon provjere redova i kolona provjeravamo dijagonale
		if ((int) table[0][0] != 0
				&& (table[0][0] == table[1][1] && table[0][0] == table[2][2])) {

			return false;
		}
		if ((int) table[0][2] != 0
				&& (table[0][2] == table[1][1] && table[0][2] == table[2][0])) {

			return false;
		}

		return true;
	}

	// metoda vraca da li je polje prazno
	private static boolean empty(int row, int column, char[][] table) {
		if (table[row][column] == (char) 0)
			return false;
		else
			System.out.println("Field is not empty.");
		return true;
	}

	// metoda za stampanje tabele
	private static void printTable(char[][] table) {
		for (int i = 0; i < table.length; i++) {
			System.out.println("-------------");
			for (int y = 0; y < table[i].length; y++) {
				// ukoliko je mjesto u matrici prazno da stampa "razmak"
				if (table[i][y] == 0) {
					System.out.print("|   ");
					// ukoliko nije prazno, stampa vrijednost na datom polju
				} else {
					System.out.print("| " + table[i][y] + " ");
				}
			}
			System.out.print("|");
			System.out.println();
		}
		System.out.println("-------------");
	}

	private static int inputCheck() {
		int user = 0;
		boolean inputCheck = true;
		do {
			try {
				user = input.nextInt();
				// korisnik mora unijeti 0, 1 ili 2
				if (user == 0 || user == 1 || user == 2)
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

}
