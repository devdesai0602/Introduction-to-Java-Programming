import java.util.Scanner;

public class Exercise_04_46 {
    //taking input 
	public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
		// enter the digit in short cause its 16 bit integer
		System.out.print("Enter an integer: ");
		short dit = sc.nextShort();
        // Holds the bits
		String bits = "";	
        //reference from google
		// Get the 16 bits for the integer 
		for (int i = 0; i < 16; i++) {
            //from text book hint
            // bitwise  ANDoperator (&)
			bits = (dit & 1) + bits;
            // bitwise  right  shift  operator  (>>)
			dit >>= 1;
		}

		// Display result
		System.out.println("The bits are " + bits);
	}
}