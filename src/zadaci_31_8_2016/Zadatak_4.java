package zadaci_31_8_2016;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Zadatak_4 {
	/*
	 * (Process scores in a text file on the Web) Suppose that the text file on
	 * the Web http://cs.armstrong.edu/liang/data/Scores.txt contains an
	 * unspecified number of scores. Write a program that reads the scores from
	 * the file and displays their total and average. Scores are separated by
	 * blanks.
	 */

	public static void main(String[] args) throws IOException {
		// @total za smjestanje ukopne sume ocjena; @counter za brojenje koliko
		// ocjena ima u fajlu
		int total = 0, counter = 0;
		// try/catch za unos imena/lokacije fajla i citanje iz fajla
		try {
			URL url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");
			// scanner ucitava input sa URL-a
			Scanner input = new Scanner(url.openStream());
			while (input.hasNext()) {
				total += input.nextInt();
				counter++;
			}
			input.close();
		} catch (FileNotFoundException poyy) {
			System.out.println("File doesn't exist.");
			System.exit(1);
		}

		// ukoliko je brojac na 0 fajl je prazan
		if (counter == 0)
			System.out.println("File is empty...");
		else
			System.out.println("Total of scores in file is " + total
					+ " , and their average is " + total / counter);

	}
}
