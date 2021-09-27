package Exercise02;
import java.util.Scanner;
/* 
    @author Disney Javiya (20CS019)
    (Convert feet into meters)
    Write a program that reads a number in feet, converts it
    to meters, and displays the result. One foot is 0.305 meter.
*/
public class Exercise02_03
{
	//convert feet into meters
        public static void main(String[] args) 
       {
        float feet;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value for feet: ");
    
        feet=sc.nextFloat();
        // meter = feet* 0.305
        System.out.println(feet +" feet is "+ (feet*0.305)+" metres");
        sc.close();
       }
}





