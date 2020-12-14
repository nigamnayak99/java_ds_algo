
/*Bubble Sort is the simplest sorting algorithm
 * that works by repeatedly swapping the adjacent elements 
 * if they are in wrong order.
 * 
 * O(n2)*/


package java_ds_algo;

import java.util.Scanner;

public class Bubble_Sort {
	
	
	public static int[] bubbleSort(int[] arr) {
		
		 int n = arr.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (arr[j] > arr[j+1])
	                {
	                    // swap temp and arr[i]
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
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
		
		int ans[] = bubbleSort(arr);
		printArray(ans);

	}

}
