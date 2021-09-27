package Exercise03;

import java.util.Scanner;

/*
Exercise 3 Question 5 :
 (Find future dates) Write a program that prompts the user to enter an integer for
today’s day of the week (Sunday is 0, Monday is 1, . . ., and Saturday is 6). Also
prompt the user to enter the number of days after today for a future day and display the future day of the week
*/

/*
 *
 * @author Tanay Deo 20CS014
 *
 */

public class Main {

    public static void main(String[] args) {

        /* currentDay variable stores the value of the current day entered by user */
        int currentDay;

        /* name_of_currentDay stores the name of currentDay */
        String name_of_currentDay = "";

        /* elapsedDay variable stores the value of the days elapsed after current day */
        int elapsedDay;

        /* elapsedDayCounter variable will be used to store the value of the modulo operation remainder */
        int elapsedDayCounter;

        /* Initializing scanner variable to read input from user */
        Scanner sc = new Scanner(System.in);

        /* Asking user to input the value of currentDay and elapsedDay */
        System.out.print("Enter today's day : ");
        currentDay = sc.nextInt();
        System.out.print("Enter the number of days elapsed since today : ");
        elapsedDay = sc.nextInt();

        /* Converting the value of elapsedDay entered by a user between 0-6 */
        elapsedDayCounter = currentDay+(elapsedDay%7);

        /* Printing the corresponding name of the day to the value entered by the user */
        switch (currentDay){
            case 0:
                name_of_currentDay = "Sunday";
                break;
            case 1:
                name_of_currentDay = "Monday";
                break;
            case 2:
                name_of_currentDay = "Tuesday";
                break;
            case 3:
                name_of_currentDay = "Wednesday";
                break;
            case 4:
                name_of_currentDay = "Thursday";
                break;
            case 5:
                name_of_currentDay = "Friday";
                break;
            case 6:
                name_of_currentDay = "Saturday";
                break;
        }

        /* Printing the values of the current day and the elapsed day */
        if (elapsedDayCounter == 0){
            System.out.print("Today is "+name_of_currentDay+ " and the future day is Sunday");
        }
        else if (elapsedDayCounter == 1){
            System.out.print("Today is "+name_of_currentDay+" and the future day is Monday");
        }
        else if (elapsedDayCounter == 2){
            System.out.print("Today is "+name_of_currentDay+" and the future day is Tuesday");
        }
        else if (elapsedDayCounter == 3){
            System.out.print("Today is "+name_of_currentDay+" and the future day is Wednesday");
        }
        else if (elapsedDayCounter == 4){
            System.out.print("Today is "+name_of_currentDay+" and the future day is Thursday");
        }
        else if (elapsedDayCounter == 5){
            System.out.print("Today is "+name_of_currentDay+" and the future day is Friday");
        }
        else if (elapsedDayCounter == 6){
            System.out.print("Today is "+name_of_currentDay+" and the future day is Saturday");
        }
    }
}
