package zadaci_04_08_2016;

import java.util.Scanner;

public class Zadatak_5 {
	/*
	 * Napisati program koji u�itava neodre�eni broj cijelih brojeva (nula
	 * prekida unos) te ispisuje koliko je brojeva bilo iznad ili jednako
	 * prosjeku svih une�enih brojeva a koliko je bilo brojeva ispod prosjeka.
	 * Pretpostavimo da je maksimalan niz brojeva koje korisnik mo�e unijeti
	 * 100.
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//kreiranje niza
		int[] array = new int[100]; 
		//kreiranje brojaca, sume brojeva i brojac za brojeve ispod prosjeka
		int count = 0, sum = 0, under = 0;
		//varijabla za srednju vrijednost
		double avg;
		System.out.println("Unesite cijele brojeve (0 prekida unos): ");
		//petlja za unos brojeva u niz, gdje 0 prekida petlju/unos
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
			if (array[i] == 0) {
				break;
			}
			count++;
			sum += array[i];
		}
		input.close();
		//izracunavanje srednje vrijednosti
		avg = sum / count;
		//prolazak kroz petlju i poredjenje brojeva sa srednjom vrijednoscu
		for (int i = 0; i < count; i++) {
			if (array[i] < avg) {
				under++;
			}
		}
		//ispis rezultata
		System.out.println("Brojeva iznad prosjeka ili jednako prosjeku je bilo "
						+ (count - under)
						+ " ,a brojeva ispod prosjeka je bilo " + under);
	}

}
