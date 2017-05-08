package com.test.algorithmsndatastructures.problems;

public class BinarySearchOfRotatedArray {

	public static int search(int a[], int l, int u, int x) {
		 while (l <= u) {
		 int m = (l + u) / 2;
		 if (x == a[m]) {
		 return m;
		 } else if (a[l] <= a[m]) {
		 if (x > a[m]) {
		 l = m+1;
		} else if (x >=a [l]) {
		 u = m-1;
		 } else {
		 l = m+1;
		 }
		 }
		 else if (x < a[m]) u = m-1;
		 else if (x <= a[u]) l = m+1;
		 else u = m - 1;
		 }
		 return -1;
		 }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={3,4,5,1,2,3};
		int x=2;
		System.out.println(search(a, 0, a.length - 1, x));
		
	}

}
