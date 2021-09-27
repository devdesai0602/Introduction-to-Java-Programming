/*
 * (Geometry: points in triangle?) Suppose a right triangle is placed in a plane as
 * shown below. The right-angle point is placed at (0, 0), and the other two points
 * are placed at (200, 0), and (0, 100). Write a program that prompts the user to enter
 * a point with x- and y-coordinates and determines whether the point is inside the
 * triangle. Here are the sample runs:
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise03;
import java.util.Scanner;
/**
 *
 * @author Name:Khushbu Oza
 *         Id: 20CS041
 *         Exercise03_27
 */
public class Exercise03_27 {
    public static void main(String[] args) {
        //Create a scaner object
        Scanner input = new Scanner(System.in);
        //Prompt the user to enter x coordinate
        System.out.println("Enter the x coordinate:");
        double x = input.nextDouble();
        //Promt the user to enter y coordinate
        System.out.println("Enter the y coordinate:");
        double y = input.nextDouble();
        boolean pointInside = true;
        //Check whether the x-coordinate is within the rectangular box
        if(x > 200 || x < 0)
        pointInside = false;
        if(pointInside){
        //Check whether the y-coordinate is within the rectangular box
        if(y > 100 || y < 0)
        pointInside = false;
        // ((x2-x1)*(y-y1))-((x-x2)*(y2-y1))
        double determinant=((200-0)*(y-100))-((x-0)*(0-100));
        if(determinant>0)
        pointInside = false;
        }
        if(pointInside)
        System.out.println("The point is in the triangle.");
        else
        System.out.println("The point is not in the triangle.");
        }
}
    
   

