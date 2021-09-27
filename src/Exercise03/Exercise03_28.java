
package Exercise03;
import java.util.Scanner;

/**
 *
 * @author vraj nagarsheth(20cs039)
 * Write a program that prompts
 * the user to enter the center x-, y-coordinates, width, and
 * height of two rectangles and determines whether the second
 * rectangle is inside the first or overlaps with the first
 */
public class Exercise03_28 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double x1; // to store x coordinate of rectange 1
    double y1;// to store y coordinate of rectange 1
    double w1;// to store width of rectange 1
    double h1;// to store height of rectange 1
    
    System.out.println("Enter rectangle 1 centre,x,y,width,height:");
    //scanning centre,x,y,width,height of rectangle 1
     x1 = sc.nextDouble();
     y1 = sc.nextDouble();
     w1 = sc.nextDouble();
     h1 = sc.nextDouble();
     w1 = w1 / 2;
     h1 = h1 / 2;
     
     System.out.println("Enter rectangle 2 centre,x,y,width,height:");
     double x2;// to store x coordinate of rectange 2
     double y2;// to store y coordinate of rectange 2
     double w2;// to store width of rectange 2
     double h2;// to store height of rectange 2
     
     //scanning centre,x,y,width,height of rectangle 1
     x2 = sc.nextDouble();
     y2 = sc.nextDouble();
     w2 = sc.nextDouble();
     h2 = sc.nextDouble();
     w2 = w2 / 2;
     h2 = h2 / 2;
     // Calculating range of r1 and r2
    double x1max = x1 + w1;
    double y1max = y1 + h1;
    double x1min = x1 - w1;
    double y1min = y1 - h1;
    double x2max = x2 + w2;
    double y2max = y2 + h2;
    double x2min = x2 - w2;
    double y2min = y2 - h2;
    
    if (x1max == x2max & x1min == x2min & y1max == y2max
    & y1min == y2min) {
    // Check if the two are identicle
    System.out.print("rectangle1 and rectangle2 are indentical");
    }
    
    else if (x1max <= x2max & x1min >= x2min & y1max <= y2max
    & y1min >= y2min) {
    // Check if rectangle1 is in rectangle2
    System.out.print("rectangle1 is inside rectangle2");
    } 
    
    else if (x2max <= x1max & x2min >= x1min & y2max <= y1max
    & y2min >= y1min) {
    // Check if rectangle2 is in rectangle1
    System.out.print("rectangle2 is inside rectangle1");
    } 
    
    else if (x1max < x2min || x1min > x2max || y1max < y2min
    || y2min > y1max) {
    // Check if the two overlap
    System.out.print("rectangle2 does not overlaps rectangle1");
    }
    
    else {
    System.out.print("rectangle2 overlaps rectangle1");
   }
     
   }
    
}