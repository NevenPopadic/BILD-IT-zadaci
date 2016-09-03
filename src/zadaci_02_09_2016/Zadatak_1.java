package zadaci_02_09_2016;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Zadatak_1 {
	/*
	 * (Display calendars) Rewrite the PrintCalendar class in Listing 6.12 to
	 * display a calendar for a specified month using the Calendar and
	 * GregorianCalendar classes. Your program receives the month and year from
	 * the command line. You also can run the program without the year. In this
	 * case, the year is the current year. If you run the program without
	 * specifying a month and a year, the month is the current month.
	 */

	public static void main(String[] args) {
		// provjeravamo da li je args unutar trazenog opsega
		if (args.length > 2 || args.length == 0) {
			System.out.println("Invalid arguments");
			System.exit(1);
		}
		int year;
		// ukoliko mu je duzina 1 uzimamo trenutnu godinu za @year
		if (args.length == 1) {
			year = Calendar.getInstance().get(Calendar.YEAR);
			// ukoliko je proslijedjena godina prosljedjujemo ju na @year
		} else {
			year = new Integer(args[1]);
		}
		// @month uzima vrijednost prvog argumenta
		int month = Integer.parseInt(args[0]) - 1;
		// pravimo novi objekat
		calendar printC = new calendar(year, month);
		// stampamo kalendar
		printC.printCalendar();
	}
}

class calendar {

	private int year, month;

	// kreiranje konstruktora za calendar klasu
	public calendar(int year, int month) {
		super();
		this.year = year;
		this.month = month;
	}

	// metoda koju pozivamo iz test klase
	public void printCalendar() {
		System.out.println();
		// ovom metodom pravimo naziv mjeseca, godinu i dane u sedmici
		calendarForm();
		// ovom metodom ispisujemo dane u mjesecu ispod odgovarajuceg naziva
		// dana
		calendarContent();
	}

	public void calendarContent() {
		// dodavanje razmaka dok ne smjestimo dan ispod
		// odgovarajuceg pocetnog "dana" u tom mjesecu
		for (int i = 1; i < startingDay(); i++) {
			System.out.print("     ");
		}
		// stampanje dana do maksimuma u tom mjesecu
		for (int i = 1; i <= getNumOfDays(); i++) {
			System.out.printf("%5d", i);
			// @[i - 1 + startingDay()] oduzimanje pocetnog dana,
			// tj razmak koji smo uzeli do prvog dana koja se
			// nalazi u prvoj petlji u trenutnoj metodi, koju koristimo
			// pri ubacivanju novog reda za odgovarajuci mjesec
			if ((i - 1 + startingDay()) % 7 == 0)
				System.out.println();
		}
	}

	// metoda za odredjivanje prvog dana u sedmici
	public int startingDay() {
		Calendar mycal = new GregorianCalendar(year, month - 1, 1);
		return mycal.get(Calendar.DAY_OF_WEEK);

	}

	// metoda za dobijanje ukupnog broja dana u mjesecu
	public int getNumOfDays() {
		Calendar mycal = new GregorianCalendar(year, month - 1, 1);
		switch (mycal.getActualMaximum(Calendar.DAY_OF_MONTH)) {
		case 30:
			return 30;
		case 31:
			return 31;
		case 28:
			return 28;
		case 29:
			return 29;
		}

		return 0;
	}

	// ispisivanje naziva mjeseca, godine i raspored dana u mjesecu
	public void calendarForm() {
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM");
		// supresovanje "warninga"
		@SuppressWarnings("deprecation")
		// pretvaranje @date u string format "MMMM" tj npr 1 u "januar"
		String date = sdf.format(new Date(year, month - 1, 1));
		// stampanje, pri cemu @date prvo slovo pretvaramo u Uppercase
		System.out.println("\t   " + date.substring(0, 1).toUpperCase()
				+ date.substring(1) + " " + year
				+ "\n  _________________________________\n  "
				+ "Sun  Mon  Tue  Wed  Thu  Fri  Sat");
	}
}
