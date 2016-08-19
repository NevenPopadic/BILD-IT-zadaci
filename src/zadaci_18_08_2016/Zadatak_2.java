package zadaci_18_08_2016;

public class Zadatak_2 {
	/*
	 * (Random number chooser) Write a method that returns a random number
	 * between 1 and 54, excluding the numbers passed in the argument. The
	 * method header is specified as follows: public static int getRandom(int...
	 * numbers)
	 */
	public static int getRandom(int... numbers) {
		// deklarisanje @temp varijable na 0
		int temp = 0;
		// petlja ce da radi sve dok je @temp na vrijednosti 0
		do {
			// dodjeljujemo random broj od 1 do 54 na @temp
			temp = (int) (Math.random() * 54);
			// ispitujemo da li proslijedjen niz sadrzi random broj
			for (int i = 0; i < numbers.length; i++) {
				// ukoliko sadrzi @temp vracamo na 0 i pokusamo opet
				if (numbers[i] == temp) {
					temp = 0;
				}
			}
		} while (temp == 0);
		return temp;
	}

	public static void main(String[] args) {
		// pozivanje metode @getRandom i ispis rezultata
		System.out.println(getRandom(2, 4, 6, 8));
	}

}
