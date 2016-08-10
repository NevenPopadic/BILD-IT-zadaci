package zadaci_09_08_2016;

import java.util.Scanner;

public class Zadatak_1 {
	/*
	 * Napisati program koji pita korisnika da unese cijeli broj za dana�nji dan
	 * u sedmici (0 za ponedjeljak, 1 za utorak...) i da unese broj dana nakon
	 * dana�njeg dana te mu ispi�e koji je to dan u budu�nosti. (Primjer: ako
	 * korisnik unese 1 kao dana�nji dan a 3 kao dan u budu�nosti program mu
	 * ispisuje da je danas utorak a dan u budu�nosti je petak.)
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite cijeli broj za danasnji dan u sedmici"
				+ "(0 za ponedjeljak, 1 za utorak...): ");
		// unos prvog dana
		int user = input.nextInt();
		System.out.println("Unesite broj dana nakon danasnjeg dana: ");
		// unos broja dana nakon prvog dana
		int user2 = input.nextInt();
		input.close();
		// ispis naziva dana pomocu @day metode
		System.out.println("Unijeli ste " + day(user) + ", a za " + user2 + 
				" dana ce biti " + day(user2+user) + ".");
	}

	private static String day(int i) {
		switch(i%7){
		case 0: return "ponedjeljak";
		case 1: return "utorak";
		case 2: return "srijeda";
		case 3: return "cetvrtak";
		case 4: return "petak";
		case 5: return "subota";
		case 6: return "nedjelja";
		}
		
		return null;
	}

}
