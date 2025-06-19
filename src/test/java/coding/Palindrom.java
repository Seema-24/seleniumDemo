package coding.java;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		 System.out.println(num);
	 
		 //int  num = 454;   //It is the number variable to be checked for palindrome 
		 
		 int temp,rem;
		 
		 int sum=0;
		  
		  temp = num;
		  
		  while(num>0) {    
			   rem = num%10;  //getting remainder 
			   
			 
			   sum = (sum*10) + rem;   //reverese the no. 
			   
			   num = num/10;    // dividend divide by divisor and get quotient
		  }    
		  
		  if(temp == sum)      
			  System.out.println("palindrome number is "+ sum);    
		  else    
			  System.out.println("this is not palindrome");  
		  
		  sc.close();
	}

}
