package coding.java;

public class FibannaSeries {

	public static void main(String[] args) {
		  int a = 0;
	        int b = 1;
	        int n = 10;
	        System.out.println("Fibonacci Sequence:" + n);
	        System.out.print(a + " " + b + " ");

	        for (int i = 2; i < n; i++) {
	            int next = a + b;
	            System.out.print(next + " ");
	            a = b;
	            b = next;
	        }
	}

}
