package zadaci_05_08_2016;

public class Zadatak_2 {
	/*
	 * Napisati program koji simulira nasumièno izvlaèenje karte iz špila od 52
	 * karte. Program treba ispisati koja karta je izvuèena (A, 2, 3, 4, 5, 6,
	 * 7, 8, 9, 10, J, Q ili K) te znak u kojem je data karta (Srce, Pik,
	 * Djetelina, Kocka). Primjer: Karta koju ste izvukli je 10 u znaku kocke.
	 */

	public static void main(String[] args) {
		// kreiranje stringa @cards
		String[] cards = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"J", "Q", "K" };
		// kreiranje stringa sa znakovima karata
		String[] sign = { "Srce", "Pik", "Djetelina", "Kocka" };
		// stampanje izvucene karte pomocu stringa + @Math.Random-a,
		// tj. nasumicno biranje indexa elementa u stringu
		System.out.println("Karta koju ste izvukli je "
				+ cards[(int) (Math.random() * 13)] + " u znaku "
				+ sign[(int) (Math.random() * 4)]);
	}

}
