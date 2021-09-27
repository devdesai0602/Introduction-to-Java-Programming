
package Exercise04;

/**
 *
 * @author Nishant (20CS029)
 * @email 20CS029@charusat.edu.in
 *(Sum a series) Write a program to sum the following series:
 * 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 + ... + 95/97 + 97/99 
 */

public class Exercise04_24 {
    public static void main(String[] ags){
        
        //Sum of series
        double sum_of_numbers = 0.0;
        for (double n=1.0; n<=97.0; n+=2){
            sum_of_numbers += n/(n+2);
        }
    
        //Display Output
        System.out.println("Series: 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 + ... + 95/97 + 97/99");
        System.out.println("Sum Of Series : " + sum_of_numbers);
    }
}
