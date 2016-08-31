package zadaci_30_08_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Zadatak_5 {
	/*
	 * (Process scores in a text file) Suppose that a text file contains an
	 * unspecified number of scores separated by blanks. Write a program that
	 * prompts the user to enter the file, reads the scores from the file, and
	 * displays their total and average.
	 */

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		// @total za smjestanje ukopne sume ocjena; @counter za brojenje koliko
		// ocjena ima u fajlu
		int total = 0, counter = 0;
		System.out.println("Enter the file location/name: ");
		// try/catch za unos imena/lokacije fajla i citanje iz fajla
		try {
			File file = new File(input.next());
			@SuppressWarnings("resource")
			Scanner reader = new Scanner(file);
			while (reader.hasNext()) {
				total += reader.nextInt();
				counter++;
			}

		} catch (FileNotFoundException poyy) {
			System.out.println("File doesn't exist.");
			System.exit(1);
		}
		input.close();
		// ukoliko je brojac na 0 fajl je prazan
		if (counter == 0)
			System.out.println("File is empty...");
		else
			System.out.println("Total of scores in file is " + total
					+ " , and their average is " + total / counter);

	}
}
