package Exercise04;

import java.util.Scanner;

/*
@author: Harshive Patel 
Id: 20cs051
email: 20cs051@charusat.edu.in 

*/
/*
--------------------------------------------Exercise 04_23----------------------------------
(Obtain more accurate results) In computing the following series, you will obtain
more accurate results by computing from right to left rather than from left to right:
Write a program that computes the results of the summation of the preceding
series from left to right and from right to left with n = 50000
*/
public class Exercise04_23 {
    public static void main(String[] args) {

        double n = 50000, sum = 0, temp, i;// defining variables n,sum,temp,i as double
        for (i = 0; i <= n; i++)// for loop starts
        {
            temp = 1 / (i + 1);// using temp variable defining the sequence of the series amd storing the value
                               // of it
            sum += temp;// using the value of temp from above and adding it to sum

        } // fro loop ends
        System.out.println("The sum is: " + sum);// displaying the total sum of the sequence
    }

}
