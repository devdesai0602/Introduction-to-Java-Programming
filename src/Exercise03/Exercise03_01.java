package Exercise03;

/*
* @author Khush Bhalodiya (20CS007)
*(Algebra: Solve Quadratic equations) The two root of a quadratic equation
*ax^2+bx+c=0 can be obtained using the following formula:
*r1 = (-b + √((b^2 )-4ac))/2a and r2 = (-b - √((b^2 )-4ac))/2a
*
*(b^2)-4ac) is called the discriminant of the quadratic equation. If it is positive, the
*equation has two real roots. If it is zero, the equation has one root. If it is negative,
*the equation has no real roots.
*
*Write a program that prompts the user to enter values for a, b, and c and displays
the result based on the discriminant. If the discriminant is positive, display two
roots. If the discriminant is 0, display one root. Otherwise, display “The equation
has no real roots”.
*Note that you can use Math.pow(x, 0.5) to compute √x
*
*/

import java.util.Scanner;

public class Exercise03_01 {

	public static void main(String[] args) {

		double a, b, c, Dis, x, y, z;

		Scanner sc = new Scanner(System.in);
		
		//Input from the user
		System.out.println("Enter the values a, b, and c: ");
		
		//Input the three number
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		//Calculate the discriminant
		Dis = (b * b) - (4 * a * c);

		//Checking the discriminant
		if (Dis > 0) {
			
			//Calculate root 1
			x = (-b + Math.pow(Dis, 0.5)) / (2 * a);

			//Calculate root 2
			y = (-b - Math.pow(Dis, 0.5)) / (2 * a);

			//Display the two roots obtained
			System.out.println("The roots are " + x + "and " + y);
		}

		else if (Dis == 0) {
			
			//Calculate the one root
			z = -b / 2;

			//Display the root obtained
			System.out.println("The root is " + z);
		}

		else {
			System.out.println("The equation has no real roots ");
		}
	}
}
