package Exercise02;

import java.util.Scanner;

/*
@author: Harshive Patel 
Id: 20cs051
email: 20cs051@charusat.edu.in 

*/
/*
----------------------------------------------Exercise 02_20-------------------------------------------
(Financial application: calculate interest) If you know the balance and the annual
percentage interest rate, you can compute the interest on the next monthly payment using the following formula:
interest = balance * (annualInterestRate / 1200)
Write a program that reads the balance and the annual percentage interest rate and
displays the interest for the next month. Here is a sample run:
*/
public class Exercise02_20 {
    public static void main(String[] args) {
        double balance, annualIntrestRate, interest;// defining variables balance annualIntrestRate,Interest as double
        Scanner input = new Scanner(System.in);// creatinf instance of Scanner class for taking input
        System.out.print("Enter balance and interest rate:  ");// telling user to enter the balance and
                                                               // annualIntrestRate
        balance = input.nextDouble();// Storing the input of balance
        annualIntrestRate = input.nextDouble();// Storing the input of annualIntrestRate
        interest = balance * (annualIntrestRate / 1200);// calculating the interest
        System.out.println("The interest is " + interest);// Dispalying the finbal total Interest

    }

}
