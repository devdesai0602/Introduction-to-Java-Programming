/*
     --> Write a program that displays the result of
            9.5 x 4.5 - 2.5 x 3 / 45.5 - 3.5

     author:--> Harsh Avichal.
     ID    :--> 20CS005
     Email :--> 20CS005@charusat.edu.in
 */
package Exercise01;

public class Exercise01_05 {
    // created the class Exercise1_05.
    public static void main(String[] args) {
    // main function is been created.
        double a = 9.5, b = 4.5, c = 2.5, d = 3.0, e = 45.5, f = 3.5;
    // assigned certain values to the variables having double as a DataType.
        double result = (a * b) - (c * d) / (e - f);
    // created one result variable having double DataType which stores the equation.
        System.out.println(result);
    // The above statement will print the appropriate result of the equation.
    }
}
