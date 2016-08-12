package zadaci_11_08_2016;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Zadatak_3 {
	/*
	 * Ako pozovemo metodu System.currentTimeMillis() dobijemo broj milisekundi
	 * od 1. januara 1970 do trenutka pozivanja metode. Napisati program koji
	 * ispisuje trenutaèni datum i vrijeme u formatu
	 * "Trenutni datum i vrijeme: 22. juli, 2015 19:59:47"
	 */

	public static void main(String[] args) {
		// kreiranje formatera datuma
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MMMM, yyyy HH:mm:ss");
		// pravljenje @calendara 
		GregorianCalendar calendar = new GregorianCalendar();
		// postvljanje @calendara na trenutni datum/vrijeme
		calendar.setTimeInMillis(System.currentTimeMillis());
		// pozivanje @calendar -a sa formatom @sdf
		System.out.println("Trenutni datum i vrijeme: "+sdf.format(calendar.getTime()));
	}

}
