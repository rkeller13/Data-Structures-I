package group1;

import stdlib.StdIn;
import stdlib.StdOut;

/* 
 * Authors: Robert Keller
 */

public class FindGCD {

	public static long euclid(int a, int b){
		if (b == 0) {
			return a;
		}
			return euclid(b, a%b);
		}


	public static void main(String[] args) {
		StdOut.print("Enter a positive integer: ");
		int a = Integer.parseInt(StdIn.readLine());
		StdOut.print("Enter another positive intger: ");
		int b = Integer.parseInt(StdIn.readLine());
		StdOut.printf("The greatest common divisor of the two numbers is %,d.", euclid(a, b));

	}

}
