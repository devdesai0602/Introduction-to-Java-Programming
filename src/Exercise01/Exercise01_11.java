/*(Population projection) The U.S. Census Bureau projects population based on the
        following assumptions:
        ■ One birth every 7 seconds
        ■ One death every 13 seconds
        ■ One new immigrant every 45 seconds
        Write a program to display the population
        for each of the next five years. Assume
        the current population is 312,032,486 and
        one year has 365 days. Hint: In Java, if
        two integers perform division, the result
        is an integer. The fraction part is truncated.
        For example, 5 / 4 is 1 (not 1.25)
        and 10 / 4 is 2 (not 2.5)
 */
package Exercise01;
import java.util.Scanner;

public class Exercise01_11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); // Creating Scanner object
        System.out.println("Enter the number of years");
        int n = sc.nextInt(); // Creating Variable 'n' for number of years

        int Seconds_in_year = 3600*24*365; // Total number of seconds in a year

        int total_birth = Seconds_in_year/7; // Total number of birth in a year
        int total_death = Seconds_in_year/13; // Total number of death in a year
        int imigrant = Seconds_in_year/45; // Total number of imigrants  in a year

        int current_population = 312032486; // Current population
        int total_population =  total_birth + imigrant - total_death; // Population after 1 year

        for (int i = 0; i < n; i++)
        {
            current_population+=total_population;
        }
        System.out.println("Total population in "+n +" years is "+current_population); // Total population after 'n' years

    }
}
