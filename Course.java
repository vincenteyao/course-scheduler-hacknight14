/*
 * Name: Course
 * 
 * This class stores the data for the class's name, days, and times.
 */

 import java.util.Arrays

public class Course {
	private final String courseID;
	private final int[] days;
	private final int[] times;

	public Course(String courseID, int[] days, int[] times) {
		this.courseID = courseID;
		this.days = days;
		this.times = times;
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
	 * Name: setCourseID
	 * Purpose: Sets the name of the course to value of input
	 * Parameters: String courseID, the name to be changed to.
	 * Return: void
	 */
	public void setCourseID(String courseID) {
		this.courseID = courseID;
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

	/*
	 * Name: getTimes
	 * Purpose: Returns array of ints containing times.
	 * Parameters: none
	 * Return: int[]
	 */
	public int[] getTimes() {
		return times;
	}

	/*
	 * Name: setDays
	 * Purpose: Sets days of course to argument
	 * Parameters: int[] days
	 * Return: void
	 */
	public void setDays(int[] days) {
		this.days = days;
	}

	/*
	 * Name: setTimes
	 * Purpose: Sets times of course to argument
	 * Parameters: int[] days
	 * Return: void
	 */
	public void setTimes(int[] times) {
		this.times = times;
	}

}


