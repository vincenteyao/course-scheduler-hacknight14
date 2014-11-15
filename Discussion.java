/*
 *
 */

public class Discussion extends Class {
	String courseID;
	int lectureNumber;
	int[] days;
	int[] startHour;
	int[] length;

	public Discussion(String courseID, int lectureNumber, int[] days, int[] startHour, int[]length) {
		this.courseID = courseID;
		this.lectureNumber = lectureNumber;
		this.days = days;
		this.startHour = startHour;
		this.length = length;
	}
}