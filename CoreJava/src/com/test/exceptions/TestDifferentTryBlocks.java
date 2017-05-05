package com.test.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestDifferentTryBlocks {

	private String s;

	public static void main(String[] args) {
		
		TestDifferentTryBlocks t=new TestDifferentTryBlocks();
		try{
			t.s.toUpperCase();
			}
			catch(NullPointerException e){
				System.out.println("String s is not initialized");
			}
			
			Scanner scan=new Scanner(System.in);
			try{
			int n=scan.nextInt();}
			catch(InputMismatchException r){
				System.out.println("InputMismatchException");//example date format is different for different countries
			}

	}

}
