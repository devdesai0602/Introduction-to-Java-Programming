package Exercise04;
/**
 * @author shubhang khemani(20cs027)(Display the ASCII character table)
 * <p>
 * Write a program that prints the characters in
 * the ASCII character table from ! to ~. Display ten characters per line. The ASCII
 * table is shown in Appendix B. Characters are separated by exactly one space.
 */

import java.util.*;


public class Exercise04_15 {
    public static void main(String[] args) {
        int start = '!';
        int end = '~';

        for (int i = start, j = 1; i <= end; i++, j++) {
            if (j % 10 == 0) {
                System.out.println();
            }
            System.out.print((char) i);
        }
    }
}