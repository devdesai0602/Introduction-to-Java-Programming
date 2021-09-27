/*
*
* QUESTION:-------------------------- Exercise04_06--------------------------------
*
* (Conversion from miles to kilometers) Write a program that displays the following
* two tables side by side (note that 1 mile is 1.609 kilometers and that 1 kilometer is .621 miles):
* Miles Kilometers | Kilometers Miles
* 1     1.609      | 20         12.430
* 2     3.218      | 25         15.538
* ...
* 9     14.481     | 60         37.290
* 10    16.090     | 65         40.398
*
*/

/**
 *
 * AUTHOR:-  DEV PAREKH
 * ID:-      20CS043
 * 
 */
package Exercise04;
public class Exercise04_06 
{
	public static void main(String[] args) 
	{
		//Creating a constant value for number of kilometers per mile
		final double KM_PER_MILE = 1.609;

		//To display Heading of table 
		System.out.println("Miles      Kilometers  |   Kilometers     Miles     ");

		//Displaying the contents of table using for loop having 2 variables
		for (int i = 1, j = 20; i <= 10 && j <= 65; i++, j += 5) 
        {
			//using formatted print statement to make table 
			//with correct spaces and decimal values
			System.out.printf("%-11d%-10.3f",i,(i * KM_PER_MILE));
			System.out.print("  |   ");
			System.out.printf("%-15d%-6.3f\n",j,(j / KM_PER_MILE));
		}
		
	}
}