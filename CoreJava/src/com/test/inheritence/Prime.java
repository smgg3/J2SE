package com.test.inheritence;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number to find prime or not:");
		int p=scanner.nextInt();
		int count=1;
		for(int i=2;i<=p&&count<=2;i++)
		{
			if(p%i==0)
				{count++;}
		}
		if(count==2)
			System.out.println("Given number "+p+" is a prime");
		else
			System.out.println("Given number "+p+" is not a prime");
	}

}
