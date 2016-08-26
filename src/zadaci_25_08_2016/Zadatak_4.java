package zadaci_25_08_2016;

import java.util.ArrayList;
import java.util.Arrays;

/*(New string split method) The split method in the String class returns an
 array of strings consisting of the substrings split by the delimiters. However, the
 delimiters are not returned. Implement the following new method that returns
 an array of strings consisting of the substrings split by the matching delimiters,
 including the matching delimiters.
 public static String[] split(String s, String regex)
 For example, split("ab#12#453", "#") returns ab, #, 12, #, 453 in an
 array of String, and split("a?b?gf#e", "[?#]") returns a, b, ?, b, gf,
 #, and e in an array of String.*/

public class Zadatak_4 {
	public static String[] split(String s, String regex) {
		// pravljenje @array array liste
		ArrayList<String> array = new ArrayList<>();
		// pravlje praznog stringa za smjestanje karaktera
		String ch = "";
		// petlja za prolazak poslatog stringa
		for (int i = 0; i < s.length(); i++) {
			// smjestanje prvog karaktera u @ch
			ch += s.charAt(i);
			// petlja za poredjenje karaktera sa delimetrom
			for (int y = 0; y < regex.length(); y++) {
				// poredjenje trenutnog karaktera na indexu "i" sa "y" diom
				// delimetra
				if (s.charAt(i) == regex.charAt(y)) {
					// ukoliko su jednaki oduzimamo ga iz stringa @ch
					ch = ch.substring(0, ch.length() - 1);
					// smjestamo ga u privremeni string @temp
					String temp = regex.charAt(y) + "";
					// u array dodajemo substring i delimetar
					array.add(ch + ", " + temp);
					// vracamo @ch string na prazno
					ch = "";
				}
			}

		}
		// dodajemo ostatak poslatog stringa
		array.add(ch);
		// saljemo nazad novi string u @temp stringu
		String[] temp = new String[array.size()];
		for (int i = 0; i < array.size(); i++)
			temp[i] = array.get(i);
		return temp;

	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(split("ab#12#453", "#")));
		System.out.println(Arrays.toString(split("a?b?gf#e", "[?#]")));
	}
}
