/*
 * @author SamirAli Mukhi 
 * S.ID: 20CS038
 * Email: 20cs038@charusat.edu.in
 */

/*Exercise 02.16 (Geometry: area of a hexagon) 
  Write a program that prompts the user to enter the side of a hexagon and displays its area.*/

package Exercise02;
import java.util.Scanner;

public class Exercise02_16 
{
    public double side, constant, area;   //Variable declaration for side, constant & area of hexagon
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in); //Declare Object of Scanner

        System.out.print("Enter the side: ");
        double side = input.nextDouble();  //Scanner Object called (Take input(side of hexagon) from user)
        double constant = (3 * 1.732) / 2;  //calculating constant for area of a hexagon
        double area = (constant*side*side);  //Calculating the area of a hexagon
        System.out.println("\nThe area of the hexagon is " + area);  //Print the area of a hexagon
    }
}

/*OUTPUT:
  Enter the side: 5.5                        [Press Enter]
  The area of the hexagon is 78.5895
*/
