/*
 * @author SamirAli Mukhi 
 * S.ID: 20CS038
 * Email: 20cs038@charusat.edu.in
 */

/*
Exercise03_26 : (Use the &&, || and ^ operators) Write a program that prompts the user to enter
an integer and determines whether it is divisible by 5 and 6, whether it is divisible
by 5 or 6, and whether it is divisible by 5 or 6, but not both. Here is a sample run
of this program:
*/
package Exercise03;
import java.util.Scanner;

public class Exercise03_26 
{
	public int number;   //Variable declaration
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);	// Create Scanner object

		// Prompt user to enter an integer
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		// Determine whether it is divisible by 5 and 6 and Display results
		System.out.print("Is "+number);
		System.out.println(" divisible by 5 and 6? " + ((number % 5 == 0) && (number % 6 == 0)));
		
		// Determine whether it is divisible by 5 or 6 and Display results
		System.out.print("Is "+number);
		System.out.println(" divisible by 5 or 6? " + ((number % 5 == 0) || (number % 6 == 0)));
		
		// Determine whether it is divisible by 5 or 6,but not both and Display results
		System.out.print("Is "+number);
		System.out.println(" divisible by 5 or 6, but not both? " + ((number % 5 == 0) ^ (number % 6 == 0)));
	}
}

/*Output:
Enter an integer: 10                   [Press Enter]
Is 10 divisible by 5 and 6? false
Is 10 divisible by 5 or 6? true
Is 10 divisible by 5 or 6, but not both? true
*/