package Exercise04;

import java.util.*;
/**
 * @author shubhang khemani(20cs027)Display four patterns using loops) Use nested loops that display the following
 * patterns in four separate programs:
 * Pattern A Pattern B Pattern C Pattern D
 */


public class Exercise04_18 {
    public static void main(String[] args) {
        patternA();
        System.out.println();

        patternB();
        System.out.println();

        patternC();
        System.out.println();

        patternD();
    }

    // using nested loops
    //using for loops to print pattern A

    static void patternA() {
        System.out.println("Pattern A");
        int x = 1;
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j <= x; j++) {
                System.out.print(j);
            }
            System.out.println();
            x++;
        }

    }
    // using for loop to print pattern B

    static void patternB() {
        System.out.println("Pattern B");
        int x = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j < 7 - x; j++) {
                System.out.print(j);
            }
            System.out.println();
            x++;
        }

    }
    // using for loop to print pattern C

    static void patternC() {
        System.out.println("Pattern C");

        for (int i = 1; i <= 6; i++) {

            for (int j = 6 - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int z = i; z >= 1; z--) {
                System.out.print(z);
            }
            System.out.println();

        }
    }
//Using for loop to print pattern D
    static void patternD() {
        System.out.println("Pattern D");
        for (int i = 0; i < 6; i++) {

            for (int z = 0; z < i; z++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }
}