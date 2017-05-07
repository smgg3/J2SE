package com.test.interview.problems.sortings;

import java.util.Scanner;

public class MergeSort {

	void mergeSort(int arr[],int lr[],int p,int r){
		
		if(p<r){
			int q=(p+r)/2;
			mergeSort(arr,lr,p,q);
			mergeSort(arr,lr,q+1,r);
			merge(arr,lr,p,q,r);
		}
		
	}
	
	
	void merge(int arr[],int lr[],int p,int q,int r){
		
		
		for(int i=p;i<=r;i++){
			lr[i]=arr[i];
		}
		int tleft=p;
		int tright=q+1;
		int cur=p;
		
		while(tleft<=q&&tright<=r){
			if(lr[tleft]<=lr[tright]){
				arr[cur]=lr[tleft];
				tleft++;
			}
			else{
				arr[cur]=lr[tright];
				tright++;
			}
			cur++;
		}
		int rem=q-tleft;
		for(int i=0;i<=rem;i++)
			arr[cur+i]=lr[tleft+i];
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
		MergeSort obj=new MergeSort();
		//calling sorting method
		int[] lr=new int[arr.length];
		
		obj.mergeSort(arr,lr,0,arr.length-1);
		//calling print method
		System.out.println("Sorted Array is:");
		obj.printArray(arr);
		System.out.println("End of the Program");

	}

}
