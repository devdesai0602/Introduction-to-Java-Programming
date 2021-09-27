package Exercise04;
/*
 * @author Vatsal Ghoghari (20CS016)
 * (Compute  the  greatest  common  divisor)  Another  solution  for  Listing  4.9 to  find
 * the greatest common divisor of two integers n1 and n2 is as follows:
 * First find d to be the minimum of n1 and n2,
 * then check whether d,d-1,d-2, ..., 2, or 1 is a divisor for both n1 and n2 in this order.
 * The first such common divisor is the great-est common divisor for n1 and n2. Write a program that prompts the user to
 * enter two positive integers and displays the gcd.
 */
import java.util.Scanner;
public class Exercise04_14 {
    public static void main(String[] args) {
        //creating Scanner object to get input from user
        Scanner sc = new Scanner(System.in);

        //prompting user for first number
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        //prompting user for second number
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int gcd = Math.min(num1, num2); //possible gcd (d = minimum of num1 & num2)

        //lopping until gcd equals to 1
        while (gcd > 0) {
            if(num1 % gcd == 0 && num2 % gcd == 0) //if gcd is factor of both num1 and num2
                break;
            gcd--; //updating gcd (d-1)
        }

        //displaying output
        System.out.println("The Greatest Common Divisor(GCD) for "+ num1 +" and "+ num2 +" is "+ gcd);
    }
}