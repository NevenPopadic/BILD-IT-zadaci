package zadaci_20_08_2016;

import java.util.Arrays;

public class Zadatak_3 {

	/*
	 * (Stopwatch) Design a class named StopWatch. The class contains: 
	 * - Private data fields startTime and endTime with getter methods. 
	 * - A no-arg constructor that initializes startTime with the current time. 
	 * - A method named start() that resets the startTime to the current time. 
	 * - A method named stop() that sets the endTime to the current time. 
	 * - A method named getElapsedTime() that returns the elapsed time for the stopwatch in
	 * milliseconds. 
	 * Draw the UML diagram for the class and then implement the
	 * class. Write a test program that measures the execution time of sorting
	 * 100,000 numbers using selection sort.
	 */
	public static void main(String[] args) {
		// kreiranje novog niza
		int[] array = new int[100000];
		// unos nasumicnih 100 000 brojeva u niz
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		// pravljene stoperice @sw
		Stopwatch sw = new Stopwatch();
		// pokretanje stoperice
		sw.start();
		// sortiranje niza
		Arrays.sort(array);
		// zaustavljanje stoperice
		sw.stop();
		// ispis rezultata
		System.out.println(sw.getElapsedTime());
	}
}

class Stopwatch {
	private long startTime;
	private long endTime;

	public Stopwatch() {
		start();
	}

	public void start() {
		this.startTime = System.currentTimeMillis();
		this.endTime = System.currentTimeMillis();
	}

	public void stop() {
		this.endTime = System.currentTimeMillis();
	}

	public long getElapsedTime() {
		return (this.endTime - this.startTime);
	}

}
