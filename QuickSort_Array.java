package java_ds_algo;

import java.util.Scanner;

public class QuickSort_Array {

	static void quickSort(int[] arr, int low,int high) {
		int mid =( low + high)/2;
		int i = low;
		int j = high;
		int pivot = arr[mid];
		while(i <= j) {
		while(arr[i] < arr[pivot]) {
			i++;
		}
		while(arr[j] > arr[pivot]) {
			j--;
		}
		while(i <= j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
			}
		}
		if( low < j) {
		quickSort(arr,low,j);
		}
		if(high > i) {
		quickSort(arr,i,high);
		}

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
		System.out.println("Enter LEngth of araary");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elemens of array");
		for(int i =0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		quickSort(arr,0,n-1);
		printArray(arr);
	}

}
