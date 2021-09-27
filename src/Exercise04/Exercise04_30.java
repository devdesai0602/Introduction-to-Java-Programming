package Exercise04;
import java.util.Scanner;
/*
@author: Harshive Patel 
Id: 20cs051
email: 20cs051@charusat.edu.in 
*/
/*
--------------------------------Exercise 04_30-----------------------------------------
Financial application: compound value) Suppose you save $100 each month into
a savings account with the annual interest rate 5%. So, the monthly interest rate is
0.05 / 12 = 0.00417. After the first month, the value in the account becomes
100 * (1 + 0.00417) = 100.417 
After the second month, the value in the account becomes
(100 + 100.417) * (1 + 0.00417) = 201.252 
After the third month, the value in the account becomes
(100 + 201.252) * (1 + 0.00417) = 302.507 
and so on.
Write a program that prompts the user to enter an amount (e.g., 100), the annual
interest rate (e.g., 5), and the number of months (e.g., 6) and displays the amount
in the savings account after the given month
*/

public class Exercise04_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// creating instance of the Scanner class for taking input
        System.out.println("Enter the Amount:  ");// Asking user to enter Amount as input
        double Amount = input.nextDouble();
        System.out.println("Enter the Intrest Rate:  ");// Asking user to enter intrestRate as input
        double intrestRate = input.nextDouble();
        System.out.println("Enter the number of months:  ");// Asking user to enter TimePeriod as input
        int timePeriod = input.nextInt();
        double balance, sum = 0;// declaring sum and balance variables for displaying sum and for storing
                                // balance
        for (int i = 1; i <= timePeriod; i++) { // for loop starts
            balance = Amount * (Math.pow((1 + (intrestRate / 1200)), i)); // calculating balance after a particular month using math.pow function and storing it
            sum = sum + balance;// adding the balance value to sum
        } // for loop ends
        System.out.format("Your Total Amount after %d months is: %f", timePeriod, sum);// displaying the total amount
    }
}