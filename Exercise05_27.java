/*(Emirp) An emirp (prime spelled backward) is a nonpalindromic prime number
whose reversal is also a prime. For example, 17 is a prime and 71 is a prime, so 17
and 71 are emirps. Write a program that displays the first 100 emirps. Display 10
numbers per line, separated by exactly one space, as follows:
13 17 31 37 71 73 79 97 107 113 
149 157 167 179 199 311 337 347 359 389
...*/
package Exercise05;

public class Exercise05_27 {
	public static void main(String[] args) {
		int count = 1;// total number of numbers
		int i = 2;
		while (count <= 100) {
			if (isemirps(i)) {
				System.out.print(i + " ");
				if (count % 10 == 0) {
					System.out.println();
				}
				count++;
			}

			++i;
		}

	}

	private static boolean isemirps(int n) {
		if (isPrime(n)) {
			String s = String.valueOf(n);
			if (checkPalindrome(s)) {
				return false;
			} else {
				String result = "";
				for (int i = s.length() - 1; i >= 0; i--) {
					result += s.charAt(i);
				}
				int reverseNum = Integer.parseInt(result);
				return isPrime(reverseNum);
			}
		}
		return false;
	}

	// check whether it is prime or not
	static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	// check whether it is palindrome or not
	static boolean checkPalindrome(String number) {
		for (int i = 0, j = number.length() - 1; i < number.length() / 2; i++, j--) {
			if (number.charAt(i) != number.charAt(j)) {
				return false;
			}
		}
		return true;
	}

}
