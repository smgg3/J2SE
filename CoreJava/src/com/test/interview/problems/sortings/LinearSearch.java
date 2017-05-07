package com.test.interview.problems.sortings;

public class LinearSearch {
	
	int linearSearch(int arr[],int val){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==val)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr={3,2,7,1,9,0};
		int val=0;
		LinearSearch obj=new LinearSearch();
		int i;
		if((i=obj.linearSearch(arr, val))==-1){
			System.out.println("There is no val like "+val+"in the array");
		}
		else
			System.out.println(i);

	}

}
