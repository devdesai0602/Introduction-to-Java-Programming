/*
 * @author: MEET S. BUTANI  (20CS010)
 * @email: 20CS010@charusat.edu.in
 * 
 * (Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30 seconds.
 * Write a program that displays the average speed in miles per hour.  (Note that 1 mile is 1.6 kilometers.)
 * 
 */

package Exercise01;

public class Exercise01_10
{
    // Main method
    public static void main(String[] args)                                                   
    {
        // double variable distance_km to store distance in km
        double distance_km = 14;   

        // Converting distance in km to distance in miles    
        double distance_miles = distance_km / 1.6;

        // 45 minutes and 30 seconds in seconds is ((45*60)+30)=2730
        int time_sec = 2730;              

        // Calculating average speed of runner in miles per hour(mph)
        double average_speed_mph  = (distance_miles * 60 * 60) / time_sec;

        // Printing the average speed of runner in miles per hour
        System.out.println("Average speed of runner in miles per Hour is: " + average_speed_mph);
    }
}
