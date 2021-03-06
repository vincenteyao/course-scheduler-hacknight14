import java.util.Scanner;
import java.util.*;
/**
 * 
 * Name: CourseListing
 * Purpose: Creates a Scanner that takes input and creates index values
 * from what user provides
 *
 */
public class CourseListing 
{
	public static int numberOfClasses = 0;
	public static String courseID;
	public static int numberOfTimes;
	public static int[] days;
	public static int[] startHour;
	public static int[] startMinute;
	public static int[] length;
	public static Course[] course;
	
	public static void main(String [] args)
	{
	    Scanner input = new Scanner( System.in ); 
	    System.out.println("Enter number of classes you'd like to enter. Quit when done");
	    while(input.hasNext())
	    {
	    	numberOfClasses = input.nextInt();
	        course = new Course[numberOfClasses];
		    for(int i = 0; i < numberOfClasses; i++)
		    {
		    	System.out.println("Enter course name");
		    	courseID = input.nextLine();
		    	System.out.println("Enter numbers of times course " + (i + 1) + " meets");
		    	numberOfTimes = input.nextInt();
		    	days = new int[numberOfTimes];
		    	startHour = new int[numberOfTimes];
		    	startMinute = new int[numberOfTimes];
		    	length = new int[numberOfTimes];
	    		for(int j = 0; j < numberOfTimes; j++)
	    		{
		    		System.out.println("Enter course day. Monday = 1 - Friday = 5");
		    		days[j] = input.nextInt();
			    	System.out.println("Enter course start time - hour (24 hour time)");
			    	startHour[j] = input.nextInt();
			    	System.out.println("Enter course start time - minute");
			    	startMinute[j] = input.nextInt();
			    	System.out.println("Enter course length in minutes");
			    	length[j] = input.nextInt();
		    	}
			    	course[i] = new Course(courseID, days, startHour, startMinute, length);	    	
		    	}
	    }

	}
}



