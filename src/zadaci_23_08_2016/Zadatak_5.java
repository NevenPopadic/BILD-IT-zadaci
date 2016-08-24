package zadaci_23_08_2016;

public class Zadatak_5 {
	/*
	 * (Displaying the prime numbers) Write a program that displays all the
	 * prime numbers less than 120 in decreasing order. Use the StackOfIntegers
	 * class to store the prime numbers (e.g., 2, 3, 5, ...) and retrieve and
	 * display them in reverse order.
	 */

	public static void main(String[] args) {
		// pravljenje novog objekta @object1
		StackOfIntegers object1 = new StackOfIntegers();
		// petlja za prolaz brojeva od 2 do 120
		for (int i = 2; i < 120; i++) {
			// pozivanje metode i upit da li je broj prost
			if (isPrime(i)) {
				// ukoliko je prost ubacujemo ga u objekat
				object1.push(i);
			}
		}
		// petlja za ispis elemenata iz objekta
		for (int i = object1.getSize(); i > 0; i--) {
			System.out.print(object1.pop() + " ");
		}
	}

	public static boolean isPrime(int n) {
		// petlja za ispitivanje da li je broj prost
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				// je djeljiv sa i, vracamo false
				return false;
		}
		return true;
	}

}
