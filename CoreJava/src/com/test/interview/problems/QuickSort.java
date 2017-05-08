package com.test.interview.problems;

import java.util.Collections;

public class QuickSort {

	void sort(int arr[],int p,int r){
		if(p<r){
			int q=partition(arr,p,r);
			sort(arr,p,q-1);
			sort(arr,q+1,r);
		}
	}
	int partition(int arr[],int p,int r){
		int last=arr[r];
		int q=p-1;
		for(int j=p;j<r;j++){
			if(arr[j]<=last){
				q=q+1;
				int temp=arr[j];	//arr[j]=arr[j]+arr[q]   //a=a+b
				arr[j]=arr[q];		//arr[q]=arr[j]-arr[q]	//b=a-b
				arr[q]=temp;		//arr[j]=arr[j]-arr[q]	//a=a-b
			}
		}
		int temp=arr[r];
		arr[r]=arr[q+1];
		arr[q+1]=temp;
		return q+1;
		
	}
	 static void printArray(int arr[])
	    {
	        int n = arr.length;
	        for (int i=0; i<n; ++i)
	            System.out.print(arr[i]+" ");
	        System.out.println();
	    }
	public static void main(String[] args) {
		 int arr[] = {2,8,7,1,3,5,6,4};
	        int n = arr.length;
	 
	        QuickSort obj = new QuickSort();
	        obj.sort(arr,0,n-1);
	        obj.printArray(arr);
	}

}
