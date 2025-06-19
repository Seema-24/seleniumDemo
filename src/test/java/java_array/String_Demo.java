package java_array;

import java.util.Arrays;

public class String_Demo {

	public static void main(String args[]) {
		
		//===================length()================
		String s = "WELCOME";
		System.out.println(s.length());
		
		//===================concat()=============
		String s1 = "Java ";
		String s2 = "And Selenium";
		String s3 = " Automation";
		
		System.out.println(s1+s2); 
		System.out.println(s1.concat(s2)); //joining the string
		System.out.println(s1.concat(s2).concat(s3));
		System.out.println(s1.concat(s2+s3));
		
		//=========================trim()===============
		String tr = "      Seema    "; 
		System.out.println("Before Trim : "+tr +", Length: "+tr.length());
		System.out.println("After trim : "+tr.trim() +", Length: "+ tr.trim().length());
		
		//=================charAt()============
		System.out.println("CharAt() = "+s.charAt(5));
		
		//========contains()================
		System.out.println("contains = "+ s.contains("WEL")); //true
		
		//==================equals ============
		
		String s4 = "welcome";
		String s5 = "WELCOME";
	
		System.out.println("\n== : "+s+" & "+s5 +" "+ (s==s5));
		System.out.println("equals : "+s+" & "+s4 +" "+s.equals(s4));
		System.out.println("equals : "+s+" & "+s5 +" "+s.equals(s5));
		System.out.println("equalsIgnoreCase : "+s+" & "+s4 +" "+s.equalsIgnoreCase(s4));
		
		//=========================replace()======================
		String str = "Welcome to Selenium Course +  Program Selenium Automation Engineer and Experience in Selenium & Java";
		System.out.println("\nBefore Replace : "+str);
		System.out.println("After Replace  : "+str.replace("Selenium", "Python"));
		
		//======================substring extract the value from the string====================
		String em = "seema@gmail.com"; 
		System.out.println(em.substring(3, 5));

		//========================split the string into multiple parts based on delimeter
		String arr[] = em.split("@");
		System.out.println(Arrays.toString(arr));
		
		// *  ( ) ^ $ can't use as delimeter bcuz it count as regular expression and for some delimeter not perform action like ^ $
		String del = "45g(*d%s^sd*&S)ds $ (d*% s^ds) &n";
		//=====System.out.println(Arrays.toString(del.split("^"))); //" java.util.regex.PatternSyntaxException: 
		
		String val = "abc,234@xyz";
		String ar1[]= val.split(",");
		String ar[] = ar1[1].split("@");
		
		//==============replace multiple
		String amount = "$20,3,453";
		System.out.println(amount.replace("$", "").replace(",","" ));
		
	
		
	}
}
