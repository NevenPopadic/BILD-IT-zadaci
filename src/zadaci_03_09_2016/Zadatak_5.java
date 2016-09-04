package zadaci_03_09_2016;

public class Zadatak_5 {
	/*
	 * (Enable the Course class cloneable) Rewrite the Course class in Listing
	 * 10.6 to add a clone method to perform a deep copy on the students field.
	 */

	public static void main(String[] args) {
		// kreiranje objekta @c1
		Course c1 = new Course();
		// dodavanje argumenata u objekat @c1
		c1.addStudent("Nesto");
		c1.addStudent("Poyy");
		c1.addStudent("Opanak");
		// kloniranje objekta c1 u objekat c2
		Course c2 = (Course) c1.clone();
		// ispis argumenata iz objekta c1
		System.out.println("Objekat c1 ");
		for (int i = 0; i < c1.getNumberOfStudents(); i++)
			System.out.print(c1.getStudents()[i] + " ");
		// ispis argumenata iz objekta c2
		System.out.println("\nObjekat c2 ");
		for (int i = 0; i < c2.getNumberOfStudents(); i++)
			System.out.print(c2.getStudents()[i] + " ");
	}
}

class Course implements Cloneable {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	// konstruktori
	public Course() {

	}

	public Course(String courseName) {
		this.courseName = courseName;
	}

	// getteri/setteri
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	// clone metoda za kloniranje objekta
	protected Object clone() {
		// pravimo @temp objekat iz Course klase
		Course temp = null;
		// pokusava da smjestimo kopiju u @temp
		try {
			temp = (Course) super.clone();
		} catch (CloneNotSupportedException poyy) {
			poyy.printStackTrace();
		}
		// stavljamo vrijednosti u @temp i vracamo ga nazad
		temp.students = students.clone();
		return temp;
	}
}