package Exercise01;
/* Write a program that displays the area and
*perimeter of a rectangle with the width of 4.5 and height of 7.9 using the following formula:
* area = width * height
*/
public class Exercise01_09
{
        public static void main(String[] args)
        {
            //as stated in problem question
            double width = 4.5, height = 7.9;

            //required formulas
            double area = width*height;
            double perimeter = 2*(width+height);

            //printing the answers
            System.out.println("The area of the rectangle is\n " + area + "and the perimeter is\n " + perimeter);
        }
}
