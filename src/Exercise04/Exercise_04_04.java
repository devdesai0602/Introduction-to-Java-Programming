//(Conversion from miles to kilometers) Write a program that displays the following
//table (note that 1 mile is 1.609 kilometers):
//Miles           Kilometers
//1               1.609
//2               3.218
//...
//9               14.481
//10              16.090

public class Exercise_04_04 {
	public static void main(String[] args) {
		// we are giving kilo value constant
		final double KILO = 1.609; 

		// the head display
		System.out.println(
			"Miles        Kilometers");

		//converting miles into kilometer
		for (int i = 1; i <= 20; i++) {
            //printing miles and giving spaces
            System.out.print( i +"              ");
            //multiplying miles into kilometer
			System.out.println( i*KILO);
		}
	}
}