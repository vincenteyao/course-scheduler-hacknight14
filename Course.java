/*
 * Name: Course
 * 
 * This class stores the data for the class's name, days, and times.
 */

 import java.util.Arrays;

public class Course {
	private final String courseID;
	private final int[] days;
	private final int[] startHour;
	private final int[] startMinute;
	private final int[] length;

	public Course(String courseID, int[] days, int[] startHour, 
			int[] startMinute, int[] length) {
		this.courseID = courseID;
		this.days = days;
		this.startHour = startHour;
		this.startMinute = startMinute;
		this.length = length;
		
	}

	/*
	 * Name: getCourseID
	 * Purpose: Returns the name of the course, aka courseID
	 * Parameters: none
	 * Return: String, the name of the course
	 */
	public String getCourseID() {
		return courseID;
	}

	/*
	 * Name: getDays
	 * Purpose: Returns an array containing all of the days.
	 * Parameters: none
	 * Return: int[]
	 */
	public int[] getDays() {
		return days;
	}


	
}



