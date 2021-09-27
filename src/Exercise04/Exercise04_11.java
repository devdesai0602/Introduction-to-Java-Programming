package Exercise04;
/*
 * @author Taufik Mansuri 
 * ID 20CS032
*/
/*
 * 5.11 (Find numbers divisible by 5 or 6, but not both) Write a program that displays all the numbers 
 *from 100 to 200, ten per line, that are divisible by 5 or 6, but not both. Numbers are separated by 
 *exactly one space.
 */
public class Exercise04_11 {
    public static void main(String[] args) {

        int count = 0;

        for (int i = 100; i <= 200; i++) //numbers from 100 to 200
        {

            if (i % 5 == 0 ^ i % 6 == 0) //find the number divisible by 5 or 6, but not both
            {
                System.out.print(i + " "); //print one space after each number
                count++;
            }

            if (count == 10) //more than ten number than print in new line
            {
                System.out.println();
                count = 0;
            }
        }
    }
}
