/*
 * Name: Course
 * 
 * This class stores the data for the class's name, days, and times.
 */

 import java.util.Arrays;

public class Course {
	private final String courseID;
	private final Lecture[] lectures;
	private final Discussion[] discussions;

	public Course(String courseID, Lecture[] lectures, Discussion[] discussions) {
		this.courseID = courseID;
		this.lectures = lectures;
		this.discussions = discussions;
		
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
	 * Name: getLectures
	 * Purpose: Returns an array containing all of the lectures.
	 * Parameters: none
	 * Return: int[]
	 */
	public Lecture[] getLectures() {
		return lectures;
	}

	public Discussion[] getDiscussions() {
		return discussions;
	}

	
}



