// (Format an integer) Write a method with the following header to format the integer with the specified width.
// public static String format(int number, int width)
// The method returns a string for the number with one or more prefix 0s. The size of
// the string is the width. For example, format(34, 4) returns 0034 and
// format(34, 5) returns 00034. If the number is longer than the width, the
// method returns the string representation for the number. For example,
// format(34, 1) returns 34.
// Write a test program that prompts the user to enter a number and its width and displays a string returned by invoking format(number, width).

package Exercise05;

//Name - Mann_Chandarana
//Roll_no-20CS011

import java.util.Scanner; // Importing Scanner Class

public class Exercise05_37
{
    public static int Length_of_the_number(int numb) // Function to count number of digit in a number of return type "Integer"
    {
        int count = 0;  // Creating "count" variable
        while (numb>0)
        {
            numb=numb/10;
            count++;
        }
        return count; // returning count variable
    }

    public static String format(int number,int width) // Function for Formatting the number with argument (a number and a width) and return type "String"
    {
        if (Length_of_the_number(number)>=width)  // For checking "lenght of number" is greater than "width" entered by the user
        {
            return Integer.toString(number);   // Returning String
        }
        else
        {
            String num = Integer.toString(number);   // Coverting number entered by the user to "String"
            for (int i = 0; i < width-Length_of_the_number(number); i++)
            {
                num = "0"+num;  // Formatting the number
            }
            return num; // Return Final value(String)
        }
    }

    public static void main(String[] args)
    {
        int number,width;  // Creating two variable of type "Integer"
        Scanner sc = new Scanner(System.in); // Creating Scanner class object
        System.out.println("Enter you number and width of your number");
        number = sc.nextInt();
        width = sc.nextInt();
        System.out.println("Your number after formatting is "+"\""+format(number,width)+"\"");  // Printing the final answer to the console
    }
}
