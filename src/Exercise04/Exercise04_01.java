package Exercise04;

/* @author Shubham Dankhara  (D21cs108)

    (Count positive and negative numbers and compute the average of numbers) Write
 a program that reads an unspecified number of integers, determines how many
 positive and negative values have been read, and computes the total and average of
 the input values (not counting zeros). Your program ends with the input 0. Display
 the average as a floating-point number. Here is a sample run:
*/

import java.util.Scanner;

public class Exercise04_01 {

	public static void main(String[] args) {

		// Prompt the input from User.
		Scanner input = new Scanner(System.in);

		// count total number of positive value
		int positive = 0;
		// count total number of negative value
		int negative = 0;
		// count all the numbers
		int count = 0;
		// Accumulate total
		double total = 0;

		// Prompt the user to enter an integer value or 0.
		System.out.print("Enter an integer, the input ends if it is 0: ");

		//input from the user
		int num = input.nextInt();

		// its check whenever 0 call it will be exit 
		if (num == 0) {
			System.exit(1);
		}

		//loop continue until number is 0
        while (num != 0)
        {
        	//it will give total number of value
            total += num;
            //its count input from user 
            count++;

            //it will give total number of positive value
            if (num > 0) {
                positive++;
            }
            //it will give total number of negative value
            else {
                negative++;
            }
            //input from the user
            num = input.nextInt();
        }
		
		// Calculate the average
		double average = total / count;

		// Display positive number
		System.out.println("The number of positives is " + positive);
		// Display negative number
		System.out.println("The number of negatives is " + negative);
		// Display total number
		System.out.println("The total is " + total);
		// Display average value
		System.out.println("The average is " + average);
	}

}
