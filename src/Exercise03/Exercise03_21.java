package Exercise03;
/* 20cs040
shubhangi nakrani batch B1
 */
import java.util.Scanner;
public class Exercise03_21 {
     public static void main(String[] arg)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter year : 2012");
        int yr=s.nextInt(); //year
        System.out.println("Enter month : 1-12");
        int m=s.nextInt();//month
        System.out.println("Enter the day of the month :1-31");
        int q=s.nextInt();//day of month
        int j=yr/100;
        int k=yr%100;
        int h=(q+(((26*m)+26)/10)+k+(k/4)+(j/4)+(5*j))%7; //zeller's formula
        String day="";
        //using swith casse found the day
        switch (h)
        {
            case 0: day="Saturday";
                break;
            case 1: day="Sunday";
                break;
            case 2: day="Monday";
                break;
            case 3: day="Tuesday";
                break;
            case 4: day="Wednesday";
                break;
            case 5: day="Thursday";
                break;
            case 6: day="Friday";
                break;
        }
        System.out.println("Day of week is :"+day);
    }
}

 /*   Enter year
        2021
        Enter month
         9
        Enter day of month
        23
        Day of week is Thursday

        Process finished with exit code 0*/
/*  Enter year : 2012
   2021
   Enter month : 1-12
   9
   Enter the day of the month :1-31
   24
   Day of week is :Friday

Process finished with exit code 0*/