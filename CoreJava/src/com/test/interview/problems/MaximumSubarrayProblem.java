package com.test.interview.problems;

import java.util.Random;
import java.util.Scanner;

public class MaximumSubarrayProblem {

	int maxSubArray(int[] A) {
		int max = A[0];
		int[] sum = new int[A.length];
		sum[0] = A[0];
 
		for (int i = 1; i < A.length; i++) {
			sum[i] = Math.max(A[i], sum[i - 1] + A[i]);
			max = Math.max(max, sum[i]);
		}
 
		return max;
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
		MaximumSubarrayProblem obj=new MaximumSubarrayProblem();
		int sum=obj.maxSubArray(arr);
		System.out.println(sum);
		
	}

}
