package zadaci_30_08_2016;

import java.util.Scanner;

public class Zadatak_1 {
	/*
	 * (NumberFormatException) Write the bin2Dec(String binaryString) method to
	 * convert a binary string into a decimal number. Implement the bin2Dec
	 * method to throw a NumberFormatException if the string is not a binary
	 * string.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// string @user za unos od strane korisnika
		String user;
		// petlja radi dok je true, tj dok korisnik ne unese tacnu vrijednost
		while (true) {
			try {
				System.out.println("Enter binary string: ");
				// unos od strane korisnika
				user = input.nextLine();
				// pozivamo metodu @bin2Dec; ukoliko metoda vrati vrijednost,
				// ispisujemo tu vrijednost i zatvaramo petlju
				System.out.println("Binary into decimal: " + bin2Dec(user));
				break;
			} catch (NumberFormatException poyy) {
				System.out.println(poyy.getMessage());

			}
		}
		input.close();
	}

	private static int bin2Dec(String binaryString) {
		// prolazimo kroz string i konvertujemo ga u char
		for (char i : binaryString.toCharArray()) {
			// ukoliko char vrijednost nije 0 ili 1 bacamo exception
			if (i != '0' && i != '1') {
				throw new NumberFormatException("String " + i
						+ " is not binary string.");
			}
		}
		// ukoliko je string uredu, konvertujemo ga u integer i vracamo nazad
		return Integer.parseInt(binaryString, 2);
	}

}
