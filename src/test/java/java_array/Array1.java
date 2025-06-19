package java_array;

import java.util.Iterator;

public class Array1 {

	public static void main(String[] args) {
		/*
		int a[] = {10,20,30,43,45,56,34,32,55};
		
		//enhance for loop -- single dimensional array
		for (int i : a) {
			System.out.print(i +" ");
		}
		*/
		
		//=================Two dimensinal Array =====================================
		
		/*
		 
		//int a[][] = new int[3][4] //declare array with fixed size
		//int []a[] = new int[3][4];
		int [][]a = new int[3][4];
		
		int num = 10;
		
		//initialize array
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = i+j+ num;
				num++;
			}
			
		}
		
		//print values 
		for (int i  = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] +"  ");
			}
			System.out.println();
		}
		System.out.println("\nEnhance for loop approach");
		//another way of print 
		for (int[] row : a) {
			for (int col : row) {
				System.out.print(col +"  ");
			}
			System.out.println();
		}
		
		*/
		//==================================Another appoach to store two dimensional array=====================
		int a[][] = {
				{10,20,59,60,43},
				{34,56,34,334},
				{244,4,34,323,42,34}
				
		};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
	
		System.out.println();
		//=====================================Heterogenous type of data==============
		Object obj[] = {"Welcome", 'A', 34,4444, true, 43.5};
		
		for( Object arr: obj) {
			
			System.out.print(arr + " ");
		}
		
	}
}
