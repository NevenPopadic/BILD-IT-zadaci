package zadaci_02_08_2016;

public class Zadatak_1 {

	public static void main(String[] args) {
		int counter = 0; //deklarisanje brojaca na 0
		for (int i = 101; i < 2100; i++) { //petlja za prolazak od 101 do 2100-te godine
			if ((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0)) { //ispitivanje uslova da li je godina prestupna
				System.out.print(i + " "); //ispis godine ukoliko je prestupna, nakon koje slijedi razmak
				counter++; //povecavanje brojaca za 1 za svaku prestupnu godinu
				if (counter % 10 == 0) { //ispitivanje da li je brojac djeljiv sa 10 (da li ima 10 godina u jednom redu
					System.out.println(); //ukoliko jeste, prelazimo u novi red
				}
			}
		}
		System.out.println("\nBroj prestupnih godina u periodu od 101 do 2100 iznosi "
						+ counter); //ispis ukupnog broja predstupnih godina u zadatom periodu
	}
}
