package zadaci_26_08_2016;

import java.util.Date;

public class Zadatak_2 {
	/*
	 * (The Person, Student, Employee, Faculty, and Staff classes) Design a
	 * class named Person and its two subclasses named Student and Employee.
	 * Make Faculty and Staff subclasses of Employee. A person has a name,
	 * address, phone number, and email address. A student has a class status
	 * (freshman, sophomore, junior, or senior). Define the status as a
	 * constant. An employee has an office, salary, and date hired. Use the
	 * MyDate class defined in Programming Exercise 10.14 to create an object
	 * for date hired. A faculty member has office hours and a rank. A staff
	 * member has a title. Override the toString method in each class to display
	 * the class name and the person’s name.
	 *//*
		 * Draw the UML diagram for the classes and implement them. Write a test
		 * program that creates a Person, Student, Employee, Faculty, and Staff,
		 * and invokes their toString() methods.
		 */

	public static void main(String[] args) {
		Person tomica = new Person("Tomica Guzina", "Split", "000/321-666",
				"tomica123@cyka.com");
		System.out.println("Person: " + tomica.toString());
		Student stipe = new Student("Stipe Stipic", "Dalmacija", "111/222-333",
				"stipko@lipanasa.hr");
		stipe.setStatus(4);
		System.out.println(stipe.toString());
		
	}
}

class Person {
	private String name;
	private String adress;
	private String number;
	private String email;

	public Person() {
		
	}

	public Person(String name, String adress, String number, String email) {
		this.name = name;
		this.adress = adress;
		this.number = number;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Name: " + name + "\nEmail: " + email + "\nPhone: " + number
				+ "\nAdress: " + adress;
	}

}

class Student extends Person {
	private static final String STATUS1 = "Freshman";
	private static final String STATUS2 = "Sophomore";
	private static final String STATUS3 = "Junior";
	private static final String STATUS4 = "Senior";
	private String status;

	public Student() {

	}

	public Student(String name, String adress, String number, String email) {
		super(name, adress, number, email);

	}

	public void setStatus(int status) {
		switch (status) {
		case 1:
			this.status = STATUS1;
			break;
		case 2:
			this.status = STATUS2;
			break;
		case 3:
			this.status = STATUS3;
			break;
		case 4:
			this.status = STATUS4;
			break;
		}

	}

	@Override
	public String toString() {
		return "Student: " + getName() + " is " + status;
	}

}

class Employee extends Person {
	private String office;
	private double salary;
	private Date dateHired = new Date();

	public Employee() {

	}

	public Employee(String name, String adress, String number, String email,
			String office, double salary, Date dateHired) {
		super(name, adress, number, email);
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Office: " + this.office + "\nSalary: " + this.salary
				+ "\nDate hired: " + this.dateHired.toString();
	}

}

class Faculty extends Employee {
	private int officeHours;
	private String rank;

	public Faculty() {

	}

	public Faculty(String name, String adress, String number, String email,
			String office, double salary, Date dateHired, int officeHours,
			String rank) {
		super(name, adress, number, email, office, salary, dateHired);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	public int getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(int officeHours) {
		this.officeHours = officeHours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Office hours: " + this.officeHours + "\nRank: " + this.rank;
	}

}

class Staff extends Employee {
	private String title;

	public Staff() {

	}

	public Staff(String name, String adress, String number, String email,
			String office, double salary, Date dateHired, String title) {
		super(name, adress, number, email, office, salary, dateHired);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Title: " + this.title;
	}
}
