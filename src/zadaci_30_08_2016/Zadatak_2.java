package zadaci_30_08_2016;

public class Zadatak_2 {
	/*
	 * (OutOfMemoryError) Write a program that causes the JVM to throw an
	 * OutOfMemoryError and catches and handles this error.
	 */

	public static void main(String[] args) {
		// dodjeljujemo int @temp nizu velicinu koja je van opsega/memorije
		try {
			@SuppressWarnings("unused")
			int[] temp = new int[Integer.MAX_VALUE];
		} catch (OutOfMemoryError poyy) {
			System.out.println("Out of memory!");
		}
	}

}
