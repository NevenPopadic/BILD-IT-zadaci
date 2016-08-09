package zadaci_08_08_2016;

import java.util.Scanner;

public class Zadatak_3 {
	/*
	 * Napisati program koji pita korisnika da unese godinu i prva tri slova
	 * imena mjeseca (prvo slovo uppercase) te mu ispiše broj dana u tom
	 * mjesecu. Na primjer, ukoliko korisnik kao godinu unese 2001 a kao mjesec
	 * Jan program mu ispisuje da Jan 2011 ima 31 dan.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite godinu, a zatim prva tri slova "
				+ "imena mjeseca (prvo slovo veliko): ");
		// unos godine i mjeseca
		int year = input.nextInt();
		String month = input.next();
		input.close();
		// switch gdje ime mjeseca bira ispis dana u tom mjesecu
		switch (month) {
		case ("Jan"):
			System.out.println(month + " " + year + " ima 31 dan.");
			break;
		// u slucaju Feb provjeravamo da li je godina prestupna
		case ("Feb"):
			if (leapYear(year)) {
				System.out.println(month + " " + year + " ima 29 dan.");
				break;
			} else {
				System.out.println(month + " " + year + " ima 28 dana.");
				break;
			}
		case ("Mar"):
			System.out.println(month + " " + year + " ima 31 dan.");
			break;
		case ("Apr"):
			System.out.println(month + " " + year + " ima 30 dana.");
			break;
		case ("Maj"):
			System.out.println(month + " " + year + " ima 31 dan.");
			break;
		case ("Jun"):
			System.out.println(month + " " + year + " ima 30 dana.");
			break;
		case ("Jul"):
			System.out.println(month + " " + year + " ima 31 dan.");
			break;
		case ("Avg"):
			System.out.println(month + " " + year + " ima 31 dan.");
			break;
		case ("Sep"):
			System.out.println(month + " " + year + " ima 30 dana.");
			break;
		case ("Oct"):
			System.out.println(month + " " + year + " ima 31 dan.");
			break;
		case ("Nov"):
			System.out.println(month + " " + year + " ima 30 dana.");
			break;
		case ("Dec"):
			System.out.println(month + " " + year + " ima 31 dan.");
			break;

		}
	}

	private static boolean leapYear(int year) {
		// provjera da li je godina prestupna
		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			return true;
		} else {
			return false;
		}

	}

}
