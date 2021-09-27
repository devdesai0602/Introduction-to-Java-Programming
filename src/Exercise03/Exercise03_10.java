package Exercise03;

import java.util.Scanner;
/*
*@author Deekshita katada (20CS024)
*3.10 (Game: addition quiz) Listing 3.3, SubtractionQuiz.java, randomly
* generates a subtraction question.
* <p>
* Revise the program to randomly generate an addition question with two
* integers less than 100.
*/


public class Exercise03_10 {
	public static void main(String[] args) {
		
		// Generate a random int from 0 to 1 * 100 then type-cast to integer
        int n1 = (int) (Math.random() * 100); 
        int n2 = (int) (Math.random() * 100);
        
        //printing the statement to ask a value
        System.out.print("What is " + n1 + " + " + n2 + "? ");
        
        //taking input from the user
        Scanner input = new Scanner(System.in);
        
        //to store an integer value
        int userAnswer = input.nextInt();

        //check the answer with user
        if (n1 + n2 == userAnswer)
        {
        	//if user value matches actual value it will print the following statement
            System.out.println("Your answer is correct!");
        }
        else 
        {
        	//if user value doesnot matche actual value it will print the following statement
            System.out.println("Your answer is wrong.");
            //will print the actual value of the answer if it is wrong
            System.out.println(n1 + " + " + n2 + " should be " + (n1 + n2));
        }
        input.close();
   }

}

