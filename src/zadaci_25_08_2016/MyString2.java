package zadaci_25_08_2016;

/*(Implement the String class) The String class is provided in the Java library.
 Provide your own implementation for the following methods (name the new
 class MyString2):
 public MyString2(String s);
 public int compare(String s);
 public MyString2 substring(int begin);
 public MyString2 toUpperCase();
 public char[] toChars();
 public static MyString2 valueOf(boolean b);*/

public class MyString2 {
	// varijabla za smjestanje vrijednosti
	char[] ch;

	public MyString2() {

	}

	public MyString2(String s) {
		this(s.toCharArray());
	}

	public MyString2(char[] ch) {
		this.ch = ch;
	}

	// metoda koja poredi dva stringa i vraca njihovu razliku u int formatu
	public int compare(String s) {
		for (int i = 0; i < s.length() - 1; i++) {
			if (ch[i] > s.charAt(i))
				return ch[i] - s.charAt(i);
			else if (ch[i] < s.charAt(i))
				return ch[i] - s.charAt(i);
		}
		if (ch.length > s.length())
			return ch.length - s.length();
		else if (ch.length < s.length())
			return ch.length - s.length();
		else
			return 0;

	}

	// metoda koja vraca substring od stringa
	public MyString2 substring(int begin) {
		char[] c = new char[ch.length - begin];
		for (int i = 0; i < c.length; i++)
			c[i] = ch[begin + i];
		return new MyString2(c);
	}

	// metoda koja vraca sve karaktere u velikim slovima
	public MyString2 toUpperCase() {
		for (int i = 0; i < ch.length; i++)
			ch[i] = Character.toUpperCase(this.ch[i]);
		return new MyString2(ch);
	}

	// metoda pretvara string u char listu
	public char[] toChars() {
		return this.ch;
	}

	// metoda koja vraca boolean vrijednost kao string
	public static MyString2 valueOf(boolean b) {
		return new MyString2((String) (b + ""));
	}

	// metoda koja olaksava ispis
	public String toString() {
		StringBuffer s = new StringBuffer();
		for (char c : ch)
			s.append(c);
		return s.toString();
	}

	public static void main(String[] args) {
		MyString2 s = new MyString2("aBc");
		System.out.println(s);
		System.out.println("Compare: " + s.compare("AbC"));
		System.out.println("Substring: " + s.substring(1));
		System.out.println("ToUppercase: " + s.toUpperCase());
		System.out.println("Characters: " + s.toString());
		System.out.println("Value of: " + MyString2.valueOf(true));
	}

}
