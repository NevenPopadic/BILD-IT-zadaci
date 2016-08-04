package zadaci_03_08_2016;

import java.util.Scanner;

public class Zadatak_2 {
	public static double min(double[] array) {
		double temp = array[0]; //privremena varijabla za smjestanje najmanjeg broja
		for (int i = 1; i < array.length; i++) {
			if (temp > array[i]) { //poredjenje trenutnog najmanjeg sa trenutnim po redu brojem u listi
				temp = array[i];
			}
		}
		return temp; //vracanje najmanjeg broja
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] lista = new double[10]; //kreiranje liste
		System.out.println("Unesite 10 brojeva u niz: ");
		for (int i = 0; i < 10; i++) { //petlja za prolaz kroz listu
			lista[i] = input.nextDouble(); //dodjeljivanje elemenata u listu
		}
		input.close();
		System.out.println("Najmanji element u zadatom nizu je " + min(lista)); //ispis najmanjeg elementa
	}

}
