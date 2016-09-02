package zadaci_01_09_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Zadatak_3 {
	private static Scanner reader;

	/*
	 * (Baby name popularity ranking) The popularity ranking of baby names from
	 * years 2001 to 2010 is downloaded from www.ssa.gov/oact/babynames and
	 * stored in files named babynameranking2001.txt, babynameranking2002.txt, .
	 * . . , babynameranking2010.txt. Each file contains one thousand lines.
	 * Each line contains a ranking, a boy’s name, number for the boy’s name, a
	 * girl’s name, and number for the girl’s name. For example, the first two
	 * lines in the file babynameranking2010.txt are as follows: 1 Jacob 21,875
	 * Isabella 22,731 2 Ethan 17,866 Sophia 20,477 So, the boy’s name Jacob and
	 * girl’s name Isabella are ranked #1 and the boy’s name Ethan and girl’s
	 * name Sophia are ranked #2. 21,875 boys are named Jacob and 22,731 girls
	 * are named Isabella. Write a program that prompts the user to enter the
	 * year, gender, and followed by a name, and displays the ranking of the
	 * name for the year.
	 */

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the year: ");
		String year = input.next();
		System.out.print("Enter the gender: ");
		char gender = input.next().charAt(0);
		System.out.print("Enter the name: ");
		String name = input.next();
		input.close();
		// naziv fajla
		File file = new File("birthrate" + year + ".txt");
		// ispitujemo da li file postoji
		if (!file.exists()) {
			System.out.println("File doesn't exist.");
			System.exit(1);
		}
		boolean exists = false;
		int rank = 0;
		try {
			reader = new Scanner(file);
			// petlja radi dok ne dodjemo do zadnje linije u fajlu
			while (reader.hasNext()) {
				// u string @s ucitavamo trenutnu liniju texta
				String s = reader.nextLine();
				rank++;
				// u temp array ubacujemo formatiran string
				String[] temp = s.split("\\s+");
				// ukoliko je korisnik unijeo M/F i na drugom mjestu imamo ime
				if ((Character.toUpperCase(gender) == 'M' || Character
						.toUpperCase(gender) == 'F') && temp[1].equals(name)) {
					exists = true;
					// zaustavljamo petlju
					break;
				}
			}
		} catch (FileNotFoundException poyy) {
			poyy.printStackTrace();
		}
		// ispisujemo rezultat
		if (exists) {
			System.out.println(name + " is ranked #" + rank + " in year "
					+ year);

		} else {
			System.out.println("The name " + name + " is not ranked in year "
					+ year);

		}

	}

}
