package com.test.inheritence;
import java.util.Scanner;
public class Fibanocci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of fibanocci numbers you want:");
		int n=scanner.nextInt();
		int count=2,a=1,b=1;
		System.out.print(a+","+b);
		do{
			b=b+a;
			a=b-a;
			System.out.print(","+b);
			count++;
		}while(count<n);
		
	}

}
