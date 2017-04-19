package com.test.inheritence;
import java.util.Scanner;
public class PrimesList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number to find primes list :");
		int p=scanner.nextInt();
		for(int j=1;j<=p;j++){
			int count=1;
			for(int i=2;i<=j&&count<=2;i++)
			{
				if(j%i==0)
					{count++;}
			}
			if(count==2)
				System.out.print(j+", ");
		}
	}

}
