package com.test.codingtest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LeastNumberAfterDeletingKDigits {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number :");
		int num=s.nextInt();
		System.out.print("Enter number of ditgits to be deleted");
		int k=s.nextInt();
		int count=0;
		int [] arr={0,0,0,0,0,0,0,0,0,0};
		while(num>0){
			count++;
			arr[num%10]++;
			num=num/10;
		}
		if(k>=count)
			System.out.println("\nLeast number after deleting "+k+" digits from "+count+"is 0");
		else{
				int i=0;
				while(k>0&&i<=9)
				{
					if(arr[i]==0)
						i++;
					else{
						num=num*10+i;
						k--;
						arr[i]--;
					}
				}	
			}
		
		System.out.println("\n"+num);
	}
}
