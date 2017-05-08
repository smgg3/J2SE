package com.test.algorithmsndatastructures.problems;

public class ArraySortedRowColumnFindElement {

	static boolean FindElem(int[][] mat, int elem, int M, int N) {
		 int row = 0;
		 int col = N-1;
		 while (row < M && col >= 0) {
		 if (mat[row][col] == elem) {
		 return true;
		 } else if (mat[row][col] > elem) {
		 col--;
		 } else {
		 row++;
		 }
		 }
		 return false;
		 }
	public static void main(String[] args) {
		
		int [][] a={{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(FindElem(a,5,3,3));
				
	}

}
