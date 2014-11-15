/*
 * Name: Course
 * 
 * This class stores the data for the class's name, days, and times.
 */

 import java.util.ArrayList

public class Course {
	private final String courseID;
	private final List<int> days;
	private final List<int> times;

	public Course(String courseID, ArrayList<int> days, ArrayList<int> times) {
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

}


