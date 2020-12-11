/*
//Binary Search: Search a sorted array by repeatedly dividing the search interval in half. 
//Begin with an interval covering the whole array. 
//If the value of the search key is less than the item in the middle of the interval, 
//narrow the interval to the lower half. Otherwise narrow it to the upper half.
//Repeatedly check until the value is found or the interval is empty.
 * 
 * The idea of binary search is to use the information that the array is sorted 
 * and reduce the time complexity to O(Log n).
 * 
 * 
 */



package java_ds_algo;

import java.util.Scanner;

public class Binary_Search_Array {
	
	
	// Returns index of x if it is present in array
    // , else return -1 
	//we have to pass first index and last index ,array and element to be searched
	static int binarySearch(int arr[], int l, int r, int x) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
  
            // If the element is present at the 
            // middle itself 
            if (arr[mid] == x) 
                return mid; 
  
            // If element is smaller than mid, then 
            // it can only be present in left sub-array 
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 
  
            // Else the element can only be present 
            // in right sub-array 
            return binarySearch(arr, mid + 1, r, x); 
        } 
  
        // We reach here when element is not present 
        // in array 
        return -1; 
    } 
	
	
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array");
		int n = sc.nextInt();
		int[] arr = new int[n];//array
		System.out.println("Enter Element to be sorted through binary Search in a new line");
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter element to be searched in a new line");
		int s = sc.nextInt();
		
		//we have to pass two pointer as we will partition array into two halves
		int result = binarySearch(arr,0,n,s);
		if((result == -1)) {
			System.out.println("Element not found");
		}
		else {
			System.out.println("Element present at index :"+result);
		}
		
	}

}
