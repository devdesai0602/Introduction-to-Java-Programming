/*
 * @author SamirAli Mukhi 
 * S.ID: 20CS038
 * Email: 20cs038@charusat.edu.in
 */

/*
Exercise03_30 : (Current time) Revise Programming Exercise 2.8 to display 
the hour using a 12-hour clock. Here is a sample run:
*/

package Exercise03;
import java.util.Scanner;

public class Exercise03_30 
{
    public long totalMilliseconds, totalSeconds, currentSecond, totalMinutes, currentMinute, totalHours, currentHour;  //Variable declaration
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);  // Create Scanner object

	// Prompt user to enter the time offset of GMT
        System.out.print("Enter the time zone offset to GMT: ");
	int offset = input.nextInt();

	// Obtain the total milliseconds
        long totalMilliseconds = System.currentTimeMillis();

	// Obtain the total seconds
        long totalSeconds = totalMilliseconds / 1000;

	// Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

	// Obtain the total minutes
	long totalMinutes = totalSeconds / 60;

	// Compute the current minute in the hour
	long currentMinute = totalMinutes % 60;

        // Obtain the total hours
	long totalHours = totalMinutes / 60;

	// Compute the current hour
	long currentHour = totalHours % 24;
	currentHour = currentHour + offset;

	// Display results
	System.out.println("Current time is " + ((currentHour > 12) ? currentHour - 12 : currentHour) + 
            ":" + currentMinute + ":" + currentSecond + ((currentHour > 12) ? " PM" : " AM"));
	}
}

/*OUTPUT:
Enter the time zone offset to GMT: -5      [Press Enter]
Current time is 4:50:34 AM
*/
