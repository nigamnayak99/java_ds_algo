/*
 * arr[] = 64 25 12 22 11

// Find the minimum element in arr[0...4]
// and place it at beginning
11 25 12 22 64

// Find the minimum element in arr[1...4]
// and place it at beginning of arr[1...4]
11 12 25 22 64
// Find the minimum element in arr[2...4]
// and place it at beginning of arr[2...4]
11 12 22 25 64

// Find the minimum element in arr[3...4]
// and place it at beginning
 * 
 * of arr[3...4]
 * 
 * 11 12 22 25 64 
 * 
 * 
 * time complexity o(n2)
*/




package java_ds_algo;

import java.util.Scanner;

public class Selection_Sort_Array {
	
	
	public static int[] selectionSort(int[]  arr){
		
		for(int i =0;i < arr.length;i++) {
			int min_index = i;
			for(int j = i;j < arr.length;j++) {
				if(arr[j] < arr[min_index]) {
					min_index = j;
				}
			}
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i]=temp;
		}
		
		return arr;
	}
	
	
	 static void printArray(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i=0; i<n; ++i) 
	            System.out.print(arr[i]+" "); 
	        System.out.println(); 
	    } 
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array");
		int n = sc.nextInt();
		int[] arr = new int[n];//array
		System.out.println("Enter Elements to be sorted");
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		if(arr.length == 1) {
			System.out.print("No need for sorting");
		}
		
		int ans[] = selectionSort(arr);
		printArray(ans);
		
		

	}

}
