package zadaci_11_08_2016;

import java.util.Scanner;

public class Zadatak_4 {
	/*
	 * Napisati program koji pita korisnika da unese broj minuta (npr. 1
	 * milijardu) te ispiše korisniku koliko je to u godinama i danima. Zbog
	 * jednostavnosti, pretpostavimo da godina ima 365 dana.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj minuta: ");
		// unos minuta
		int min = input.nextInt();
		input.close();
		// dobijanje broja godina pomocu @min/525600
		// dobijanje ostatka dana pomocu @(min%525600) / 1440, gdje djelimo
		// ostatak minuta od godina sa 1440 i dobijamo broj dana
		System.out.println(min + " minuta, iznosi " + (min / 525600)
				+ " godina i " + ((min % 525600) / 1440) + " dana.");
	}

}
