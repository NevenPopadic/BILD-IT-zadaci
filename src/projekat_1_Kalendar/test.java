package projekat_1_Kalendar;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class test {
	static final Scanner input = new Scanner(System.in);
	// citanje fajla na zadatoj lokaciji
	static File file = new File(
			"C:\\Users\\Neven\\git\\BILD-IT-zadaci\\src\\projekat_1_Kalendar\\remainders.txt");

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		// @work sluzi da program radi sve dok korisnik ne zeli da izadje, tj
		// dok sa korisnickom komandom ga ne prebaci na "false"
		boolean work = true;
		while (work) {
			System.out.println("************************\n"
					+ "Unesite mjesec i godinu: ");
			// @month unos zeljenog mjeseca
			int month = input.nextInt();
			// @year unos zeljene godine
			int year = input.nextInt();
			// pozivanje @calendar klase
			calendar printC = new calendar(year, month);
			// pozivanje @printCalendar metode
			printC.printCalendar();
			boolean check = true;
			// petlja za korisnicki meni
			while (check) {
				System.out.println("\n*Unesite broj unosa za odabir zeljene komande*\n"
								+ "1.Unesite podsjetnik za zeljeni dan u odabranom mjesecu\n"
								+ "2.Odaberite drugi mjesec i godinu\n"
								+ "3.Prikazite podsjetnike\n" + "4.Izlaz\n");
				// @switch za odabir zeljenog unosa
				switch (input.nextInt()) {
				case 1:
					remainder(month, year);
					break;

				case 2:
					check = false;
					break;
				case 3:
					remainderShow();
					break;
				case 4:
					check = false;
					work = false;
					break;
				default:
					System.out.println("Pogresan unos, pokusajte ponovo.");
				}
			}
		}
		input.close();
	}

	private static void remainder(int month, int year) throws IOException {
		// otvaranje "pisaca/writera" za unos u fajl
		BufferedWriter output = new BufferedWriter(new FileWriter(file, true));
		int date = 0;
		System.out.println("Unesite dan u ovom mjesecu na kojem zelite podsjetnik: ");
		// @check sluzi za unos dana iz odabranog mjeseca, sve dok
		// korisnik ne unese validan dan, tj u opsegu mjeseca
		boolean check = true;
		Calendar mycal = new GregorianCalendar(year, month - 1, 1);
		
		while (check) {
			date = input.nextInt();
			if (date < mycal.getActualMaximum(Calendar.DAY_OF_MONTH)
					&& date > 0) {
				check = false;

			} else {
				System.out.println("Pogresan unos. Pokusajte ponovo.");
			}
		}
		System.out.println("Unesite napomenu: ");
		// ciscenje "unosa" i prelazenje u novi red
		input.nextLine();
		// @s unos napomene kao string
		String s = input.nextLine();
		// @sdf + temp pretvaranje mjeseca u string, tj ime mjeseca
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM");
		String temp = sdf.format(new Date(month - 1));
		// pisanje u fajl
		output.write(date + "." + temp.substring(0, 1).toUpperCase()
				+ temp.substring(1) + "." + year + " " + "Napomena: " + s);
		// zatvaranje writera
		output.close();

	}

	private static void remainderShow() throws IOException {
		System.out.println();
		// otvaranje citac fajla
		Scanner input2 = new Scanner(file);
		// prolazak kroz fajl i ispis elemenata fajla
		while (input2.hasNextLine()) {
			String s = input2.nextLine();
			System.out.println(s);
		}
		input2.close();

	}
}
