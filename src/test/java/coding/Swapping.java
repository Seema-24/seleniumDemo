package coding.java;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 30;
		int b = 46;
		System.out.println("a : " + a);
		System.out.println("b : " + b);

		// Logic 1 -- using third variable
		/*
		 * int c = a; a = b; b = c;
		 */

		// Logic 1 -- without third variable and + - operator
		/*
		 * b = a + b; a = b - a; b = b-a ;
		 */

		//Logic 3 -- using * and / operator
		/*
		 * a = a*b; b = a/b; a = a/b;
		 */
		
		//Logic 4 -- Bitwise XOR (^)
		/*
		 * a = a^b; b = a^b; a = a^b;
		 */
		
		
		//Logic 5 -- In Single statement 
		b = a+b - (a=b); 
		
		
		System.out.println("\nAfter swapping the value");
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
	}

}
