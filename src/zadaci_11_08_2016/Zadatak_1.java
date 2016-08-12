package zadaci_11_08_2016;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak_1 {
	/*
	 * Napisati program koji pita korisnika da unese imena tri grada te ih
	 * ispiše u abecednom redu. Na primjer, ukoliko korisnik unese Chicago, Los
	 * Angeles i Atlanta kao gradove, program vraæa Atlanta, Chicago, Los
	 * Angeles.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// kreiranje niza od 3 elementa
		String[] array = new String[3];
		System.out.println("Unesite ime prvog grada: ");
		// unosenje prvog elementa
		array[0] = input.nextLine();
		System.out.println("Unesite ime drugog grada: ");
		// unosenje drugog elementa
		array[1] = input.nextLine();
		System.out.println("Unesite ime treceg grada: ");
		// unosenje treceg elementa
		array[2] = input.nextLine();
		input.close();
		// sortiranje niza
		Arrays.sort(array);
		// stampanje elemenata
		System.out.println(array[0] + " " + array[1] + " " + array[2]);

	}

}
