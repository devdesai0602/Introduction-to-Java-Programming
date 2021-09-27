/*
    @author: Abhishek Kayasth
    Id- 20CS025
    email - 20cs025@charusat.edu.in
*/
/*
|------------------------------------Exercise2_7------------------------------------|
    (Find the number of years) Write a program that prompts the user to enter the
    minutes (e.g., 1 billion), and displays the number of years and days for the 
    minutes. For simplicity, assume a year has 365 days.
*/
package Exercise02;
import java.util.Scanner;

public class Exercise02_07
{
    public static void main(String[] args) 
    {
        int minutes; // to store minute input
        Scanner scanner = new Scanner(System.in); // for input

        System.out.println("Enter the number of minutes: ");
        minutes = scanner.nextInt(); // storing int input in minute var
        scanner.close(); // close input stream

        Convert(minutes); // convert minutes & print output
    }

    static void Convert(int m)
    {
        // variables for storing years, days and temp values
        int temp, years, days;
        
        temp = m; // storing month value in temp variable
        years = temp / (365 * 24 * 60); // calculating years from minutes
        temp %= (365*24*60); // finding modulus
        days = temp / (24 * 60); // calculating days from remaining minutes
        
        // Printing output
        System.out.println(m + " minutes is approximately " + years + " years and " + days + " days ");
    }
}
