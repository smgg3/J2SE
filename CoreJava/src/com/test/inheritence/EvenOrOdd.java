package com.test.inheritence;
import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number to find Even or Odd:");
		int n=scanner.nextInt();
		boolean isOdd=(n>0&&n%2==1)?true:false;
		if(isOdd)
			System.out.println("Given number is odd number");
		else if(n>=0)
			System.out.println("Given number is even number");
		else
			System.out.println("Given number is negative number");
	}

}
