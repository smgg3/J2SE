package com.test.interview.problems;

import java.util.ArrayList;

public class HeapSort {

	void heapSort(int arr[]){
		int n=arr.length;
		for(int i=n/2-1;i>=0;i--){
			maxHeapify(arr,n,i);
		}
		for(int i=n-1;i>=1;i--){
			
			int temp=arr[0];
			arr[0]=arr[i];
			arr[i]=temp;
			
			maxHeapify(arr,i,0);
		}
	}
	void maxHeapify(int arr[],int n,int i){
		int largest =i;
		int l=2*i+1;
		int r=2*i+2;
		if((l<n && arr[l]>arr[largest]))
			largest=l;
		if((r<n && arr[r]>arr[largest]))
			largest=r;
		if(largest!=i){
			int temp=arr[largest];
			arr[largest]=arr[i];
			arr[i]=temp;
			maxHeapify(arr,n,largest);
		}
	}
	
	
	
	void printArray(int[] arr){
		System.out.print("[");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("]");
	}
	public static void main(String[] args) {
		int [] arr={4,1,3,2,16,9,10,14,8,7};
		HeapSort obj=new HeapSort();
		obj.heapSort(arr);
		obj.printArray(arr);
		

	}

}
