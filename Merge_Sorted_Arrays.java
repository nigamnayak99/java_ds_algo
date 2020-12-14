package java_ds_algo;

import java.util.Scanner;

public class Merge_Sorted_Arrays {
	
	public static int[] mergeArrays(int[] arr1, int[] arr2, int n1, 
            int n2, int[] arr3) 
{ 
int i = 0, j = 0, k = 0; 

// Traverse both array 
while (i<n1 && j <n2) 
{ 
// Check if current element of first 
// array is smaller than current element 
// of second array. If yes, store first 
// array element and increment first array 
// index. Otherwise do same with second array 
if (arr1[i] < arr2[j]) {
arr3[k] = arr1[i]; 
i = i+1;
k = k+1;
}
else
arr3[k] = arr2[j]; 
k = k+1;
j = j+1;
} 

// Store remaining elements of first array 
while (i < n1) 
arr3[k] = arr1[i]; 
i = i+1;
k = k+1;

// Store remaining elements of second array 
while (j < n2) {
arr3[k] = arr2[j]; 
k = k+1;
j = j+1;
}
return arr3;

} 
	 

	
	
	static void printArray(int arr[]) {
	int n = arr.length;
	    	{
	    		for (int i = 0; i < n; i++)
	    			System.out.print(arr[i] + " ");
	    	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length of 1st array");
		int n1 = sc.nextInt();
		int[] arr1 = new int[n1];//array
		
		System.out.println("Enter length of 2nd array");
		int n2 = sc.nextInt();
		int[] arr2 = new int[n2];//array
		
		System.out.println("Enter Elements to bsorted in 1st arry");
		for(int i = 0;i < n1;i++) {
			arr1[i] = sc.nextInt();
		}
		
		
		System.out.println("Enter Elements to bsorted in 2nd arry");
		for(int i = 0;i < n2;i++) {
			arr2[i] = sc.nextInt();
		}
		int[] arr = new int[n1 + n2];
		int ans[] =mergeArrays(arr1,arr2,n1,n2,arr);
		printArray(ans);

	}

}
