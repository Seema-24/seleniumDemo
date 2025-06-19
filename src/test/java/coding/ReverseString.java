package coding.java;

public class ReverseString {

	public static void main(String[] args) {
		String var = "Seema Kumari";
		String rev = "";

		// using for loop charAt()
		/*for (int i = var.length() - 1; i >= 0; i--) {
			rev = rev + var.charAt(i);
		}
		System.out.println("String reverse using charAt() : " + rev);
		*/
		
		// Using string Builder and String Buffer
		/* StringBuilder sb = new StringBuilder();
		System.out.println("Original String : " + sb.append(var));
		System.out.println("String reverse using StringBuilder : " + sb.reverse().toString());

		StringBuffer sbf = new StringBuffer(var);
		System.out.println("String reverse using StringBuffer : " + sbf.reverse());
		*/
		
		// By using toCharArray
		/*char ch[] = var.toCharArray();
		int size = ch.length;

		for (int i = size - 1; i >= 0; i--) {

			rev += ch[i];

		}
		System.out.println(" Reverse String using toCharArray() : " + rev);
		*/
		
		ReverseString recur = new ReverseString();
		String value = recur.reverse(var);
		System.out.println("After "+ value);
		
	}

	//Outside main method recursion method
	public String reverse(String str) {
	    if (str.isEmpty()) {
	    	return str;
	    }
	   return reverse(str.substring(1)) + str.charAt(0);
	
	}


}

