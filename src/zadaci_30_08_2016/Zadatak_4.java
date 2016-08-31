package zadaci_30_08_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak_4 {
	/*
	 * (Count characters, words, and lines in a file) Write a program that will
	 * count the number of characters, words, and lines in a file. Words are
	 * separated by whitespace characters. The file name should be passed as a
	 * command-line argument, as shown in Figure 12.13.
	 */

	public static void main(String[] args) {
		// provjeravamo da li su argumenti tacni
		if (args.length != 1) {
			System.out.println("Invalid arguments.");
			System.exit(1);
		}
		// kreiramo novi objekat i provjeravamo da li taj fajl postoji
		File filename = new File(args[0]);
		if (!filename.exists()) {
			System.out.println(filename + " does not exist.");
			System.exit(1);
		}
		// @countC brojac karaktera; @countW brojac rijeci; countL brojac
		// linija/redova
		int countC = 0;
		int countW = 0;
		int countL = 0;

		try {
			Scanner input = new Scanner(filename);
			// petlja koja radi sve dok ne prodjemo kroz cijeli fajl
			while (input.hasNext()) {
				// u string @s ucitavamo liniju texta
				String s = input.nextLine();
				// @countL povecavamo za svaku liniju texta
				countL++;
				// countC uzima duzinu trenutne linije, tj broj karaktera u
				// trenutnoj liniji
				countC += s.length();
				// broj rijeci uzimamo pomocu @split metode
				countW += s.split(" ").length;
			}
			input.close();
			// ukoliko fajl ne postoji hvatamo exception
		} catch (FileNotFoundException poyy) {
			poyy.printStackTrace();
		}
		// ispis rezultata
		System.out.println("File has " + countC + " characters, " + countW
				+ " words and " + countL + " lines.");

	}

}
