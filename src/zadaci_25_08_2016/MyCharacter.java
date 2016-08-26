package zadaci_25_08_2016;

public class MyCharacter {
	private char ch = 0;

	MyCharacter() {

	}

	MyCharacter(char c) {
		this.ch = c;
	}

	public char getValue() {
		return this.ch;
	}

	// metoda za poredjenje dva karaktera
	public boolean equals(MyCharacter c) {
		return (this.ch == c.getValue()) ? true : false;
	}

	// metoda za pretvaranje karaktera u veliki karakter
	public char toUpperCase() {
		return Character.toUpperCase(ch);
	}

	// metoda za poredenje razlike dva karaktera u int formatu
	public int compareTo(char c) {
		return this.ch - c;
	}
	// metoda olaksava ispis
	public String toString() {
		return this.ch + "";
	}

	public static void main(String[] args) {
		char c = 'b';
		MyCharacter character = new MyCharacter(c);
		System.out.println(character);
		System.out.println("Value: " + character.toUpperCase());
		System.out.println("Compare: " + character.compareTo('a'));
		System.out.println("Equals: " + character.equals('d'));
	}

}
