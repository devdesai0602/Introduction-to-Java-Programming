/*
    @author: Abhishek Kayasth
    Id- 20CS025
    email - 20cs025@charusat.edu.in
*/
/*
|------------------------------------Exercise03_11------------------------------------|
    (Find the number of days in a month) Write a program that prompts the user to 
    enter the month and year and displays the number of days in the month. For 
    example, if the user entered month 2 and year 2012, the program should display
    that February 2012 had 29 days. If the user entered month 3 and year 2015, the
    program should display that March 2015 had 31 days.
*/
package Exercise03;
import java.util.Scanner;

public class Exercise03_11 
{
    public static void main(String[] args) 
    {
        int days ,month, year; // For storing input month and days
        String nameOfMonth; // For month name
        Scanner scanner = new Scanner(System.in); // For input
        
        // Take user input for month & year
        System.out.print("Enter a month number: ");
        month = scanner.nextInt();
        System.out.print("Enter year: ");
        year = scanner.nextInt(); 
        scanner.close(); // Close input stream

        // Determine days in a month according to input month int
        switch (month) 
        {
            case 1:
                nameOfMonth = "January";
                days = 31;
                break;
            case 2:
                // If it is a leap year set days to 29 else 28
                if(IsLeapYear(year))
                {
                    nameOfMonth = "February";
                    days = 29;
                }
                else
                {
                    nameOfMonth = "February";
                    days = 28;
                }
                break;
            case 3:
                nameOfMonth = "March";
                days = 31;
                break;
            case 4:
                nameOfMonth = "April";
                days = 30;
                break;
            case 5:
                nameOfMonth = "May";
                days = 31;
                break;
            case 6:
                nameOfMonth = "June";
                days = 30;
                break;
            case 7:
                nameOfMonth = "July";
                days = 31;
                break;
            case 8:
                nameOfMonth = "August";
                days = 31;
                break;
            case 9:
                nameOfMonth = "September";
                days = 30;
                break;
            case 10:
                nameOfMonth = "October";
                days = 31;
                break;
            case 11:
                nameOfMonth = "November";
                days = 30;
                break;
            case 12:
                nameOfMonth = "December"; 
                days = 31;
                break;
            default: // If input is incorrect write error
                nameOfMonth = null;
                days = 0;
                System.out.println("Enter a valid month.");
                break;
        }
        // If input is valid print output
        if(days != 0 || nameOfMonth != null)
        {
            Print(nameOfMonth, days, year);
        }
    }    

    // Returns true if it is a leap year
    static boolean IsLeapYear(int y)
    {
        if((y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0)))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // To print output
    static void Print(String m, int days, int y)
    {
        System.out.println(m + " " + y + " had " + days + " days.");
    }
}