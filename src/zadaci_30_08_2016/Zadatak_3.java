package zadaci_30_08_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadatak_3 {
	/*
	 * (Remove text) Write a program that removes all the occurrences of a
	 * specified string from a text file. For example, invoking java
	 * Exercise12_11 John filename removes the string John from the specified
	 * file. Your program should get the arguments from the command line.
	 */

	public static void main(String[] args) throws IOException {
		// provjera da li su argumenti korektni, ukoliko nisu, ispisujemo poruku
		// i izlazimo iz programa
		if (args.length != 2) {
			System.out.println("Wrong arguments!");
			System.exit(1);
		}
		// kreiramo objekat @file
		File file = new File(args[0]);
		// deklarisanje skenera, tj readera za citanje iz fajla
		Scanner reader = null;
		// try/catch petlja, koja provjerava da li fajl postoji
		try {
			reader = new Scanner(file);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		// formatiranje fajla
		String temp = reader.useDelimiter("test").next();
		temp.replace(args[0], "");
		// unos u fajl i ispis iz fajla, zatim zatvaranje skenera
		PrintWriter writer = new PrintWriter(args[0]);
		writer.print(temp);
		writer.close();
		reader.close();
	}

}
