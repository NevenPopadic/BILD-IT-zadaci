package zadaci_10_08_2016;

public class Zadatak_3 {
	/*
	 * Napisati program koji ispisuje sve mogu�e kombinacije za biranje dva
	 * broja u rasponu od 1 do 7. Tako�er, program ispisuje broj svih mogu�ih
	 * kombinacija. Dakle, program treba da ispi�e sve mogu�e parove brojeva u
	 * datom rasponu, krenuv�i sa 1 2, 1 3, 1 4, itd. Broj mogu�ih kombinacija
	 * je 21.
	 */

	public static void main(String[] args) {
		// petlja za ispis
		for (int i = 1; i < 8; i++) {
			for (int y = i; y < 8; y++) {
				System.out.print(i + " " + y + " | ");
			}
			
		}
	}

}
