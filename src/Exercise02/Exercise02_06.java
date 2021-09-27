package Exercise02;

import java.util.Scanner;

/*
* @author Deekshitha katada (20CS024)
* 2.6Write a program that reads an integer between 0 and
* 1000 and adds all the digits in the integer.
* For example, if an integer is 932, the sum of all its digits is 14.
*/

public class Exercise02_06 {
	public static void main(String[] args) {

	     //printing a line to enter sum of digits 	
	     System.out.println("Enter an integer to discover the sum of its digits: ");

	    //making a scanner object
	    Scanner input = new Scanner(System.in);

	    //taking input integer from the user
	    int Number = input.nextInt();           
	    
            //calling the function and displaying the ans
            System.out.println(sumDigits(Number));
        
	}

	//creating the function called sum digits
	private static int sumDigits(int a) {

	    //Initialising the sum variable to default value 0
	    int sum = 0;

	   //using a while loop to calculate the sum
       	   while (a > 0) {
		sum += (a % 10);
	        a /= 10;    
	        }
		
		//returning the calculated sum of digits
		return sum;
		
	}
}


