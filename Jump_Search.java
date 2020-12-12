/*
 * Array must be sorted
 * time complexity:O(sqrt(n))
 * space complexity O(1)
 * first jump is performed then linear search,
 * */




package java_ds_algo;

import java.util.Scanner;
import java.lang.Math;

public class Jump_Search {
	//this is leanear search returns position
	public static int linearSearch(int[] arr,int r,int s,int x) {
		int pos = 0;
		for(int i = s;i<i+s;i++) {
			if(arr[i] == x) {
				pos = i;
				break;
			}
		}
		return pos+1;
		
	}
	
	//jump search is performed to know range
	public static int jumpSearch(int[] arr ,int n,int s,int x) {
		int pos = -1;
		for(int i =0;i < n;i= i+s) {
			if(arr[i] > x) {
				pos = i;
				break;
			}
		}
		return pos;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array");
		int n = sc.nextInt();
		int[] arr = new int[n];//array
		System.out.println("Enter Element to be sorted through Jump Search in a new line");
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter element to be searched in a new line");
		int x = sc.nextInt();
		int s = (int)Math.floor(Math.sqrt(n));
		int r = jumpSearch(arr,n,x,s);
		if(r != -1) {
			System.out.println("position is :"+linearSearch(arr,r,s,x));
		}
		else {
			System.out.println("Number is not in array");
		}
		
		
		

	}

}
