package Exercise03;

/* author@ Devasya Joshi(20CS020)
 *(Random character) Write a program that displays a random uppercase letter using
 * the Math.random() method.
 */
//creating public class Exercise03_16
public class Exercise03_16
 {
    public static void main(String[] args)
    {
        //Generating a random integer from 0 - 26 by Math.random()
        int randomNumber = (int)(Math.random() * 27);

        // Declaring alphabet as string and assigning the value
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        // selecting the random number and display the upper case as output
        System.out.println(Character.toUpperCase(alphabet.charAt(randomNumber)));
    }
 }
