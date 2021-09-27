package Exercise02;

import java.util.Scanner;

/* 
*
*
*@author: MITREN KADIWALA (20CS021)
*email : 20CS021@charusat.edu.in
*(Convert pounds into kilograms) Write a program that converts pounds into kilo-grams. 
*The program prompts the user to enter a number in pounds, converts it tokilograms,  and  displays  the  result.  
*One  pound  is  0.454kilograms.  
*Here  is  asample run:Enter a number in pounds: 55.5 pounds is 25.197 kilograms
*
*
*/
public class Exercise02_04 {
    
    public static void main(String[] args) {
    double pound_To_Kg = 0.454;
    
    //Stores the weight in pounds
    double weightPounds;
    //Stores the weight converted in kilograms
    double weightKilograms;
    
    
    
    //Taking input using scanner class for kilograms
    Scanner sc = new Scanner(System.in);
    System.out.print("run:Enter a number in pounds: ");
    weightPounds = sc.nextDouble();


    //Computing the weight in kilogram from pounds
    weightKilograms = weightPounds * pound_To_Kg;

    //The result 
    System.out.println(weightPounds + " pounds is " + weightKilograms + " kilograms");
    
}

}