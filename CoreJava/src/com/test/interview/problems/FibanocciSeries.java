package com.test.interview.problems;

import java.util.Scanner;

public class FibanocciSeries {

	void fibonacciSeries(int arr[]){
		
		for(int i=2;i<arr.length;i++){
			arr[i]=arr[i-1]+arr[i-2];
		}
		
	}
	void printSeries(int arr[]){
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"  ");
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of the input array");
		int[] arr=new int[s.nextInt()];
		FibanocciSeries obj=new FibanocciSeries();
		switch(arr.length){
			case 0:break;
			case 1:
			{
				arr[0]=0;
				break;
			}
			case 2:{
				arr[0]=0;
				arr[1]=1;
				break;
			}
		default:{
			arr[0]=0;
			arr[1]=1;
			obj.fibonacciSeries(arr);
			}
		}
		obj.printSeries(arr);

	}

}
//http://www.geeksforgeeks.org/program-for-nth-fibonacci-number/
//Below is one more interesting recurrence formula that can be used to find n’th Fibonacci Number in O(Log n) time.
//
//If n is even then k = n/2:
//F(n) = [2*F(k-1) + F(k)]*F(k)
//
//If n is odd then k = (n + 1)/2
//F(n) = F(k)*F(k) + F(k-1)*F(k-1)
//How does this formula work?
//The formula can be derived from above matrix equation.
//fibonaccimatrix
//
//Taking determinant on both sides, we get
//(-1)n = Fn+1Fn-1 – Fn2
//Moreover, since AnAm = An+m for any square matrix A, the following identities can be derived (they are obtained form two different coefficients of the matrix product)
//
//FmFn + Fm-1Fn-1 = Fm+n-1
//
//By putting n = n+1,
//
//FmFn+1 + Fm-1Fn = Fm+n
//
//Putting m = n
//
//F2n-1 = Fn2 + Fn-12
//
//F2n = (Fn-1 + Fn+1)Fn = (2Fn-1 + Fn)Fn (Source: Wiki)
//
//To get the formula to be proved, we simply need to do following
//If n is even, we can put k = n/2
//If n is odd, we can put k = (n+1)/2
//
//Below is C++ implementation of above idea.
//
//// C++ Program to find n'th fibonacci Number in
//// with O(Log n) arithmatic operations
//#include <bits/stdc++.h>
//using namespace std;
// 
//const int MAX = 1000;
// 
//// Create an array for memoization
//int f[MAX] = {0};
// 
//// Returns n'th fuibonacci number using table f[]
//int fib(int n)
//{
//    // Base cases
//    if (n == 0)
//        return 0;
//    if (n == 1 || n == 2)
//        return (f[n] = 1);
// 
//    // If fib(n) is already computed
//    if (f[n])
//        return f[n];
// 
//    int k = (n & 1)? (n+1)/2 : n/2;
// 
//    // Applyting above formula [Note value n&1 is 1
//    // if n is odd, else 0.
//    f[n] = (n & 1)? (fib(k)*fib(k) + fib(k-1)*fib(k-1))
//           : (2*fib(k-1) + fib(k))*fib(k);
// 
//    return f[n];
//}
// 
///* Driver program to test above function */
//int main()
//{
//    int n = 9;
//    printf("%d ", fib(n));
//    return 0;
//}