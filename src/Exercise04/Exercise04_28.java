package Exercise04;
/*20cs040v
shubhangi nakrani
 */
import java.util.Scanner;
public class Exercise04_28 {
    public static void main(String[] args)
    {
        System.out.println("enter the year");
        Scanner s=new Scanner(System.in);
        int year=s.nextInt();
        System.out.println("enter the first day of the year");
        System.out.println(" 0 for sunday");
        System.out.println(" 1 for monday");
        System.out.println(" 2 for tuesday");
        System.out.println(" 3 for wednesday");
        System.out.println(" 4 for thursday");
        System.out.println(" 5 for friday");
        System.out.println(" 6 for saturday");
        int day=s.nextInt();
        int january=day;
        int fab=day-4;
        int march=day-4;
        int april=day-1;
        int may=day+1;
        int june=day-3;
        int july=day-1;
        int august=day+2;
        int sep=day-2;
        int oct=day;
        int nov=day-4;
        int dec=day-2;
        int arr[]=new int[12]; //create a array for month
                arr[0]=january;
                arr[1]=fab;
                arr[2]=march;
                arr[3]=april;
                arr[4]=may;
                arr[5]=june;
                arr[6]=july;
                arr[7]=august;
                arr[8]=sep;
                arr[9]=oct;
                arr[10]=nov;
                arr[11]=dec;
        String days[]=new String[12];
        if(year%4==0) //logic for leap year
        {
            for (int i=1;i<12;i++)
            {
                arr[i]++;
            }
        }
        for (int i=0;i<12;i++)
        {
            while (arr[i]<0) //if the negative value come from month than add 7
            {
                arr[i]+=7;
            }
            while (arr[i]>6) //if thr value grater than 6 then -7
            {
                arr[i]-=7;
            }
            switch (arr[i])
            {
                case 0:
                    days[i]="sunday";
                    break;
                case 1:
                    days[i]="Monday";
                    break;
                case 2:
                    days[i]="Tuesday";
                    break;
                case 3:
                    days[i]="wednesday";
                    break;
                case 4:
                    days[i]="thursday";
                    break;
                case 5:
                    days[i]="friday";
                    break;
                case 6:
                    days[i]="saturday";
                    break;

            }
        }
        System.out.println("First day of January is :"+days[0]);
        System.out.println("First day of February is :"+days[1]);
        System.out.println("First day of march is :"+days[2]);
        System.out.println("First day of April is :"+days[3]);
        System.out.println("First day of May is :"+days[4]);
        System.out.println("First day of june is :"+days[5]);
        System.out.println("First day of july is :"+days[6]);
        System.out.println("First day of August is :"+days[7]);
        System.out.println("First day of september is :"+days[8]);
        System.out.println("First day of october is :"+days[9]);
        System.out.println("First day of November is :"+days[10]);
        System.out.println("First day of December is :"+days[11]);


    }
}
//output
/*enter the year
2021
enter the first day of the year
 0 for sunday
 1 for monday
 2 for tuesday
 3 for wednesday
 4 for thursday
 5 for friday
 6 for saturday
5
First day of January is :friday
First day of February is :Monday
First day of march is :Monday
First day of April is :thursday
First day of May is :saturday
First day of june is :Tuesday
First day of july is :thursday
First day of August is :sunday
First day of september is :wednesday
First day of october is :friday
First day of November is :Monday
First day of December is :wednesday

Process finished with exit code 0
*/