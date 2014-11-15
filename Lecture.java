/*
 *
 */

public class Lecture extends Class {
	int lectureNumber;
	int[] days;
	int[] startHour;
	int[] startMinute;
	int[] length;

	public Lecture(int lectureNumber, int[] days, int[] startHour, 
			int[] startMinute, int[]length) {
		this.lectureNumber = lectureNumber;
		this.days = days;
		this.startHour = startHour;
		this.length = length;
	}
}