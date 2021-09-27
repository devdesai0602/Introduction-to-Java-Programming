package Exercise03;
/**
*
* @author parth
*/
import java.util.Scanner;
import java.util.Random;
public class Exercise03_14 
{
	public static void main(String[] args) 
    {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int system_guess = r.nextInt();
        System.out.println("Fipping th coin!");
        System.out.println("\nEnter 1 for Heads and 0 for Tails: ");
        int user_guess = sc.nextInt();
        
        if(user_guess == system_guess)
        {
            System.out.println("Correct!");
        }
        else
        {
            System.out.println("Incorrect!");
        }
    }
}
