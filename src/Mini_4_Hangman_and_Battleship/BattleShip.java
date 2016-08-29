package Mini_4_Hangman_and_Battleship;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class BattleShip {
	// kreiranje objektne array liste za smjestanje brodova
	static ArrayList<Ship> ship = new ArrayList<Ship>();
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// kreiranje matrice za pravljenje graficke tabele
		int[][] table = new int[10][10];
		// @temp char array za smjestanje 2 karaktera koji odredjuju na kome
		// mjestu ce se unijeti odgovarajuci broj (hit/miss)
		char[] temp = { 'A', '2' };
		// string za unos korisnika
		String userGuess;
		// brojac pokusaja
		int numOfGuess = 0;
		// varijabla koja omogucava glavnu petlju dok je true
		boolean playing = true;
		// glavna petlja
		while (playing) {
			// ispis poruke i kreiranje novih brodova
			System.out.println("Welcome to the Battleships game!");
			ship.add(new Ship("Submarine", 3));
			ship.add(new Ship("Cruiser", 3));
			ship.add(new Ship("Aircraft Carrier", 5));
			// davanje random lokacija kreiranim brodovima
			setLocation();
			// stampanje prazne tabele
			printTable(table, temp, 3);
			// igra traje dok ship lista ne ostane bez "brodova" tj objekata
			while (!ship.isEmpty()) {
				// default vrijednost @result stringa
				String result = "miss";
				// povecavanje broja pokusaja za 1
				numOfGuess++;
				System.out.println("Enter a guess: ");
				// unos od strane korisnika
				userGuess = checkInput();
				// dodvanje karaktera na 0 index
				temp[0] = userGuess.charAt(0);
				// dodavanje karaktera na 1 index, u slucaju da je korisnik
				// unijeo npr a10 stavljamo 0 umjesto 10
				if (userGuess.length() == 3) {
					temp[1] = '0';
				} else {
					temp[1] = userGuess.charAt(1);
				}
				// petlja za prolazak i provjeru da li je korisnik pogodio
				for (int i = 0; i < ship.size(); i++) {
					result = ship.get(i).checkGuess(userGuess);
					// u slucaju da je unistio brod, result dobija poruku ispod
					// i taj brod se uklanja iz liste
					if (result.equals("kill")) {
						result = ("you sunk " + ship.get(i).getName());
						printTable(table, temp, 1);
						ship.remove(i);
						break;
						// u slucaju da je korisnik pogodio brod, ispisuje se
						// tabela i nakon toga se stampa da je pogodio
					} else if (result.equals("hit")) {
						printTable(table, temp, 1);
						break;
					}

				}
				// if izraz koji sprecava pisanje tabele 2 puta
				if (result.charAt(0) == 'y' || result.equals("hit")) {
					System.out.println(result);
				} else {
					printTable(table, temp, 2);
					System.out.println(result);
				}

			}
			// ukoliko je korisnik potopio sve "brodice" ispisuje poruku i
			// zavrsava program
			if (0 == ship.size()) {
				System.out.println("Congrats! You win! It took you "
						+ numOfGuess + " guesses!");
				playing = false;
			}
		}
	}

	private static String checkInput() {
		String user = null;
		boolean inputCheck = true;
		do {
			try {
				user = input.nextLine().toUpperCase();

				// korisnik mora unijeti prvo slovo, a zatim broj
				if (Character.isAlphabetic(user.charAt(0))
						&& Character.isDigit(user.charAt(1)))
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

	// metoda za stampanje tabele
	private static void printTable(int[][] table, char[] temp, int n) {
		// u slucaju da je korisnik unijeo 10, mi prolsljedjujemo "0" zbog @char
		// niza, a zatim umjesto "0" dodajemo 9 na prvi index
		if (temp[1] == '0')
			table[9][(int) (temp[0]) - '0' - 17] = n;
		else {
			table[(int) temp[1] - '0' - 1][(int) (temp[0]) - '0' - 17] = n;
		}

		System.out.println("    A   B   C   D   E   F   G   H   I   J");
		for (int i = 0; i < table.length; i++) {
			// stampa brojeve redova, a u slucaju 10, poravnava tabelu
			if (i != 9)
				System.out.print((i + 1) + " |");
			else
				System.out.print(10 + "|");
			// ispis polja u tabeli, u zavisnosti od broja na datoj poziciji
			// 1 = hit/kill; 2= miss
			for (int y = 0; y < table[i].length; y++) {
				if (table[i][y] == 1) {
					System.out.print(" X |");
				} else if (table[i][y] == 2)
					System.out.print(" O |");
				else
					System.out.print("   |");
			}
			System.out.println("\n  *****************************************");
		}
		System.out.println();
	}

	// metoda za postavljanje broodova na nasumicnu lokaciju
	private static void setLocation() {
		// kreiranje random varijable
		Random random = new Random();
		// kreiranje string arraya @locations i @temp
		ArrayList<String> locations = new ArrayList<String>();
		ArrayList<String> temp = new ArrayList<String>();
		// kreiranje int varijabli za smjestanje slova, brojeva
		// @incL i @incN sluze za povecavanje indexa slova/brojeva
		int letter, number, incL, incN;
		// string koji sadrzi slova, tj kolone u tabeli
		String columns = "ABCDEFGHIJ";
		boolean valid;
		for (int i = 0; i < ship.size(); i++) {
			valid = false;
			// @start: sluzi za nastavljanje petlje kada unesemo
			// "continue: start", tj za ponovno pokretanje petlje
			start: while (!valid) {
				// cistimo listu @locations
				locations.clear();
				valid = true;
				// uzimamo random slovo i broj
				letter = random.nextInt(5);
				number = random.nextInt(5) + 1;
				// time odredjujemo hoce li broj biti vertikalno ili vodoravno
				// postavljen
				if (number % 2 == 0) {
					incL = 1;
					incN = 0;
				} else {
					incL = 0;
					incN = 1;
				}
				// unos broda u array @locations
				for (int y = 0; y < ship.get(i).getSize(); y++) {
					String location = "" + columns.charAt(letter) + number;
					letter += incL;
					number += incN;
					for (int x = 0; x < ship.size(); x++) {
						if (x != i) {
							temp = ship.get(x).getLocation();
							// ukoliko je lokacija popunjena, krecemo ispocetka
							if (temp.contains(location)) {
								valid = false;
								continue start;
							}
						}
					}
					// dodajemo lokacije u array
					locations.add(location);
				}
				// dodavanje lokacije na trenutni brod
				ship.get(i).setLocation(locations);
			}

		}
	}
}

// Ship klasa
class Ship {
	// location sluzi za smjestanje lokacije broda
	private ArrayList<String> location = new ArrayList<String>();
	// naziv broda
	private String name;
	// velicina broda
	private int size;

	// konstruktori
	public Ship(String name, int size) {
		this.name = name;
		this.size = size;
	}

	public Ship(ArrayList<String> location) {

		this.location = location;
	}

	// getteri i setteri
	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}

	public ArrayList<String> getLocation() {
		return location;
	}

	public void setLocation(ArrayList<String> setLoc) {
		this.location.addAll(setLoc);
	}

	// provjera da li je korisnik pogodio, default poruka je "miss"
	public String checkGuess(String userGuess) {
		String result = "miss";

		if (location.contains(userGuess)) {
			location.remove(userGuess);
			// ukoliko je korisnik unistio brod, vraca mu "kill"; ukoliko je
			// samo pogodio vraca mu "hit"
			result = location.isEmpty() ? "kill" : "hit";
		}
		return result;
	}
}