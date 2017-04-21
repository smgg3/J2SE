package com.test.inheritence;
import java.util.Scanner;
public class SwitchOperator {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.print("Enter month:");
		int mon=scanner.nextInt();
		System.out.print("Enter year:");
		int year=scanner.nextInt();
		
		switch(mon){
		case 1:case 3:case 5:case 7: case 8:case 10:case 12:
			System.out.println("No.of days in "+year+" "+mon+"th month are 31 days");break;
		case 4:case 6: case 9: case 11:
			System.out.println("No.of days in "+year+" "+mon+"th month are 30 days");break;
		case 2:
			if((year%4==0&&year%100!=0)||(year%400==0))
			{			System.out.println("No.of days in "+year+" "+mon+"th month are 29 days");}
			else
				System.out.println("No.of days in "+year+" "+mon+"th month are 28 days");
			break; 
					
		}

	}

}
