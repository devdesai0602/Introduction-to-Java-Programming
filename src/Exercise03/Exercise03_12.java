package Exercise03;
/*
* @author Rami Vasudev (D21CS104)
*/
/*
 (Check a number) Write a program that prompts the user to enter an integer and
checks whether the number is divisible by both 5 and 6, or neither of them, or just
one of them. Here are some sample runs for inputs 10, 30, and 23.
10 is divisible by 5 or 6, but not both.
30 is divisible by both 5 and 6
23 is not divisible by either 5 or 6
 */
import java.util.*; //import all classes
 public class Exercise03_12{
     public static void main(String[] args) {
    	 Scanner input = new Scanner(System.in);  //Create a Scanner object
    	 System.out.print("Enter an integer: ");  // print
    	 int number = input.nextInt();
    	 if (number % 5 == 0 && number % 6 == 0)  //check a number divisible by both 5 and 6
    		 System.out.println(number + " is divisible by both 5 and 6"); 
    	 if (number % 5 == 0 || number % 6 == 0)  //check a number divisible by both 5 or 6
    		 System.out.println(number + " is divisible by 5 or 6.");
    	 if (number % 5 == 0 ^ number % 6 == 0)   //check a number divisible by 5 or 6, but not both //check a number not divisible by either 5 or 6
    		 System.out.println(number +" is divisible by 5 or 6, but not both.");
    	 else
    		 System.out.println(number +" is not divisible by either 5 or 6 ");
     }
}