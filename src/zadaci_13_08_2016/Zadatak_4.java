package zadaci_13_08_2016;

public class Zadatak_4 {
	/*
	 * Palindrome prime je prosti broj koji je takoðer i palindrom. Na primjer,
	 * 131 je palindrome prime, kao i brojevi 313 i 757. Napisati program koji
	 * ispisuje prvih 100 palindrome prime brojeva, 10 brojeva po liniji.
	 */

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
		// brojac na 1, i za svaki palindrom prime broj povecava se za 1
		int counter = 0;
		// pocetna vrijednost bojeva koje ispitujemo
		int i = 2;
		System.out.println("Privh 100 emirp brojeva: ");
		// petlja radi dok ne ispise 100 parova
		do {
			// provjera da li je broj prost i da li je palindrom
			if (isPrime(i) && reverse(i) == i) {
				System.out.print(i + ", ");
				counter++;
				if (counter % 10 == 0)
					System.out.println();

			}
			i++;
		} while (counter != 100);
	}

	public static boolean isPrime(int n) {
		// petlja za ispitivanje da li je broj prost
		for (int i = 2; i < n; i++) {
			if (n % i == 0 && i % 1 == 0) {
				// ukoliko nije prost, vracamo 0
				return false;
			}
		}
		// ukoliko nije djeljiv ni sa jednim brojem, onda je prost
		// broj i vracamo @n
		return true;
	}
}
