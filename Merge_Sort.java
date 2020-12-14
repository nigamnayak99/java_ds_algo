package java_ds_algo;

import java.util.Scanner;

public class Merge_Sort {
	
	static void merge(int arr[], int l, int m, int r)
	    {
		
		int n1 = m - l +1;
		int n2 = r - m;
		//creating two temporary arrays
		int s1[] = new int[n1];
		int s2[] = new int[n2];
		
		for(int i =0;i < n1;i++) {
			s1[i] = arr[l+i];
			
		}
		
		for (int j = 0; j < n2; j++)
            s2[j] = arr[m + 1 +j ];
		
		//merging s1 and s2
		int i =0;
		int j =0;
		int k =l;
		while(i < n1 && j < n2) {
			if(s1[i] <= s2[j]) {
				arr[k]= s1[i];
				i++;
				k++;
			}
			else {
				arr[k] = s2[j];
				j++;
				k++;
			}
			
		}
		
		while(i < n1) {
			arr[k] = s1[i];
			i++;
			k++;
		}
		while(j < n2) {
			arr[k] = s2[j];
			j++;
			k++;
		}
}
	 
	    // Main function that sorts arr[l..r] using
	    // merge()
	   static void sort(int arr[], int l, int r)
	    {
	        if (l < r) {
	            // Find the middle point
	            int m = (l + r) / 2;
	 
	            // Sort first and second halves
	            sort(arr, l, m);
	            sort(arr, m + 1, r);
	 
	            // Merge the sorted halves
	            merge(arr, l, m, r);
	        }
	    }
	
	
	
	//-----print array function 
	static void printArray(int arr[]) {
		int n = arr.length;
		    	{
		    		for (int i = 0; i < n; i++)
		    			System.out.print(arr[i] + " ");
		    	}
		}
	
	//--main function

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter LEngth of araary");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elemens of array");
		for(int i =0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		
		sort(arr,0,n-1);
		printArray(arr);

	}

}
