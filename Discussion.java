/*
 *
 */

public class Discussion extends Class {
	int lectureNumber;
	int[] days;
	int[] startHour;
	int[] startMinute;
	int[] length;

	public Discussion(int lectureNumber, int[] days, int[] startHour, 
			int[] startMinute, int[]length) {
		this.lectureNumber = lectureNumber;
		this.days = days;
		this.startHour = startHour;
		this.length = length;
	}
}