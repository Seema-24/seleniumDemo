package java_array;

import java.util.Arrays;

public class Sorting {
	
	public static void main(String args[]) {
	
		int a[] = {200,300,50,20,425,234};
		
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		System.out.println("After sorting \n" + Arrays.toString(a));
	}
}
