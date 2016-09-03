package zadaci_02_09_2016;

import java.util.ArrayList;

public class Zadatak_5 {
	/*
	 * (Revise the MyStack class) Rewrite the MyStack class in Listing 11.10 to
	 * perform a deep copy of the list field.
	 */

	public static void main(String[] args) {
		// kreiranje objekta MyStack i dodavanje vrijednosti
		MyStack stack1 = new MyStack();
		for (int i = 0; i < 10; i++) {
			stack1.push(i);
		}
		// kloniranje @stack1 i smjestanje kopije u @stackCloned
		MyStack stackCloned = (MyStack) stack1.clone();
		// uklanjanje par vrijednosti iz @stack1
		stack1.pop();
		stack1.pop();

		// prikazujemo velicinu originala i kopije
		System.out.println("Original size = " + stack1.getSize());
		System.out.println("Cloned size = " + stackCloned.getSize());

	}

}

class MyStack implements Cloneable {
	private ArrayList<Object> list = new ArrayList<>();

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public int getSize() {
		return list.size();
	}

	public Object peek() {
		return list.get(getSize() - 1);
	}

	public Object pop() {
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}

	public void push(Object o) {
		list.add(o);
	}

	@Override
	public String toString() {
		return "stack: " + list.toString();
	}

	// metoda za pravljenje kopije
	@Override
	protected Object clone() {
		// pravimo @temp objekat iz MyStack klase
		MyStack temp = null;
		// pokusava da smjestimo kopiju u @temp
		try {
			temp = (MyStack) super.clone();
		} catch (CloneNotSupportedException poyy) {
			poyy.printStackTrace();
		}
		// stavljamo vrijednosti u @temp i vracamo ga nazad
		temp.list = new ArrayList<>(list);
		return temp;
	}
}