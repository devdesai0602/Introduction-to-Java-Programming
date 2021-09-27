/*
(Health application: computing BMI) Body Mass Index (BMI) is a measure of
health on weight. It can be calculated by taking your weight in kilograms and
dividing by the square of your height in meters. Write a program that prompts the
user to enter a weight in pounds and height in inches and displays the BMI. Note
that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
*/
package Exercise02;
import java.util.Scanner;
/**
 * 
 * @author JAINAM MEHTA (20CS035)
 * @email 20cs035@charusat.edu.in
 * 
 */

public class Exercise02_14{
   public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        // Variable to store weight.
        double weight = in.nextDouble();
        
        System.out.println("Enter height in inches: ");
        // Variable to store height.
        double height = in.nextDouble();
        
        // Variable to store the weight in KG.
        double weightInKg = weight * 0.45359237;
        
        // Variable to store the height in Meter.
        double heightInM = height * 0.0254;

        // Display result.
        System.out.printf("BMI is %.4f\n", weightInKg/(heightInM*heightInM));
    }
}
