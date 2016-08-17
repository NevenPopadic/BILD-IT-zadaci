package zadaci_15_08_2016;

public class Zadatak_3 {
	/*
	 * Napisati program koji sabira sljedeæu seriju 1/3 + 3/5 + 5/7 + 7/9 + 9/11
	 * + 11/13 ..... + 95/97 + 97/99.
	 */

	public static void main(String[] args) {
		// deklarisanje @sum na 0, za zbir svih brojeva
		double sum = 0;
		// petlja za prolaz kroz sve trazene brojeve
		for(double i = 1; i < 98; i+=2){
			System.out.print(i + " " + (i+2) + "    ");
			sum +=(i/(i+2));
			
		}
		// ispis sume
		System.out.println(sum);

	}

}
