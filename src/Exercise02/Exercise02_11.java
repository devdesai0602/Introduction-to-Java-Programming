/*
 * @author : Ditsa Mandani
 * @email : <20cs031@charusat.ac.in>
 *
 * Exercise 1.11 (Population projection) The U.S. Census Bureau projects population based on the following assumptions:
 *
 * One birth every 7 seconds
 * One death every 13 seconds
 * One new immigrant every 45 seconds
 *
 * Write a program to display the population for each of the next five years.
 * Assumethe current population is 312,032,486 and one year has 365 days. 
 *
 * Hint: In Java, if two integers perform division, the result is an integer.  
 * The fraction part is trun-cated. 
 * For example, 5/4 is 1 (not 1.25) and 10/4 is 2 (not 2.5).
 *
 * Exercise 2.11 (Population  projection)  Rewrite  Exercise  1.11  to  prompt  the  user  to  enter  the number of years 
 * and displays the population after the number of years.
 */

package Exercise02;

import java.util.Scanner;
class Exercise02_11
{
    public static void main( String []args)
    {
        long population = 312032486, count=0;
        System.out.println("Current population is: " + population);
        
        // there are 365*24*60*60 = 31536000 seconds in a year
        final long SECONDS = 31536000;
        // one birth every 7 seconds
        count += SECONDS/7;
        
        // one death every 13 seconds
        count -= SECONDS/13;
        
        // one new immigrant every 45 seconds
        count += SECONDS/45;
        
        //population increase in a year is count value
        
        Scanner input = new Scanner(System.in);
        int years;
        System.out.print("Enter number of years: ");
        years = input.nextInt();
        
        System.out.println("Population after " + years + " years will be: " + (population+(years*count)));
    }
}
