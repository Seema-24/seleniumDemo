package coding.java;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 73;
		
		boolean flag = true; 
			
		if(num < 2) {
			System.out.println("Not considered as prime no.");
		} else {
			
			for (int i = 2; i <= num/2; i++) {
				//check every time no. is prime or not
				if(num%i== 0) {
					System.out.println(i);
					flag = false;
				}
			}
			
			if(flag) {
				System.out.println("number "+ num + " is a prime no.");
			} else {
				System.out.println("number "+ num + " is not a prime no.");
			}
		}
		
		
		
	}

}
