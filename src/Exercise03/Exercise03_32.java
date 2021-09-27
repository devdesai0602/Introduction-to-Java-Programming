package Exercise03;
import java.util.Scanner;

/**
 *
 * @author vraj nagarsheth(20cs039)
 *Given a directed line from point p0(x0, y0) to p1(x1,
 * y1), you can use the following condition to decide whether a point p2(x2, y2) is
 * on the left of the line, on the right, or on the same line (see Figure 3.11):
 * (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0) c 7= 60 p2 is on the same line 0 p2 is on the left side of the line 0 p2 is on the right side of the line
 * FIGURE 3.11 (a) p2 is on the left of the line. (b) p2 is on the right of the line. (c) p2 is on
 * <p>
 * <p>
 * Write a program that prompts the user to enter the three points for p0, p1, and p2
 * and displays whether p2 is on the left of the line from p0 to p1, on the right, or on*/
public class Exercise03_32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three points for p0, p1, and p2:");  //enter the three points for p0, p1, and p2
        float x0,x1,x2,y0,y1,y2,point; // store points
        //scanning inputs from user
        x0=sc.nextFloat();
        x1=sc.nextFloat();
        x2=sc.nextFloat();
        y0=sc.nextFloat();
        y1=sc.nextFloat();
        y2=sc.nextFloat();
        point=(x1 - x0)*(y2 - y0)-(x2 - x0)*(y1 - y0);  //point position
       
        //display result
        if(point>0){
        System.out.println("(" + x2 + "," + y2 + ") is on the" + ("left side of the") + 
                         ("line from (" + x0 + "," + y0 + ") to (" + x1 + "," + y1 +")"));}
        else if(point==0)
        {System.out.println("(" + x2 + "," + y2 + ") is on the" + 
                ("line from (" + x0 + "," + y0 + ") to (" + x1 + "," + y1 +")"));}
        
        else{
        System.out.println("(" + x2 + "," + y2 + ") is on the" + ("right side of the") + 
                         ("line from (" + x0 + "," + y0 + ") to (" + x1 + "," + y1 +")"));
        
        }
       
    }}