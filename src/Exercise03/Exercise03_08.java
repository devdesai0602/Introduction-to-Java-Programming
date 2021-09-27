package Exercise03;

import java.util.Scanner;

/* 
*
*
*@author: MITREN KADIWALA (20CS021)
*email : 20CS021@charusat.edu.in
*(Sort  three  integers)  Write  a  program  that  sorts  three  integers.  
*The  integers  areentered  from  the  input  dialogs  and  stored  in  variables  num1,num2,  and  num3,respectively. 
*The program sorts the numbers so that num1 <= num2 <=num3
*
*
*
*
*
*
*/



public class Exercise03_08 
{
    //Declaring num1,num2,num3 as private integers 
    private int num1,num2,num3;


    //Getting user input for all numbers to be sorted
    public void getIntegers()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number whose order is to be found : ");
        num1 = sc.nextInt();
        System.out.print("Enter the 2nd number whose order is to be found : ");
        num2 = sc.nextInt();
        System.out.print("Enter the 3rd number whose order is to be found : ");
        num3 = sc.nextInt();
        sortNumber(num1 , num2 ,num3);
    }


    //Private method for sorting and printing
    private void sortNumber(int n1, int n2, int n3)
    {
        //Stores temperory number as a temperory variable in the process of sorting
        // int tempNumber = 0;
        int sortedNumber1 = 0, sortedNumber2 = 0, sortedNumber3 = 0; 
        //Logic for sorting
        if(num1 <= num2 && num1 <= num3)
        {
            if(num2 <= num3)
            {
                sortedNumber1 = num1;
                sortedNumber2 = num2;
                sortedNumber3 = num3;
            }
            else if(num3 < num2)
            {
                sortedNumber1 = num1;
                sortedNumber2 = num3;
                sortedNumber3 = num2;
            }

        }
        else if(num2 <= num1 && num2 <= num3)
        {
            if(num1 <= num3)
            {
                sortedNumber1 = num2;
                sortedNumber2 = num1;
                sortedNumber3 = num3;
            }
            else if(num3 < num1)
            {
                sortedNumber1 = num2;
                sortedNumber2 = num3;
                sortedNumber3 = num1;
            }
        }
        else if(num3 <= num1 && num3 <= num2)
        {
            if(num1 <= num2)
            {
                sortedNumber1 = num3;
                sortedNumber2 = num1;
                sortedNumber3 = num2;
            }
            else if(num2 < num1)
            {
                sortedNumber1 = num3;
                sortedNumber2 = num2;
                sortedNumber3 = num1;
            }

        }

        //Printing the result
        System.out.println("The numbers in sorted form are : "+ sortedNumber1 +" ≤ "  + sortedNumber2 + " ≤ " + sortedNumber3 );

    }


    //main method 
    public static void main(String[] args) 
    {
        Exercise03_08 exp1 = new Exercise03_08 ();
        exp1.getIntegers();
    }    
}
