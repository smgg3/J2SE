package com.test.algorithmsndatastructures.problems;

public class MergeTwoSortedArrays {

	public static void merge(int[] a, int[] b, int n, int m) {
		 int k = m + n - 1; // Index of last location of array b
		 int i = n - 1; // Index of last element in array b
		 int j = m - 1; // Index of last element in array a
		
		 // Start comparing from the last element and merge a and b
		 while (i >= 0 && j >= 0) {
		 if (a[i] > b[j]) {
		 a[k--] = a[i--];
		 } else {
		 a[k--] = b[j--];
		 }
		 }
		 while (j >= 0) {
		 a[k--] = b[j--];
		 }
		 }
	public static void main(String[] args) {
		int [] a=new int[10];
		int [] b={1,3,5};
		a[0]=0;
		a[1]=2;
		a[2]=4;
		merge(a,b,3,3);
		for(int i=0;i<6;i++)
		{System.out.print(a[i]+" ");}
		

	}

}
