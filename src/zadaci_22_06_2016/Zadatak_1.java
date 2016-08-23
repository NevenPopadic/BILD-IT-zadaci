package zadaci_22_06_2016;

public class Zadatak_1 {
	/*
	 * (The Fan class) Design a class named Fan to represent a fan. The class
	 * contains: * Three constants named SLOW, MEDIUM, and FAST with the values
	 * 1, 2, and 3 to denote the fan speed. * A private int data field named
	 * speed that specifies the speed of the fan (the default is SLOW). * A
	 * private boolean data field named on that specifies whether the fan is on
	 * (the default is false). * A private double data field named radius that
	 * specifies the radius of the fan (the default is 5). * A string data field
	 * named color that specifies the color of the fan (the default is blue). *
	 * The accessor and mutator methods for all four data fields. * A no-arg
	 * constructor that creates a default fan. * A method named toString() that
	 * returns a string description for the fan. If the fan is on, the method
	 * returns the fan speed, color, and radius in one combined string. If the
	 * fan is not on, the method returns the fan color and radius along with the
	 * string “fan is off” in one combined string. Draw the UML diagram for the
	 * class and then implement the class. Write a test program that creates two
	 * Fan objects. Assign maximum speed, radius 10, color yellow, and turn it
	 * on to the first object. Assign medium speed, radius 5, color blue, and
	 * turn it off to the second object. Display the objects by invoking their
	 * toString method.
	 */

	public static void main(String[] args) {
		// pravljenje @fan objekata
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();
		// dodjeljivanje vrijednosti @fan1
		fan1.setSpeed(fan1.getFAST());
		fan1.setRadius(10);
		fan1.setColor("yellow");
		fan1.setOn(true);
		// dodjeljivanje vrijednosti @fan2
		fan2.setSpeed(fan1.getMEDIUM());
		fan2.setRadius(5);
		fan2.setColor("blue");
		fan2.setOn(false);
		// stampanje rezultata
		System.out.println("Fan1:" + fan1.toString());
		System.out.println("Fan2:" + fan2.toString());

	}

}

class Fan {
	public int SLOW = 1;
	public int MEDIUM = 2;
	public int FAST = 3;

	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";

	Fan() {

	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSLOW() {
		return SLOW;
	}

	public int getMEDIUM() {
		return MEDIUM;
	}

	public int getFAST() {
		return FAST;
	}

	public String toString() {
		// ispitivanje da li je ventilator upaljen
		if (this.on) {
			return String.format("\nSpeed:%d\nColor:%s\nRadius:%.2f\n",
					this.speed, this.color, this.radius);
		} else {
			return String.format("\nColor:%s\n" + "Radius:%.2f\n"
					+ "The fan is off\n", this.color, this.radius);
		}
	}
}
