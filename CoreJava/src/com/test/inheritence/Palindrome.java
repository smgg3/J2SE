package com.test.inheritence;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number to check palaindrome or not:");
		int n=scanner.nextInt(),temp=n,sum=0;
		while(n!=0){
			sum=n%10+(sum*10);
			n=n/10;
			
		}
		System.out.println(sum);
		if(sum==temp)
			System.out.println("Given number is palindrome");
		else
			System.out.println("Given number is not palindrome");
		

	}

}
