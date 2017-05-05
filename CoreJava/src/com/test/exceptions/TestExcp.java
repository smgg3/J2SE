package com.test.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestExcp {

	String s="a";
	public static void main(String[] args) {
		TestExcp t=new TestExcp();
//		try{
//			t.sayHello();
//			}
//			catch(ArithmeticException e){
//				e.printStackTrace();
//				System.out.println("Handled in Main Method "+e.getMessage());
//			}
//			catch(MyExceptions e){
//				System.out.println("Handled in Main Method "+e.getMessage());
//			}
		
		try{
			t.sayHi();
		}
		catch(NullPointerException e){
			System.out.println("Catch Block");
		}
		finally{
		System.out.println("End program");}
	}
	public void sayHello() throws MyExceptions
	{
		int a=10;
		int b=0;
		String s=null;
		if(s==null){
			throw new MyExceptions();
		}
		
		
		System.out.println(s.toLowerCase());
		int c=a/b;
		System.out.println("From sayHello");
	}
	public void sayHi(){
		
		System.out.println("From sayHi");
		int c=20/0;
	}
}
