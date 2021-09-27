package Exercise04;
/*
*@author:-Devraj Parmar(20cs044)
*In the Exercise04_05, we convert Kilograms to Pounds & Pounds to Kilograms using for loop
*Kilograms=i & Pounds=j so, i=j*0.453 & j=i*2.2 using this formula we get our answer
*/
public class Exercise_04_05 {

public static void main(String[] args)
{
    System.out.println("Kilograms   Pounds   |   Pounds   Kilograms");
    int j=20;

    for (int i=1;i<200;i+=2) {
        System.out.println(i+"           "+i*2.2+"      |   "+j+"       "+j*0.453);
        j+=5;
      }
}
}
