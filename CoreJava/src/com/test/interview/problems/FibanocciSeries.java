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
