
package Exercise04;

/**
 *
 * @author Nishant (20CS029)
 * @email 20CS029@charusat.edu.in
 *(Find numbers divisible by 5 and 6) Write a program that displays all the 
 * numbers from 100 to 1,000, ten per line, that are divisible by 5 and 6.
 * Numbers are separated by exactly one space.
*/
public class Exercise04_10 {
    public static void main(String[] args){
        
        //Display numbers
        final int Display_Number = 10;
        
        //count the number which divisible by 5 and 6
        int count = 0;
        
        //Test numbers from 100 to 1000
        for (int i = 100; i <= 1000; i++){
            
            //test number for it is divisible by 5 and 6
            if(i % 5 == 0 && i % 6 == 0){
                //increment count
                if(count % Display_Number == 0)
                    System.out.println(i);
                else
                    System.out.print(i + " ");
            }
        }
    }       
}
   
