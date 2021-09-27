package Exercise02;
/*
* @author Rami Vasudev (D21CS104)
*/
/*
 (Financial application: calculate future investment value) Write a program that
reads in investment amount, annual interest rate, and number of years, and displays
the future investment value using the following formula:
futureInvestmentValue =
investmentAmount x (1 + monthlyInterestRate)numberOfYears*12
For example, if you enter amount 1000, annual interest rate 3.25%, and number of
years 1, the future investment value is 1032.98.
*/

import java.util.*; //import all classes
public class Exercise02_21 {
	public static void main(String[] args) {
        	Scanner a = new Scanner(System.in);    //Create a Scanner object
			System.out.print("enter investment amount :");  // print
			double  b= a.nextDouble();
			System.out.print("enter annual interest rate in percenteg:"); // print
			double  c= a.nextDouble();
					c /= 1200;                           // find annual interest rate in percentage
			System.out.print("enter number of years :");
			int years = a.nextInt();      
			double futureInvestmentValue= b * Math.pow(1+c,years * 12); // find future investment // using math function 
			System.out.println("Accumuleted value is $"+ futureInvestmentValue);  // print future investment value
	}
}