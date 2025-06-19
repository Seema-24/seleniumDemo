package coding.java;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 123;
		int b = 45;
		
		if(a> b) {
			System.out.println("a is the Largest number");
		} else {
			System.out.println("b is largest number");
		}
		
		//Ternary Operator
		
		String res = (a>b)? a+" is largest number" : a+" is Not largest";
		
		System.out.println(res);
			
		
		
	}

}
