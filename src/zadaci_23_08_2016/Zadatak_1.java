package zadaci_23_08_2016;

public class Zadatak_1 {
	/*
	 * (The Time class) Design a class named Time. The class contains: * The
	 * data fields hour, minute, and second that represent a time. * A no-arg
	 * constructor that creates a Time object for the current time. (The values
	 * of the data fields will represent the current time.) * A constructor that
	 * constructs a Time object with a specified elapsed time since midnight,
	 * January 1, 1970, in milliseconds. (The values of the data fields will
	 * represent this time.) * A constructor that constructs a Time object with
	 * the specified hour, minute, and second. * Three getter methods for the
	 * data fields hour, minute, and second, respectively. * A method named
	 * setTime(long elapseTime) that sets a new time for the object using the
	 * elapsed time. For example, if the elapsed time is 5555500
	 */

	public static void main(String[] args) {
		// kreiranje 2 nova objekta
		Time t1 = new Time();
		Time t2 = new Time(555550000);
		// pozivanje objekta za trenutno vrijeme i ispis
		System.out.println("Current time: " + t1.getHour() + ":"
				+ t1.getMinute() + ":" + t1.getSecond());
		// pozivanje objekta za 555550000 milisekundi i ispis
		System.out.println("Time for 555550000 miliseconds: " + t2.getHour()
				+ ":" + t2.getMinute() + ":" + t2.getSecond());

	}

}

class Time {
	private long hour, minute, second;

	public Time() {
		this(System.currentTimeMillis());
	}

	public Time(long time) {
		setTime(time);
	}

	public Time(long hour, long minute, long second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public long getHour() {
		return hour;
	}

	public long getMinute() {
		return minute;
	}

	public long getSecond() {
		return second;
	}

	// metoda za dobijanje sekundi, minuta i sati iz milisekundi pomocu izraza
	// ispod
	public void setTime(long elapseTime) {
		elapseTime /= 1000;
		this.second = (int) (elapseTime % 60);
		elapseTime /= 60;
		this.minute = (int) (elapseTime % 60);
		elapseTime /= 60;
		this.hour = (int) (elapseTime % 24);
	}

}