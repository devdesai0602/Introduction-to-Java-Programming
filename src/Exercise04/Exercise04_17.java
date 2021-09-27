package Exercise04;
import java.util.Scanner;

/* Author@ Devasya Joshi (20CS020)
 *(Display pyramid) Write a program that prompts the user to enter an integer from
 * 1 to 15 and displays a pyramid, as shown in the following sample run:
 */

public class Exercise04_17
{
    public static void main(String[] args)
    {
        System.out.print("Enter the number of lines:");
        //creating object
        Scanner input = new Scanner(System.in);

        //get the total number of lines l.
        int l = input.nextInt();

        //creating nested for loop through the lines from 1 to l
        for (int i = 1; i <= l; i++)
        {
            // printing spaces appropriately from j=1 to j= l-i
            for (int j = 1; j <= (l - i); j++)
                System.out.print("  ");

            //Printing number by using decrement operator from the line number j to 1
            for (int j = i; j >= 1; j--)
                System.out.print(j + " ");

            //Printing number by using increment operator from 2 to line number j
            for (int j = 2; j <= i; j++)
                System.out.print(j + " ");

            System.out.println();

        }
    }
}
