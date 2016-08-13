package zadaci_12_08_2016;

public class Zadatak_1 {
	/*
	 * Pretpostavimo da se registarska tablica za auto sastoji od tri uppercase
	 * karaktera i 4 broja u sljedeæem formatu AAA-1234. Napisati program koji
	 * nasumièno generiše tablicu.
	 */

	public static void main(String[] args) {
		// generisanje prva 3 slova
		for (int i = 0; i < 3; i++) {
			System.out.print((char) (Math.random() * 26 + 65));
		}
		// crtica izmedju
		System.out.print("-");
		// generisanje 4 broja
		for (int i = 0; i < 4; i++) {
			System.out.print((int)(Math.random()*10));
		}
	}

}
