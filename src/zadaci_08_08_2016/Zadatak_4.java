package zadaci_08_08_2016;

public class Zadatak_4 {
	/*
	 * Pozitivni cijeli broj je savršen broj ukoliko je jednak zbiru svih svojih
	 * pozitivnih djelilaca, iskljuèujuæi sebe. Na primjer, 6 je prvi savršeni
	 * broj jer 6 = 3 + 2 + 1. Sljedeæi savršeni broj je 28 jer 28 = 14 + 7 + 4
	 * + 2 + 1. Samo 4 savršena broja postoje u rasponu od 0 do 10.000. Napišite
	 * program koji ispisuje sva 4.
	 */

	public static void main(String[] args) {
		// petlja za prolaza kod 1 do 10 000
		for (int i = 1; i < 10000; i++) {
			// resetovanje @temp varijable pri svakom prolasku kroz petlju
			int temp = 0;
			// petlja za prolazak svih djelilaca do trenutnog broja koji
			// ispitujemo
			for (int y = 1; y <= i / 2; y++) {
				// ukoliko je @i djeljivo sa @y dodajemo ga na sumu @temp
				if (i % y == 0) {
					temp += y;
				}
			}
			// ukoiko je suma djelilaca jednaka trenutnom broju @i ispisujemo ga
			if (temp == i) {
				System.out.print(i + " ");
			}
		}
	}

}
