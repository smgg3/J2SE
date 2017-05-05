package com.test.inheritence;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		do{
		System.out.println("Welcome to calculator");
		System.out.print("Enter 1 for Scientific Calculator\nEnter 2 for Regular Calculator\n");
		int c=s.nextInt();
		System.out.print("Enter 1 for Sum\n2 for Difference\n3 for Product\n4 for Square\n5 for Cube\n");
		int choice=s.nextInt();
		float a=0,b=0;
		if(choice>=1 && choice<=5){
			System.out.print("Enter first value:");
			a=s.nextFloat();
			if(choice<4){
				System.out.print("Enter Second value:");
				b=s.nextFloat();
			}
		}
		
		switch(choice)
		{
		case 1:case 2:case 3:
			RegularCalculator rc=new RegularCalculator();
			switch(choice)
			{
				case 1:
				{
					System.out.println("Sum is"+rc.sum(a, b));
					break;
					}
				case 2:
				{
					System.out.println("Difference is"+rc.dif(a, b));
					break;
					}
				case 3:
				{
					System.out.println("Product is"+rc.product(a, b));
					break;
					}
			}
			break;
		case 4: case 5:
			ScientificCalculator sc=new ScientificCalculator();
			switch(choice)
			{
				case 4:
				{
					System.out.println("Square is"+sc.square(a));
					break;
					}
				case 5:
				{
					System.out.println("Cube is"+sc.cube(a));
					break;
					}
			}
			break;
			default:
				System.out.println("Wrong choice");
			
		
			
		}
		System.out.println("Enter 3 to exit else any number");
		}while(s.nextInt()!=3);
		s.close();
		
		System.out.println("Thank you for using Calculator");
		
		

	}

}
