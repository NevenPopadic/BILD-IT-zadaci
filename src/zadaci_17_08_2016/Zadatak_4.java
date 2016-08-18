package zadaci_17_08_2016;

public class Zadatak_4 {
	/*
	 * Napisati metodu sa sljedeæim headerom: public static String format(int
	 * number, int width) koja vraæa string broja sa prefiksom od jedne ili više
	 * nula. Velièina stringa je width argument. Na primjer, ukoliko pozovemo
	 * metodu format(34, 4) metoda vraæa 0034, ukoliko pozovemo format(34, 5)
	 * metoda vraæa 00034. Ukoliko je uneseni broj veæi nego width argument,
	 * metoda vraæa samo string broja. Npr. ukoliko pozovemo format(34, 1)
	 * metoda vraæa 34.
	 */
	public static String format(int number, int width) {
		// smjestanje @number u string s, da bi mu mogli dodati 0 i vratiti ga
		// nazad
		String s = number + "";
		// petlja koja dodaje 0 ukoliko je width veci od duzine stringa (po
		// jednu za svaki broj razlike)

		for (int i = 0; i < width - s.length(); i++) {
			// smjestanje "0" ispred trenutnog stringa
			s = "0" + s;
			// posto se duzina stringa povecava, povecavamo i trazenu duzinu za 1
			width++;
		}
		// vracanje stringa
		return s;
	}

	public static void main(String[] args) {
		// ispis i pozivanje @format metode
		System.out.println(format(34, 1));
	}

}
