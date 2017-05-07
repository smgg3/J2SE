//insertion sort is best if n is small and time complexity is O(n^2)
package com.test.interview.problems.sortings;
import java.util.Scanner;
public class InsertionSort {
		//method to do insertion sort
		void insertionSort(int arr[]){
			int key;
			for(int i=1;i<arr.length;i++){
				key=arr[i];
				int j=i-1;
				//find out the position for ith element and inserts that into its position in the array
				while(j>=0&&arr[j]>key){
			//	while(j>=0&&arr[j]<key){	//for nondecreasing form
					arr[j+1]=arr[j];
					j=j-1;
				}
				arr[j+1]=key;
				
			}
		}
		//method to print the elements in an array
		void printArray(int arr[]){
			System.out.print("[");
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]+" ");
			}
			System.out.println("]");
		}
		//Driver method
		public static void main(String[] args){
			Scanner s=new Scanner(System.in);
			System.out.print("Enter the size of the input array");
			int[] arr=new int[s.nextInt()];
			System.out.println("Enter input array");
			for(int i=0;i<arr.length;i++){
				System.out.print("Enter "+(i+1)+" element:");
				arr[i]=s.nextInt();
			}
			InsertionSort obj=new InsertionSort();
			//calling sorting method
			obj.insertionSort(arr);
			//calling print method
			System.out.println("Sorted Array is:");
			obj.printArray(arr);
			System.out.println("End of the Program");
			
			
		}
}
