package zadaci_15_08_2016;

public class Zadatak_1 {
	/*
	 * Napisati program koji nasumièno generiše cijeli broj izmeðu 1 i 12 te
	 * ispisuje ime mjeseca za taj broj. (Januar za 1, Ferbruar za 2....)
	 */

	public static void main(String[] args) {
		// dobijanje nasumicnog broja od 0 do 11
		int month = (int) (Math.random() * 12);
		// imena mjeseci u stringu @months
		String[] months = { "Januar", "Februar", "Mart", "April", "Maj", "Jun",
				"Jul", "Avgust", "Septembar", "Oktobar", "Novembar", "Decembar" };
		// ispis dobijenog nasumicnog broja + 1, i pozivanje indexa na zadatom
		// stringu u @months
		System.out.println("Random broj: " + (month + 1) + " = "
				+ months[month]);

	}

}
