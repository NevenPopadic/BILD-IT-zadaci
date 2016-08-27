package zadaci_26_08_2016;

import java.util.Date;
import java.util.ArrayList;

public class Zadatak_4 {
	/*
	 * (Use ArrayList) Write a program that creates an ArrayList and adds a Loan
	 * object, a Date object, a string, and a Circle object to the list, and use
	 * a loop to display all the elements in the list by invoking the object’s
	 * toString() method.
	 */

	public static void main(String[] args) {
		// kreiranje array liste
		ArrayList<Object> array = new ArrayList<Object>();
		// dodavanje objekata u array listu
		array.add(new Loan());
		array.add(new Date());
		array.add(new String("TestString"));
		array.add(new Circle());
		// ispis elemenata iz array liste
		for (Object object : array) {
			System.out.println(object.toString());
		}
	}

}
// loan klasa
class Loan {

	public Loan() {

	}

	public String toString() {
		return "TestLoan";
	}
}
// circle klasa
class Circle {
	public Circle() {

	}

	public String toString() {
		return "TestCircle";
	}
}