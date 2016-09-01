package zadaci_31_8_2016;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.net.MalformedURLException;

public class Zadatak_3 {
	/*
	 * (Count words) Write a program that counts the number of words in
	 * President Abraham Lincoln’s Gettysburg address from
	 * http://cs.armstrong.edu/liang/data/ Lincoln.txt.
	 */

	public static void main(String[] args) throws IOException {
		// @temp string u koji unosimo adresu fajla
		String temp = "http://cs.armstrong.edu/liang/data/Lincoln.txt";
		// brojac rijeci
		int counter = 0;
		// try/catch za unos url adrese u scanner, tj ucitavanja fajla sa URL
		// linka
		try {
			URL url = new URL(temp);
			Scanner input = new Scanner(url.openStream());
			// prolazak kroz text fajl
			while (input.hasNext()) {
				// counter broji koliko rijeci ima u trenutnoj liniji
				counter += input.nextLine().split(" ").length;
			}
			// nakon sto prodjemo kroz fajl ispisemo koliko je rijeci u fajlu
			System.out
					.println("Number of words in the document is: " + counter);
			input.close();
			// exception za wrong url
		} catch (MalformedURLException poyy) {
			System.out.println("Wrong URL.");
			// exception za nepostojeci fajl
		} catch (IOException poyy) {
			System.out.println("No such file.");
		}
	}
}
