/* 
 * (Science: wind-chill temperature) How cold is it outside? The temperature alone is
 * not enough to provide the answer. Other factors including wind speed, relative
 * humidity, and sunshine play important roles in determining coldness outside. In
 * 2001, the National Weather Service (NWS) implemented the new wind-chill temperature
 * to measure the coldness using temperature and wind speed. The formula is:
 * where is the outside temperature measured in degrees Fahrenheit and v is the speed
 * measured in miles per hour. is the wind-chill temperature. The formula cannot be
 * used for wind speeds below 2 mph or temperatures below or above
 * Write a program that prompts the user to enter a temperature between and
 * and a wind speed greater than or equal to 2 and displays the wind-chill temperature.
 * Use Math.pow(a, b) to compute v0.16. Here is a sample run:
 * twc = 35.74 + 0.6215ta - 35.75v0.16 + 0.4275tav0.16
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise02;
import java.util.Scanner;
/**
 *
 * @author 20CS041_Khushbu
 */
public class Exercise02_17 {
    public static void main(String[] args){
        //Create a scaner object
        Scanner input = new Scanner(System.in);
        //Prompt the user to enter temperature and wind speed
        System.out.println("Please enter the fahrenheit temperature between -58F and 41F and enter the wind speed greater then or equal to 2 miles per hour.");
        System.out.println("Enter the temperature in Fahrenheit:");
        double fahrenheit = input.nextDouble();
        System.out.println("Enter the wind speed in miles per hour:");
        double windSpeed = input.nextDouble();
        //Check the condition whether the fahrenheit temperature is in the range
        if(fahrenheit>=-58 && fahrenheit<=41 && windSpeed >=2){
        //Calculate the wind chill index.    
        double index = 35.74 + 0.6215 * fahrenheit - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * fahrenheit * Math.pow(windSpeed, 0.16);
        System.out.println("The wind chill index is " +index);
        }
        else{
        System.out.println("Please enter valid temperature and wind speed.");
        }
        }
}
