import java.util.Scanner;

//(Algebra: Solve 2x2 linear quations) You can use Cramer's rule to solve the following 2x2 system of linear equation:
// Write a program that prompt the user to enter a,b,c,d,e,f and display the result. If ad-bc=0, report That "The equation has no solution

public class Exercise03_03
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); // Scanner class object
        System.out.println("Enter your value");
        int a,b,c,d,e,f; // Variable a,b,c,d,e,f
        a = sc.nextInt(); //Taking value of 'a' from the user
        b = sc.nextInt(); //Taking value of 'b' from the user
        c = sc.nextInt(); //Taking value of 'c' from the user
        d = sc.nextInt(); //Taking value of 'd' from the user
        e = sc.nextInt(); //Taking value of 'e' from the user
        f = sc.nextInt(); //Taking value of 'f' from the user

        if ((a*d-b*c)!=0)
        {
            double x = (e*d - b*f)/(a*d-b*c);
            double y = (a*f-e*c)/(a*d-b*c);
            System.out.println("x is "+x+" "+"y is "+y); // Printing the solution
        }
        else
        {
            System.out.println("The equation has no solution"); 
        }
    }
}
