/*
 * @author : Ditsa Mandani
 * @email : <20cs031@charusat.ac.in>
 *
 * Exercise 3.23 (Geometry: point in a rectangle?) Write a program that prompts the user to enter a
 * point(x, y)and checks whether the point is within the rectangle centered at (0,0) with width 10
 * and height 5. For example, (2,2) is inside the rectangle and (6,4) is outside the rectangle, as shown in Figure 3.9b. 
 * (Hint: A point is in the rectangle if its horizontal distance to (0,0) is less than or equal to 10 / 2
 * and its vertical distance to (0,0) is less than or equal to 5.0 / 2. Test your program to cover
 * all cases.)
 *
 */

package Exercise03;

import java.util.Scanner;
public class Exercise03_23 
{
        public static void main(String []args)
        {   
            // use of scanner class to take input
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a point (x,y): ");

            // declaration of variables
            float x,y;

            // initialization of variables
            x=input.nextFloat();
            y=input.nextFloat();

            //loop to check whether or not the given point is inside the rectangle
            if(x < 10/2)
            {
                if(y < 5.0/2)
                {
                    System.out.println("The given point is inside the rectangle.");
                }
                
                else
                {
                    System.out.println("The given point is not inside the rectangle.");
                }
            }

            else
            {
                System.out.println("The given point is not inside the rectangle.");
            }
        }
}
