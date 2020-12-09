package java_ds_algo;
import java.io.*;

import java.util.Scanner;

public class Move_negative_number_to_one_Side {
	static void rearrange(int arr[], int n)
    {
        int j = 0, temp;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
 
    // A utility function to print an array
    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter size of array");
    	int n = sc.nextInt();
    	System.out.println();
    	System.out.println("Enter an array with negative numbers");
    	int arr[] = new int[n];
    	System.out.println();
    	for(int i =0;i < n;i++) {
    		arr[i] = sc.nextInt();
    	}
        rearrange(arr, n);
        printArray(arr, n);
    }
}
