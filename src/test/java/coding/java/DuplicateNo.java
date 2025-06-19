package coding.java;

public class DuplicateNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int arr[] = {2,9,3,5,4,6,7,7, 8, 9, 3, 0};
		 * 
		 * for(int i =0; i < arr.length-1; i++) {
		 * 
		 * for (int j = i+1; j < arr.length; j++) { if(arr[i] == arr[j]) {
		 * System.out.println(arr[i]); } } }
		 */
		
		String name = "seema ram seema pratibha ram seema";
		String arr[] = name.split(" ");
		int size = arr.length;
		
		for (int i = 0; i < size; i++) {
			boolean flag = false;
			for (int j = i+1; j < size; j++) {
					if(arr[i].equals(arr[j])) {
						flag = true;
						int k = j;
						while(k<size-1) {
							arr[k] = arr[k+1];
							k++;
						}
						size--;	
					}
			}
			if(flag) {
				System.out.println(arr[i]);
			}
		}
		
	}

}
