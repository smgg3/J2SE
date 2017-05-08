package com.test.interview.problems;

public class CountingSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A={2,5,3,1,0,3,0,10};
		int [] B=new int[A.length];
		int k=A[0];
		for(int i=1;i<A.length;i++){
			if(A[i]>k)
				k=A[i];
		}
		
		int[] C=new int[k+1];
		for(int i=1;i<=k;i++)
			C[i]=0;
		for(int i=0;i<A.length;i++){
			C[A[i]]++;
			}
		for(int i=1;i<=k;i++) 
			C[i]+=C[i-1];
		for(int i=A.length-1;i>=0;i--){
			B[C[A[i]]-1]=A[i];
			C[A[i]]--;
		}
		for(int i=0;i<A.length;i++)
			System.out.print(B[i]+" ");
			
	}

}
