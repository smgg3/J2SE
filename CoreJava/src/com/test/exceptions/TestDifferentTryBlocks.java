package com.test.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestDifferentTryBlocks {

	private String s;
	private TestDifferentTryBlocks(){}
	public static void hello(){
		System.out.println("Hello");
	}
	public static int hi(){
		
		
		try{
			//int c=10/0;
			//System.out.println(c);
			return 1;
		}
		catch(Exception e){
			System.out.print(e);
			return 0;
		}
		finally{
			hello();
			System.out.println("From finally");
			
		}
	}

	public static void main(String[] args) {
		
		TestDifferentTryBlocks t=new TestDifferentTryBlocks();
		hi();
//		try{
//			t.s.toUpperCase();
//			}
//			catch(NullPointerException e){
//				System.out.println("String s is not initialized");
//			}
//			
//			Scanner scan=new Scanner(System.in);
//			try{
//			int n=scan.nextInt();}
//			catch(InputMismatchException r){
//				System.out.println("InputMismatchException");//example date format is different for different countries
//			}

	}

}
