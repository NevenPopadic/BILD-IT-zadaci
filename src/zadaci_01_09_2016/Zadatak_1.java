package zadaci_01_09_2016;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_1 {
	/*
	 * (Process large dataset) A university posts its employees’ salaries at
	 * http:// cs.armstrong.edu/liang/data/Salary.txt. Each line in the file
	 * consists of a faculty member’s first name, last name, rank, and salary
	 * (see Programming Exercise 12.24). Write a program to display the total
	 * salary for assistant professors, associate professors, full professors,
	 * and all faculty, respectively, and display the average salary for
	 * assistant professors, associate professors, full professors, and all
	 * faculty, respectively.
	 */

	public static void main(String[] args) throws IOException {
		// kreiramo @url objekat i dodjeljujemo mu string sa lokacijom fajla
		URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");
		// ucitavamo file u scanner preko urla
		Scanner input = new Scanner(url.openStream());
		// pravimo array liste za svaki rank
		ArrayList<Double> assistant = new ArrayList<Double>();
		ArrayList<Double> associate = new ArrayList<Double>();
		ArrayList<Double> full = new ArrayList<Double>();
		// petlja radi dok ne dodjemo do kraja fajla
		while (input.hasNext()) {
			// ucitava liniju teksta iz fajla
			String[] s = input.nextLine().split(" ");
			// iz linije koda uzimamo dio na 3-oj poziciji tj rank iz fajla i
			// dodjeljujemo ju na string @rank
			String rank = s[2];
			// iz linije goda na 4-toj poziciji se nalazi plata i nju
			// dodjeljujemo na @salary
			String salary = s[3];
			// na osnovu varijable @rank odredjujemo kojem cemo nizu dodjeliti
			// iznos @salary
			switch (rank) {
			case "assistant":
				assistant.add(Double.parseDouble(salary));
				break;
			case "associate":
				associate.add(Double.parseDouble(salary));
				break;
			case "full":
				full.add(Double.parseDouble(salary));
				break;

			default:
				break;
			}
		}
		// racunamo sumu svakog ranka pozivajuci metodu total
		double sumAssistant = total(assistant);
		double sumAssociate = total(associate);
		double sumFull = total(full);

		// racunamo srednju platu svakog ranka
		double avgAssistant = sumAssistant / assistant.size();
		double avgAssociate = sumAssociate / associate.size();
		double avgFull = sumFull / full.size();

		// racunamo ukupnu vrijednost plate iz cijelog fajla
		double sumTotal = sumAssistant + sumAssociate + sumFull;
		double avgTotal = sumTotal
				/ (assistant.size() + associate.size() + full.size());
		// ispisujemo rezultat ispod
		System.out
				.printf("Total salary for assistants is: %.2f \nAverage salary for assistants is: %.2f",
						sumAssistant, avgAssistant);
		System.out
				.printf("\nTotal salary for associate is: %.2f \nAverage salary for associate is: %.2f",
						sumAssociate, avgAssociate);
		System.out
				.printf("\nTotal salary for full is: %.2f \naverage salary for full is: %.2f",
						sumFull, avgFull);
		System.out
				.printf("\nTotal salary for faculty is: %.2f \nAverage salary is: %.2f",
						sumTotal, avgTotal);

		input.close();
	}

	public static double total(ArrayList<Double> list) {
		double total = 0;
		for (Double i : list) {
			total += i;
		}
		return total;
	}
}
