/*
*
* QUESTION:-------------------------- Exercise03_19--------------------------------
*
* (Compute the perimeter of a triangle) Write a program that reads three edges for a
* triangle and computes the perimeter if the input is valid. Otherwise, display that
* the input is invalid. The input is valid if the sum of every pair of two edges is
* greater than the remaining edge.
*
*/

/**
 *
 * AUTHOR:-  DEV PAREKH
 * ID:-      20CS043
 * 
 */
package Exercise03;
import java.util.Scanner;
public class Exercise03_19 
{
   //method to check validity of triangle 
   //in which int a,b,c are edges of triangle as parameters
   public static boolean isValid(int a,int b,int c)
   {
       //The input returns true if 
       //the sum of every pair of two edges is greater than the remaining edge.
       if(a+b>c && b+c>a && a+c>b)
           return true;
       else
           return false;
   }

   //main method
   public static void main(String[] args)
   {
       //declaring the variables for 3 edges
       int edge_1,edge_2,edge_3;
       
       //reading the three edges from user
       System.out.println("Enter the three edges of triangle to get the perimeter: ");
       Scanner s = new Scanner(System.in);
       edge_1=s.nextInt();
       edge_2=s.nextInt();
       edge_3=s.nextInt();
       
       System.out.println("\n----------------------------OUTPUT----------------------------\n");

       //checking condition of validity 
       //and if valid,perimeter of triangle is printed
       if(isValid(edge_1,edge_2,edge_3))
       {
           System.out.println("The Triangle is VALID and its perimeter is " + (edge_1+edge_2+edge_3));
       }
       else
       {
           System.out.println("The input for the triangle is INVALID");
       }
    }
}