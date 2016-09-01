package zadaci_31_8_2016;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Zadatak_1 {
	/*
	 * (Reformat Java source code) Write a program that converts the Java source
	 * code from the next-line brace style to the end-of-line brace style. For
	 * example, the following Java source in (a) uses the next-line brace style.
	 * Your program converts it to the end-of-line brace style in (b).
	 */

	public static void main(String[] args) throws IOException {
		// ucitavamo novi file
		File file = new File("file.txt");
		// provjeravamo da li file postoji
		if (!file.exists()) {
			System.out.println("File doesn't exist.");

		}
		// pokusvamo citati/pisati u fajl
		try {
			Scanner input = new Scanner(file);
			// pravimo novi string
			String s = "\n\nReformated\n";
			// ucitavamo fajl u string
			while (input.hasNext()) {
				s += input.nextLine() + "\n";

			}
			// zamjenjujemo argumente sa lijeve strane (")" "space" "{" sa ") {"
			s = s.replaceAll("\\)\\s*\\{", ") {");
			s = s.replaceAll("\\s*\\{", " {");
			input.close();
			// otvaramo writer
			BufferedWriter writer = new BufferedWriter(new FileWriter(file,
					true));
			// unosimo string u fajl
			writer.append(s);
			writer.close();
			// exception ukoliko fajl ne postoji
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
