package Mini_4_Hangman_and_Battleship;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BattleShip {
	static ArrayList<Ship> ship = new ArrayList<Ship>();
	static ArrayList<String> loc = new ArrayList<String>();

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] table = table();
		char[] temp = { 'A', '2' };
		boolean check = true;

		String userGuess;
		int numOfGuess = 0;
		boolean playing = true;
		while (playing) {
			System.out.println("Welcome to the Battleships game!");
			ship.add(new Ship("Submarine", 3));
			ship.add(new Ship("Cruiser", 2));
			ship.add(new Ship("Aircraft Carrier", 5));

			setLocation();

			printTable(table, temp, 3);
			while (!ship.isEmpty()) {
				String result = "miss";

				numOfGuess++;

				System.out.println("Enter a guess: ");

				userGuess = input.nextLine().toUpperCase();
				temp[0] = userGuess.charAt(0);
				System.out.println(userGuess.length());
				if (userGuess.length() == 3) {
					temp[1] = '0';
				} else {
					temp[1] = userGuess.charAt(1);
				}
				for (int i = 0; i < ship.size(); i++) {
					result = ship.get(i).checkGuess(userGuess);
					if (result.equals("kill")) {
						result = ("you sunk " + ship.get(i).getName());
						printTable(table, temp, 1);
						ship.remove(i);
						check = true;
						break;
					} else if (result.equals("hit")) {
						printTable(table, temp, 1);
						check = true;
						break;

					}

				}
				// if (!check) {
				System.out.println("bug");
				printTable(table, temp, 2);
				System.out.println(result);
				// }

				temp[0] = ' ';
				temp[1] = ' ';

			}
			if (numOfGuess == ship.size())
				System.out.println("Congrats! Perfect score!");

		}
	}

	private static int[][] table() {
		int[][] temp = new int[10][10];
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[i].length; j++) {
				temp[i][j] = 0;
			}
		}
		return temp;
	}

	private static void printTable(int[][] table, char[] temp, int n) {
		if (temp[1] == '0')
			table[9][(int) (temp[0]) - '0' - 17] = n;
		else {
			System.out.println((int) temp[1] - '0' - 1 + " "
					+ (int) (temp[0] - '0' - 17));
			table[(int) temp[1] - '0' - 1][(int) (temp[0]) - '0' - 17] = n;
		}
		System.out.println(((int) (temp[0]) - '0' - 16) + " "
				+ ((int) temp[1] - '0') + " " + n);
		System.out.println("    A   B   C   D   E   F   G   H   I   J");
		for (int i = 0; i < table.length; i++) {
			if (i != 9)
				System.out.print((i + 1) + " |"); // prints row numbers
			else
				System.out.print(10 + "|");
			for (int y = 0; y < table[i].length; y++) {

				if (table[i][y] == 1) {
					System.out.print(" X |");// prints X for
												// hit
				} else if (table[i][y] == 2)
					System.out.print(" O |"); // prints O for miss
				else
					System.out.print("   |");// prints empty field for not
												// played fields
			}
			System.out.println("\n  *****************************************");
		}
		System.out.println();
	}

	private static void setLocation() {
		Random random = new Random();
		ArrayList<String> locations = new ArrayList<String>();
		ArrayList<String> temp = null;
		int letter, number, incL, incN;
		String columns = "ABCDEFGHIJ";
		boolean valid;
		for (int i = 0; i < ship.size(); i++) {
			valid = false;
			start: while (!valid) {
				locations.clear();
				valid = true;
				letter = random.nextInt(5);
				number = random.nextInt(5) + 1;
				if (number % 2 == 0) {
					incL = 1;
					incN = 0;
				} else {
					incL = 0;
					incN = 1;
				}
				for (int y = 0; y < ship.get(i).getSize(); y++) {
					String location = "" + columns.charAt(letter) + number;

					letter += incL;
					number += incN;
					for (int x = 0; x < ship.size(); x++) {
						if (x != i) {
							temp = ship.get(x).getLocation();
							if (temp.contains(location)) {
								valid = false;
								continue start;
							}
						}
					}
					loc.add(location);
					System.out.println(location);
					locations.add(location);
				}
				ship.get(i).setLocation(locations);
			}

		}
	}
}

class Ship {
	private ArrayList<String> location = new ArrayList<String>();
	private String name;
	private int size;

	public Ship(String name, int size) {
		this.name = name;
		this.size = size;
	}

	public Ship(ArrayList<String> location) {

		this.location = location;
	}

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

	public String checkGuess(String userGuess) {
		String result = "miss";

		if (location.contains(userGuess)) {
			location.remove(userGuess);
			result = location.isEmpty() ? "kill" : "hit";
		}
		return result;
	}
}