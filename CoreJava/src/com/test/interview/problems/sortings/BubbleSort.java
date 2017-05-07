package com.test.interview.problems.sortings;

import java.util.Scanner;

public class BubbleSort {

	void bubbleSort(int arr[]){
		
		for(int i=0;i<arr.length-1;i++){
			
			for(int j=arr.length-1;j>=i+1;j--){
				if(arr[j]<arr[j-1]){
					arr[j-1]+=arr[j];
					arr[j]=arr[j-1]-arr[j];
					arr[j-1]=arr[j-1]-arr[j];
				}
				
			}
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
		BubbleSort obj=new BubbleSort();
		//calling sorting method
		obj.bubbleSort(arr);
		//calling print method
		System.out.println("Sorted Array is:");
		obj.printArray(arr);
		System.out.println("End of the Program");

	}

}
