/*
(Find the character of an ASCII code) Write a program that receives an ASCII code 
(an integer between 0 and 127) and displays its character. 
For example, if the user enters 97, the program displays character a.
*/
package Exercise02;

import java.util.Scanner;
/**
 *
 * @author mohit marvania
 * 20CS033
 */
public class Exercise02_23 {
    // main class
    public static void main(String[] args) {
        
        // object of scanner class which is imported.
        Scanner input  = new Scanner(System.in);
        
        System.out.println("Enter any integer (from 0 to 127) : ");
        
        // variable to check the validity of entered number.
        boolean validity = true;
        
        // to store the ascii number entered by the user.
        int ascii_number;
        
        // loop to check the validity of entered number between 0 to 127
        // 
        while (validity) {
            ascii_number = input.nextInt();
            
            // condition to check the number between 0 to 127
            if (ascii_number >= 0 && ascii_number <= 127) {
                char value = (char)ascii_number;
                System.out.println("The ASCII value of entered number is : " + value);
                validity = false;
            }
            else {
                System.out.println("Please, enter integer from 0 to 127.!");
            }
        }
    }
    
}