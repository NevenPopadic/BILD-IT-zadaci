package zadaci_06_08_2016;

import java.util.Scanner;

public class Zadatak_5 {
	/*
	 * Ako imamo ubrzanje aviona a, te brzinu pri kojoj avion uzlijeæe v, možemo
	 * izraèunati minimalnu dužinu piste potrebne da avion uzleti koristeæi se
	 * sljedeæom formulom: dužina = v * v / 2a. Napisati program koji pita
	 * korisnika da unese v u m/s i a u m/s^2 te ispisuje korisniku minimalnu
	 * dužinu piste. (Primjer: ukoliko unesemo 60 za brzinu i 3.5 za ubrzanje
	 * dužina piste je 514.286)
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite brzinu aviona (m/s): ");
		// unos brzine aviona
		int v = input.nextInt();
		System.out.println("Unesite ubrzanje aviona (m/s^2): ");
		// unos ubrzanja aviona
		double a = input.nextDouble();
		input.close();
		// racunanje duzine piste potrebne za uzlijetanje po datoj formuli
		double runway = (v * v) / (2 * a);
		// stampanje rezultata
		System.out.printf("Minimalna duzina piste potrebna da uzleti "
				+ "avion je %.3f", runway);
	}

}
