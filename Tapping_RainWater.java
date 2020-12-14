/*Given an array arr[] of N non-negative integers
 *  representing the height of blocks.
 *  If width of each block is 1, 
 * compute how much water can be trapped between 
 * the blocks during the rainy season. */



package java_ds_algo;
import java.util.*;

import java.util.Scanner;

public class Tapping_RainWater {
	
	
	public static int trappedWater(int[] arr, int n) {
		int left = 0;
		int right = n - 1 ;
		int total = 0;
		for(int i =0;i < n-1 ;i++) {
			int max_Left = arr[i];
			for(int j = 0;j < i;j++) {
				max_Left = Math.max(arr[j], max_Left);
			}
			int max_Right = arr[i];
			for(int j = i+1;j < n;j++) {
				max_Right = Math.max(arr[j], max_Right);
			}
			
			total = total + Math.min(max_Left, max_Right) - arr[i];
			
		}
	
		return total;
}
		
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array Size");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter Elements arry");
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int ans = trappedWater(arr,n);
		System.out.println("Trapped water units :"+ans);

	}

}
