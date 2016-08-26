package zadaci_25_08_2016;

/*(Implement the String class) The String class is provided in the Java library.
 Provide your own implementation for the following methods (name the new
 class MyString1):
 public MyString1(char[] chars);
 public char charAt(int index);
 public int length();
 public MyString1 substring(int begin, int end);
 public MyString1 toLowerCase();
 public boolean equals(MyString1 s);
 public static MyString1 valueOf(int i);
 */

public class MyString1 {
	// lista za smjestanje karaktera
	char[] ch;

	// no-arg konstruktor
	MyString1() {

	}

	// konstruktor za string
	MyString1(String s) {
		this(s.toCharArray());
	}

	// konstruktor za char niz
	MyString1(char[] c) {

		ch = c;
	}

	// metoda za vracanje karaktera na zadatom indexu
	public char charAt(int index) {
		return this.ch[index];
	}

	// metoda koja vraca duzinu
	public int lenght() {
		return this.ch.length;
	}

	// metoda koja vraca substring od stringa
	public MyString1 substring(int begin, int end) {
		char[] c = new char[end - begin];
		for (int i = 0; i < c.length; i++) {
			c[i] = ch[begin + i];
		}
		return new MyString1(c);
	}

	// metoda za pretvaranje karatera u stringu u mala slova
	public MyString1 toLowerCase() {
		for (int i = 0; i < ch.length; i++) {
			ch[i] = Character.toLowerCase(ch[i]);
		}
		return new MyString1(ch);
	}

	// metoda koja poredi da li su dva stringa ista/jednaka
	public boolean equals(MyString1 s) {
		if (s == null)
			return this.ch == null ? true : false;
		else if (s.lenght() != lenght())
			return false;
		for (int i = 0; i < ch.length; i++) {
			if (charAt(i) != s.charAt(i))
				return false;
		}
		return true;
	}

	// metoda koja vraca vrijednost u char formatu iz int formata
	public static MyString1 valueof(int i) {
		char[] ch = { (char) i };
		return new MyString1(ch);
	}

	// metoda za stampanje vrijednosti iz stringa
	public String toString() {
		StringBuffer s = new StringBuffer();
		for (char i : ch) {
			s.append(i);
		}
		return s.toString();
	}

	public static void main(String[] args) {
		MyString1 s = new MyString1("aBc");
		System.out.println(s);
		System.out.println("CharAt: " + s.charAt(1));
		System.out.println("Lenght: " + s.lenght());
		System.out.println("Substring: " + s.substring(1, 2));
		System.out.println("LowerCase: " + s.toLowerCase());
		System.out.println("Equals: " + s.equals("AbC"));
		System.out.println("ValueOf: " + MyString1.valueof(65));

	}
}
