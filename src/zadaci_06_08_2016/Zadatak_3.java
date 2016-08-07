package zadaci_06_08_2016;

public class Zadatak_3 {
	/*
	 * Napisati metode sa sljedeæim headerima: public static int reverse(int
	 * number) i public static boolean isPalindrome(int number). Prva metoda
	 * prima cijeli broj kao argument i vraæa isti ispisan naopako. (npr.
	 * reverse(456) vraæa 654.) Druga metoda vraæa true ukoliko je broj
	 * palindrom a false ukoliko nije. Koristite reverse metodu da
	 * implementirate isPalindrome metodu. Napišite program koji pita korisnika
	 * da unese broj te mu vrati da li je broj palindrome ili ne.
	 */
	public static int reverse(int number) {
		int temp = 0;
		// petlja u kojoj broj dijelimo sa 10 sve dok je razlicit od 0
		while (number != 0) {
			// svaki puta kada podijelimo broj, prvu decimalu dodajemo na @temp
			// varijablu i mnozimo je sa 10
			temp = (temp * 10) + number % 10;
			number /= 10;
		}
		return temp;
	}

	public static boolean isPalindrome(int number) {
		// provjeravamo da li je broj jednak broju koji obrnemu u @reverse
		// metodi
		if (number == reverse(number)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// provjeravamo da li je broj palindom, time sto ga saljemo u
		// @isPalindrome metodu
		if (isPalindrome(456)) {
			System.out.println("Broj je palindrom.");
		} else {
			System.out.println("Broj nije palindrom.");
		}

	}

}
