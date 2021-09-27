/*
(Financial application: compound value) Suppose you save $100 each month into a savings account 
with the annual interest rate 5%. Thus, the monthly inter- est rate is 0.05/12 = 0.00417. 
After the first month, the value in the account becomes
         100 * (1 + 0.00417) = 100.417
After the second month, the value in the account becomes
         (100 + 100.417) * (1 + 0.00417) = 201.252
After the third month, the value in the account becomes
         (100 + 201.252) * (1 + 0.00417) = 302.507
and so on.
Write a program that prompts the user to enter a monthly saving amount and displays the 
account value after the sixth month. (In Exercise 4.30, you will use a loop to simplify 
the code and display the account value for any month.)
*/
package Exercise02;

import java.util.Scanner;

/**
 *
 * @author mohit  marvania
 * 20CS033
 */
public class Exercise02_13 {
    
    //Main method
    public static void main(String[] args) {
        
        // Constant variable.
        final double monthly_interest_rate = 0.05/12;
        
        //Input for saving amount.
        Scanner input = new Scanner(System.in);
        System.out.println("The Annual Interest rate is 5% .");
        System.out.println("Enter the saving amount");
        double saving_amount = input.nextDouble();
        
        // Creating first month account value.
        double interest = 100 * (1 + monthly_interest_rate);
        
        // Creating account value from 2nd to 6th month.
        interest = (100 + interest) * (1 + monthly_interest_rate);      // 2nd
        interest = (100 + interest) * (1 + monthly_interest_rate);      // 3rd
        interest = (100 + interest) * (1 + monthly_interest_rate);      // 4th
        interest = (100 + interest) * (1 + monthly_interest_rate);      // 5th
        interest = (100 + interest) * (1 + monthly_interest_rate);      // 6th
        
        //Printing the amount value after six month.
        System.out.println("After 6 months the total value (in percentage) = Rs. "+ interest);
    }

}
