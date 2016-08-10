package zadaci_09_08_2016;

public class Zadatak_3 {
	/*
	 * Napišite program koji ispisuje sve brojeve, od 100 do 1000, 10 brojeva po
	 * liniji, koji su djeljivi i sa 5 i sa 6. Razmak izmeðu brojeva treba biti
	 * taèno jedan space.
	 */
	public static void main(String[] args) {
		// brojac za broj elemenata u redu
		int count = 0;
		// petlja za prolazak kroz brojeve
		for (int i = 100; i < 1000; i++) {
			// ispitivanje uslova i stampanje brojeva
			if (i % 5 == 0 && i % 6 == 0){
				System.out.print(i + " ");
			count++;
			if (count % 10 == 0)
				System.out.println();
			}
		}
	}

}
