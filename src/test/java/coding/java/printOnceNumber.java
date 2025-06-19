package coding.java;

public class printOnceNumber {
	    public static void main(String[] args) {
	        int[] arr = {1,2,2,3,3,4,1,2,5,5,6,6,7,8,2,2};
	        int size = arr.length;
	        for(int i=0; i<size; i++) {
	        	 boolean occur = false;
	        	
	            for(int j=i+1; j<size; j++) {
	           
	            	if(arr[i] ==arr[j]) {
	            		occur = true;
	                    int k=j;
	                    while(k<size-1) { //for shifting one value
	                        arr[k] = arr[k+1];
	                        k++;
	                    }
	                    size--;   
	         
	                }
	            }
	            if(occur) {
	            	System.out.print(arr[i]+" "); //find only duplicate 
	            }
	           
	        }
	        
	        System.out.println();
	        for (int i = 0; i < size; i++) {   //find only once occurence
				System.out.print(arr[i]+" ");
			}
	        System.out.println("\n size => " +size);
	    }
	}