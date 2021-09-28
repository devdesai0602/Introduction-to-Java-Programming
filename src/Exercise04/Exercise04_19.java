package Exercise04;

/*
Exercise 4 Question 19:
(Display numbers in a pyramid pattern) Write a nested for loop that prints the
following output:
*/

/*.
*
* @author Tanay Deo 20CS014
*
*/

public class Main {

    public static void main(String[] args) {

        /* numberOfLines variable to hold the value of number of lines */
        int numberOfLines = 8;

        /* for loop to loop through the lines */
        for (int i = 1; i <= numberOfLines; i++) {
            /* printing spaces from j=0 to j=8-i (4 at a time) */
            for (int j = 1; j <= (numberOfLines - i); j++) {
                System.out.print("    ");
            }

            /* for loop to print the numbers in an incrementing fashion from 0 to i-1 */
            for (int j = 0; j < i; j++) {
                System.out.printf("%4d", (int) Math.pow(2, j));
            }

            // for loop to print the numbers in a decrementing fashion from i-2 to 0
            for (int j = i - 2; j >= 0; j--) {
                System.out.printf("%4d", (int) Math.pow(2, j));
            }
            System.out.println();

        }
    }
}