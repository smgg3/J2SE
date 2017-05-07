package com.test.interview.problems.sortings;

import java.util.Scanner;

public class SelectionSort {

	void selectionSort(int arr[]){
		
		for(int i=0;i<arr.length-1;i++){
			int j=i+1,min=i;
			while(j<arr.length){
				if(arr[min]>arr[j]){
					min=j;
				}
				j=j+1;
			}
			
			arr[i]+=arr[min];
			arr[min]=arr[i]-arr[min];
			arr[i]=arr[i]-arr[min];
		}
	}
	void printArray(int arr[]){
		System.out.print("[");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("]");
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of the input array");
		int[] arr=new int[s.nextInt()];
		System.out.println("Enter input array");
		for(int i=0;i<arr.length;i++){
			System.out.print("Enter "+(i+1)+" element:");
			arr[i]=s.nextInt();
		}
		SelectionSort obj=new SelectionSort();
		//calling sorting method
		obj.selectionSort(arr);
		//calling print method
		System.out.println("Sorted Array is:");
		obj.printArray(arr);
		System.out.println("End of the Program");

	}

}
