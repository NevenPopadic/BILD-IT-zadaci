package zadaci_01_08_2016;

public class Zadatak_4 {

	public static void main(String[] args) {
		int[] list = new int[100]; //kreiranje liste za brojeve

		for (int i = 0; i < list.length; i++) { //petlja za prolazenje kroz listu brojeva
			list[i] = (int) (Math.random() * 10); //dodjeljivanje random brojeva na "i" index u listi

		}
		for (int i = 0; i <= 9; i++) { // petlja za provjeru brojeva od 0 do 9 i porednjenje istih sa brojevima u listi
			int counter = 0; //deklarisanje brojaca, pri drugom prolasku kroz petlju brojac se resetuje na 0
			for (int y = 0; y < list.length; y++) { //prolazenje kroz listu
				if (i == list[y]) { //provjeravanje da li se trenutni broj koji trazimo nalazi na datom indexu
					counter++; 		//ukoliko se broj nalazi na tom indexu brojac povecavanmo za jedan
				}
			}
			System.out.println("Broj " + i + " se ponovio " + counter
					+ " puta."); //ispisivanje trenutnog broja koji trazimo i koliko se puta on ponovio u datoj listi
		}
	}

}
