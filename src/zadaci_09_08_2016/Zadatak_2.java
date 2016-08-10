package zadaci_09_08_2016;

import java.util.Scanner;

public class Zadatak_2 {
	/*
	 * Great circle distance predstavlja udaljenost izme�u dvije ta�ke na
	 * povr�ine sfere. Neka nam (x1, y1) i (x2, y2) predstavljaju geografsku
	 * �irinu i du�inu dvije ta�ke. Great circle distance izme�u ove dvije ta�ke
	 * mo�e biti izra�unata koriste�i se sljede�om formulom: d = radius * arccos
	 * (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)). Napisati program
	 * koij pita korisnika da unese geografsku �irinu i du�inu u stepenima dvije
	 * ta�ke na povr�ini zemlje te mu ispisuje great circle distance. Prosje�ni
	 * radius zemlje je 6.371.01 km. Stepene koje korisnik unese trebamo
	 * promijeniti u radianse koriste�i se Math.toRadians metodom jer Java
	 * trigonometrijske metode koriste radianse. �irina i du�ina u ovoj formuli
	 * se odnose na zapad i sjever. Koristimo negativne vrijednosti da ozna�imo
	 * istok i jug.
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite koordinate prve tacke (sirinu i duzinu): ");
		// unos prve tacke
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.println("Unesite koordinate druge tacke (sirinu i duzinu): ");
		// unos druge tacke
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		input.close();
		// racunanje udaljenosti i stampanje
		System.out.println("Udaljenost izmedju ove dvije tacke iznosi: "
				+ 6371.01
				* Math.acos(Math.sin(Math.toRadians(x1))* Math.sin(Math.toRadians(x2))
				+ Math.cos(Math.toRadians(x1))* Math.cos(Math.toRadians(x2)))
				* Math.cos(Math.toRadians(y1 - y2)) + " km");

	}

}
