package Exercise03;
import java.util.Scanner;
/*
*@author Ruhi Kansagara (20CS022)
*An ISBN-10 (International Standard Book Number) consists of 10 digits: : d1d2d3d4d5d6d7d8d9d10
*The last digit, is a checksum, which is calculated from the other nine digits using the following formula:
*d10 = (d1*1 + d2*2 + d3*3 + d4*4 + d5*5 + d6*6 + d7*7 + d8*8 + d9*9)%11
*If the checksum is 10, the last digit is denoted as X according to the ISBN-10 convention.
*Write a program that prompts the user to enter the first 9 digits and displays the 10-digit ISBN
*(including leading zeros). Your program should read the input as an integer.
*/
public class Exercise03_09 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        //Input from the user
        System.out.println("Enter the first 9 digits: ");
        //To store the 9 digits
        x= sc.nextInt();
        //To check if the number is a 9 digit number
        if(x>99999999 && x<1000000000)
        {
            //Example: 123456789  d9=9
            int d9 = x%10;
            x=x/10;
            //12345678  d8=8
            int d8 = x%10;
            x=x/10;
            //1234567  d7=7
            int d7 = x%10;
            x=x/10;
            //123456  d6=6
            int d6 = x%10;
            x=x/10;
            //12345  d5=5
            int d5 = x%10;
            x=x/10;
            //1234  d4=4
            int d4 = x%10;
            x=x/10;
            //123  d3=3
            int d3 = x%10;
            x=x/10;
            //12  d2=2
            int d2 = x%10;
            x=x/10;
            //1  d1=1
            int d1 = x%10;
            x=x/10;
            //Calculation for d10
            int d10 = (d1*1 + d2*2 + d3*3 + d4*4 + d5*5 + d6*6 + d7*7 + d8*8 + d9*9)%11;
            //Printing the value of d10
            System.out.println("d10: "+d10);
            //If condition to check if d10 equals 10 ->yes, print X
            //                                       ->no, print the value of d10
            if(d10==10)
            {
                System.out.println("The ISBN number is: "+d1+""+d2+""+d3+""+d4+""+d5+""+d6+""+d7+""+d8+""+d9+"X");
            }
            else
            {
                System.out.println("The ISBN number is: "+d1+""+d2+""+d3+""+d4+""+d5+""+d6+""+d7+""+d8+""+d9+""+d10);
            }
        }
        else
        {
            System.out.println("Enter a valid number");
        }
    }
}
