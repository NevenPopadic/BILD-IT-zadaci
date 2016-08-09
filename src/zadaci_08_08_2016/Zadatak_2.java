package zadaci_08_08_2016;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Zadatak_2 {
	/*
	 * Napisati program koji pita korisnika da unese mjesec i godinu te mu
	 * ispiše broj dana u datom mjesecu. Na primjer, ukoliko korisnik unese kao
	 * godinu 2012 a kao mjesec 2, program treba ispisati da je Februar 2012
	 * imao 29 dana. Ukoliko korisnik unese kao godinu 2015 a kao mjesec 3,
	 * program treba ispisati da je Mart 2015 imao 31 dan.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite mjesec i godinu: ");
		// unos mjeseca i godine
		int month = input.nextInt();
		int year = input.nextInt();
		input.close();
		// dodjela vrijednosti kalendara na @mycal
		Calendar mycal = new GregorianCalendar(year, month - 1, 1);
		// format za ispis mjeseca po nazivu
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM");
		@SuppressWarnings("deprecation")
		String date = sdf.format(new Date(year, month - 1, 1));
		// stampanje mjeseca, godine i broja dana u tom mjesecu
		System.out.print(date.substring(0, 1).toUpperCase() + date.substring(1)
				+ " " + year + " je imao "
				+ mycal.getActualMaximum(Calendar.DAY_OF_MONTH));
		// gramaticki izraz dan/dana u slucaju 31
		if (mycal.getActualMaximum(Calendar.DAY_OF_MONTH) != 31) {
			System.out.print(" dana.");
		} else {
			System.out.print(" dan.");

		}
	}

}
