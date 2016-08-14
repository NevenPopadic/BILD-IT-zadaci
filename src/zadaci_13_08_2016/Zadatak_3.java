package zadaci_13_08_2016;

public class Zadatak_3 {
	/*
	 * Emirp brojevi (prime unazad) je nepalindromski prosti broj koji je prosti
	 * broj i kada ispišemo naopako. Na primjer, broj 17 i broj 71 su prosti
	 * brojevi tako da su brojevi i 17 i 71 emirp brojevi. Napisati program koji
	 * ispisuje prvih 100 emirp brojeva, 10 brojeva po liniji.
	 */

	// metoda za provjeru obrnutog broja da li je prime
	public static boolean checkReverse(int number) {
		int reverse = 0;
		// petlja radi sve dok ne dodjemo do 0
		while (number != 0) {
			// obrnut broj se povecava za 10
			reverse *= 10;
			// dodaje se najmanja decimala na @reverse
			reverse += number % 10;
			// uklanjamo najmanju decimalu sa @number
			number /= 10;
		}
		return isPrime(reverse);
	}

	// metoda za ispis obrnutog broja
	public static int reverse(int number) {
		int reverse = 0;
		// petlja radi sve dok ne dodjemo do 0
		while (number != 0) {
			// obrnut broj se povecava za 10
			reverse *= 10;
			// dodaje se najmanja decimala na @reverse
			reverse += number % 10;
			// uklanjamo najmanju decimalu sa @number
			number /= 10;
		}

		return reverse;
	}

	public static void main(String[] args) {
		// brojac na 1, i za svaki emirp broj povecava se za 1
		int counter = 1;
		// pocetna vrijednost bojeva koje ispitujemo
		int i = 12;
		System.out.println("Privh 100 emirp brojeva: ");
		// petlja radi dok ne ispise 100 parova
		do {
			// provjera da li je broj prime i da li je obrnut broj prime
			if (isPrime(i) && checkReverse(i)) {
				System.out.println(i + " i " + reverse(i));
				counter++;
			}
			i++;
		} while (counter != 100);
	}

	private static boolean isPrime(int n) {

		// petlja za ispitivanje da li je broj prost
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0 || n == 1) {
				// ukoliko nije prost, vracamo false
				return false;
			}
		}
		// ukoliko nije djeljiv ni sa jednim brojem, onda je prost
		// vracamo true
		return true;

	}

}
