package Exercise02;

/**
 *
 * @author:Maharshi Kevadiya(20CS026)
 * @Email:20cs026@charusat.edu.in
 */
import java.util.Scanner;
public class Exercise02_08 {
    public static void main(String[] args) {

        //variable declaration
        long totalMilliseconds,totalSeconds,totalMinutes,currentMinute, totalHours,currentHour,currentSecond;
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Input the time zone offset to GMT");

        // Input the time zone offset to GMT in Hour format 
        System.out.println("Enter Hour :");
        long timeZoneOffsetHour = sc.nextInt();


       // Obtain the total milliseconds
        totalMilliseconds = System.currentTimeMillis();

       //Obtain the total seconds 
        totalSeconds = totalMilliseconds / 1000; 
       // Compute the current second in the minute in the hour
        currentSecond = totalSeconds % 60;

       //Obtain the total Minute
        totalMinutes = totalSeconds / 60;
       //Compute the current minute in the hour
        currentMinute =(totalMinutes %60);


       //Obtain the total hour
        totalHours = totalMinutes / 60;
       //Compute the current hour(In offset to GMT)
        currentHour=((totalHours+timeZoneOffsetHour)%24);

        // Display results
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    } 
}
