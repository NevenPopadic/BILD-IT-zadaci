package zadaci_31_8_2016;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Zadatak_5 {
	/*
	 * (Create large dataset) Create a data file with 1,000 lines. Each line in
	 * the file consists of a faculty member’s first name, last name, rank, and
	 * salary. The faculty member’s first name and last name for the ith line
	 * are FirstNamei and LastNamei. The rank is randomly generated as
	 * assistant, associate, and full. The salary is randomly generated as a
	 * number with two digits after the decimal point. The salary for an
	 * assistant professor should be in the range from 50,000 to 80,000, for
	 * associate professor from 60,000 to 110,000, and for full professor from
	 * 75,000 to 130,000. Save the file in Salary.txt. Here are some sample
	 * data: FirstName1 LastName1 assistant 60055.95 FirstName2 LastName2
	 * associate 81112.45 . . . FirstName1000 LastName1000 full 92255.21
	 */

	public static void main(String[] args) throws IOException {
		// dodjelivanje novog fajlu na @file objekat
		File file = new File("Salary.txt");
		// pokusavanje unosa u fajl
		try {
			// ukoliko fajl ne postoji pravimo novi fajl
			if (!file.exists())
				file.createNewFile();
			// otvaramo writer za unos u fajl
			BufferedWriter writer = new BufferedWriter(new FileWriter(file,
					true));
			// petlja koja generise random vrijednosti koje potom unosimo u fajl
			for (int i = 1; i <= 1000; i++) {
				// rank dobijamo pomocu @getRank metode koja uzima random rank
				// iz string arraya
				String rank = getRank();
				// zatim na osnovu ranka pozivamo @getSalary metodu koja daje
				// random vrijednost u zavisnosti od proslijedjenog ranka
				double salary = getSalary(rank);
				// unosimo zadate vrijednosti u fajl
				writer.write("FirstName" + i + " LastName" + i + " " + rank
						+ " " + salary + "\n");
			}
			writer.close();
			// hvatanje IO greske
		} catch (IOException poyy) {
			System.out.println("Error.");
		}
	}

	// metoda za plate
	private static double getSalary(String rank) {
		if (rank.equals("assistant"))
			return (int) ((Math.random() * 3000000) + 5000000) / 100.0;
		else if (rank.equals("associate"))
			return (int) ((Math.random() * 5000000) + 6000000) / 100.0;
		else
			return (int) ((Math.random() * 5500000) + 7500000) / 100.0;
	}

	// metoda za random rank
	private static String getRank() {
		String[] rank = { "assistant", "associate", "full" };
		return rank[(int) (Math.random() * 3)];
	}
}
