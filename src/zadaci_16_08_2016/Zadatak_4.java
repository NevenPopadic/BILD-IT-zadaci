package zadaci_16_08_2016;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Zadatak_4 {
	/* Napisati metodu koja vraæa datum i trenutaèno vrijeme. */

	public static String currentTime() {
		// simple date format za formatiranje kako zelimo da ispisemo trenutno
		// vrijeme, i pozivanje trenutnog datuma/vremena pomocu
		// @getInstance().getTime()
		return new SimpleDateFormat("dd.MMMM.yyyy HH:mm:ss").format(Calendar
				.getInstance().getTime());
	}

	public static void main(String[] args) {
		// pozivanje i stampanje trenutnog datuma
		System.out.println("Trenutno vrijeme je " + currentTime());

	}

}
