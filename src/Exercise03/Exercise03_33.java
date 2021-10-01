package Exercise03;

/*
(Financial: compare costs) Suppose you shop for rice in two different packages.
You would like to write a program to compare the cost. The program prompts the
user to enter the weight and price of the each package and displays the one with
the better price.
*/
 import java.util.Scanner;

/**
 * 
 * @author JAINAM MEHTA (20CS035)
 * @email 20cs035@charusat.edu.in
 * 
 */
public class Exercise03_33 {
	public static void main(String[] args) {
            // Create Scanner object
		Scanner input = new Scanner(System.in);	

		System.out.println("Enter weight for package 1: ");
                // Prompt the user to enter the weight1.
		double weight1 = input.nextDouble();
                
                System.out.println("Enter price for package 1: ");
                // Prompt the user to enter the price1.
		double price1 = input.nextDouble();
                
		System.out.println("Enter weight for package 2: ");
                // Prompt the user to enter the weight2.
		double weight2 = input.nextDouble();
                
                System.out.println("Enter price for package 2: ");
                // Prompt the user to enter the price2.
		double price2 = input.nextDouble();
                
                //Comparing both the ratio.
		if (price1 / weight1 < price2 / weight2)
			System.out.println("Package 1 has a better price.");//display result
		else if (price1 / weight1 > price2 / weight2)
			System.out.println("Package 2 has a better price.");//display result
		else
			System.out.println("Both packages have the same price.");//display result
	}
}
