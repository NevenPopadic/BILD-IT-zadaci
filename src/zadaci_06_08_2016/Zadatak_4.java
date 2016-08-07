package zadaci_06_08_2016;

import java.util.Scanner;

public class Zadatak_4 {
	/*
	 * Napisati program koji pita korisnika da unese neki string te mu ispisuje
	 * sve karaktere koji se nalaze na neparnim pozicijama. Na primjer, ako
	 * korisnik unese string Beijing Chicago, program vraæa BiigCiao.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite string: ");
		// unos stringa
		String s = input.nextLine();
		input.close();
		// stampanje stringa na neparnim pozicijama pomocu povecavanja indexa za 2
		for (int i = 0; i < s.length(); i += 2) {
			System.out.print(s.charAt(i));
		}
	}

}
