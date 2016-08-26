package zadaci_25_08_2016;

public class Zadatak_5 {
	/*
	 * (Implement the StringBuilder class) The StringBuilder class is provided
	 * in the Java library. Provide your own implementation for the following
	 * methods (name the new class MyStringBuilder1):
	 * 
	 * public MyStringBuilder1(String s); public MyStringBuilder1
	 * append(MyStringBuilder1 s); public MyStringBuilder1 append(int i); public
	 * int length(); public char charAt(int index); public MyStringBuilder1
	 * toLowerCase(); public MyStringBuilder1 substring(int begin, int end);
	 * public String toString();
	 */
	public static void main(String[] args) {

		MyStringBuilder1 s = new MyStringBuilder1("aBc");
		System.out.println(s);
		System.out.println("Append (String: dEf): "
				+ s.append(new MyStringBuilder1("dEf")));
		System.out.println("Append (int: 2): " + s.append(2));
		System.out.println("Lenght : " + s.length());
		System.out.println("CharAt (2): " + s.charAt(2));
		System.out.println("ToLowerCase: " + s.toLowerCase());
		System.out.println("Substring: " + s.substring(0, 1));

	}
}

class MyStringBuilder1 {
	String s;

	public MyStringBuilder1(String s) {
		this.s = s;
	}

	// metoda za dodavanje stringa datom stringu
	public MyStringBuilder1 append(MyStringBuilder1 s) {
		return new MyStringBuilder1(this.s + s);

	}

	// metoda za dodavanje integer vrijednosti stringu
	public MyStringBuilder1 append(int i) {
		return new MyStringBuilder1(this.s + (i + ""));
	}

	// metoda za ispis duzine stringa
	public int length() {
		return s.length();

	}

	// metoda za ispis karaktera na datom indexu
	public char charAt(int index) {
		return s.charAt(index);

	}

	// metoda za pretvaranje velikih u mala slova
	public MyStringBuilder1 toLowerCase() {
		String temp = "";
		for (int i = 0; i < s.length(); i++) {
			temp += Character.toLowerCase(s.charAt(i));
		}
		return new MyStringBuilder1(temp);

	}

	// metoda za dobijanje substringa od stringa
	public MyStringBuilder1 substring(int begin, int end) {
		String temp = "";
		for (int i = begin; i < end - begin; i++) {
			temp += this.s.charAt(i);
		}
		return new MyStringBuilder1(temp);

	}

	// metoda za olaksavanje pri ispisu
	public String toString() {
		return this.s;

	}

}
