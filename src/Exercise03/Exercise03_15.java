package Exercise03;

import java.util.Scanner;

/*
*@author Disney Javiya (20CS019)
*
*(Game: lottery) Revise Listing 3.9, Lottery.java, to generate a lottery of a threedigit
*number. The program prompts the user to enter a three-digit number and
*determines whether the user wins according to the following rules:
*1. If the user input matches the lottery number in the exact order, the award is
*$10,000.
*2. If all the digits in the user input match all the digits in the lottery number, the
*award is $3,000.
*3. If one digit in the user input matches a digit in the lottery number, the award is
*$1,000.
*/

public class Exercise03_15 {
    public static void main(String[] args) {

        // generating a random lottery number.
        int min =100;
        int max = 999;
        int lottery = (int)Math.floor(Math.random()*(max-min+1)+min);
        Scanner input = new Scanner(System.in);
        // taking input from the user.
        System.out.println("Enter your lottery number( three digit number ): ");
        int guess = input.nextInt();
        // checking first digit of lottery number.
        int lotteryDigit1 = lottery/100;
        // checking third digit of lottery number. 
        int lotteryDigit3 = lottery%10;
        // checking second digit of lottery number.
        int temp1 = lottery/10;
        int lotteryDigit2 = temp1%10; 
       
        // checking first digit of user's input.
        int guessDigit1 = guess/100;
        // checking third digit of user's input.
        int guessDigit3 = guess%10;
        // checking second digit of user's input.
         int temp2 = guess/10;
         int guessDigit2 = temp2%10;
        
        // printing generated lottery number.
        System.out.println("Lottery number is:" +lottery);

        // checking if lottery number and user's input is exactly in the same order.
        if(guess == lottery)
        {
            System.out.println("Exact match! You won $10,000!");
        }
         // checking if digits of lottery number and user's input are the same and in different order.
        else if((lotteryDigit1 == guessDigit1 || lotteryDigit1 == guessDigit2 || lotteryDigit1 == guessDigit3) && (lotteryDigit2 == guessDigit1 || lotteryDigit2 == guessDigit2 || lotteryDigit2 == guessDigit3) && (lotteryDigit3 == guessDigit1 || lotteryDigit3 == guessDigit2 || lotteryDigit3 == guessDigit3 ))
        {
            System.out.println("matched all digits! You won $3000!");
        }
         // checking if atleast one digit of lottery number and user's input is same.
        else if((lotteryDigit1 == guessDigit1 || lotteryDigit1 == guessDigit2 || lotteryDigit1 == guessDigit3) || (lotteryDigit2 == guessDigit1 || lotteryDigit2 == guessDigit2 || lotteryDigit2 == guessDigit3) || (lotteryDigit3 == guessDigit1 || lotteryDigit3 == guessDigit2 || lotteryDigit3 == guessDigit3 ))
        {
            System.out.println("One digit match! You won $1000 ");
        }

        else
        {
            System.out.println("No match");
        }
            input.close();
    }
}
