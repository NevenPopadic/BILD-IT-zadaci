package projekat_3_Mini_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConnectFour {
	/*
	 * (Game: connect four) Connect four is a two-player board game in which the
	 * players alternately drop colored disks into a seven-column, six-row
	 * vertically suspended grid, as shown below. The objective of the game is
	 * to connect four same-colored disks in a row, a column, or a diagonal
	 * before your opponent can do likewise. The program prompts two players to
	 * drop a red or yellow disk alternately. In the preceding figure, the red
	 * disk is shown in a dark color and the yellow in a light color. Whenever a
	 * disk is dropped, the program redisplays the board on the console and
	 * determines the status of the game (win, draw, or continue).
	 */

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		char[][] table = new char[6][7];
		// ispisujemo praznu matricu
		printTable(table);
		// @row za index reda; @column za index kolone; @counter broji koliko je
		// poteza proslo
		int row, column, counter = 0;
		// dok nemamo pobjednika @do/while petlja ce da radi
		boolean winner = false;
		do {
			do {
				// unos indexa reda i kolone za igraca R
				System.out.println("Drop a red disk at column (0-6):");
				column = inputCheck();
				row = columnCheck(table, column);
				// petlja ce da radi sve dok korisnik ne unese validnu
				// vrijednost
			} while (empty(row));
			// u tabelu stavljamo R na dati index
			table[row][column] = 'R';
			counter++;
			printTable(table);
			// pozivanje metode koja provjerava da li je igrac pobjedio
			winner = winner(table);
			// ukoliko jeste ispisuje poruku i zavrsava program
			if (!winner) {
				System.out.println("The red player won");
				break;
			}
			do {
				// unos indexa reda i kolone za igraca Y
				System.out.println("Drop a yellow disk at column (0-6):");
				column = inputCheck();
				row = columnCheck(table, column);
			} while (empty(row));
			// u tabelu stavljamo Y na dati index
			table[row][column] = 'Y';
			counter++;
			printTable(table);
			winner = winner(table);
			// ukoliko je igrac pobjedio, ispisujemo poruku i zavrsavamo program
			if (!winner) {
				System.out.println("The yellow player won");
				break;
				// ukoliko brojac dodje do 42, ispisujemo datu poruku i
				// zavrsavamo program
			} else if (counter == 42) {
				System.out.println("It's a tie.");
				break;
			}

		} while (winner);

	}

	// metoda koja odredjuje mjesto na kome cemo istampati sledeci karakter (R
	// ili Y)
	private static int columnCheck(char[][] table, int column) {
		int temp = 6;
		for (int i = 5; i > -1; i--) {
			if (table[i][column] == 0) {
				temp = i;
				break;
			}
		}
		return temp;
	}

	// metoda za provjeru je li igrac pobjedio time sto poredi uzastopne
	// vrijdnosti i ukoliko imamo 4 uzastopne vraca false, sto prekida petlju i
	// ispise pobjednika
	public static boolean winner(char[][] table) {

		// brojaci za brojenje koliko istih uzastopnih brojeva ima u matrici
		int counter = 1;

		// prolazimo kroz redove i kolone u tabeli
		for (int i = 5; i > -1; i--) {
			for (int y = 0; y < table.length; y++) {
				if (table[i][y] != 0 && table[i][y] == table[i][y + 1])
					counter++;
				else
					counter = 1;
				if (counter == 4)
					return false;
			}
		}
		counter = 1;
		for (int i = 0; i < 7; i++) {
			for (int y = 5; y > 0; y--) {
				if (table[y][i] != 0 && table[y][i] == table[y - 1][i])
					counter++;
				else
					counter = 1;
				if (counter == 4)
					return false;
			}
		}
		for (int i = 5; i > 2; i--) {
			for (int y = 0; y < 5; y++) {
				if (table[i][y] != 0 && table[i][y] == table[i - 1][y + 1]
						&& table[i][y] == table[i - 2][y + 2]
						&& table[i][y] == table[i - 3][y + 3])
					return false;
			}
			for (int y = 6; y > 2; y--) {
				if (table[i][y] != 0 && table[i][y] == table[i - 1][y - 1]
						&& table[i][y] == table[i - 2][y - 2]
						&& table[i][y] == table[i - 3][y - 3])
					return false;
			}
		}

		return true;
	}

	// provjerava da li je kolona puna
	private static boolean empty(int row) {
		if (row == 6) {
			System.out.println("That column is full.");
			return true;
		} else
			return false;

	}

	private static void printTable(char[][] table) {
		for (int i = 0; i < table.length; i++) {
			for (int y = 0; y < table[i].length; y++) {
				// ukoliko je mjesto u matrici prazno da stampa "razmak"
				if (table[i][y] == 0) {
					System.out.print("| ");
					// ukoliko nije prazno, stampa vrijednost na datom polju
				} else {
					System.out.print("|" + table[i][y]);
				}
			}
			System.out.print("|");
			System.out.println();
		}
		System.out.println("---------------");
	}

	private static int inputCheck() {
		int user = 0;
		boolean inputCheck = true;
		do {
			try {
				user = input.nextInt();
				// korisnik mora unijeti broj od 0 do 6
				if (user >= 0 && user < 7)
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
