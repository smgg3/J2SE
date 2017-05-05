package com.test.exceptions;
import java.util.*;
import java.util.Scanner;

public class Test {
	String s="a";
	public static void main(String[] args) {
		Test t=new Test();
		
		
		
		try{
			t.sayHello();
			System.out.println(t.s.toUpperCase());
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			System.out.println(n);
			}
			catch(InputMismatchException r){
				System.out.println("InputMismatchException");//example date format is different for different countries
			}

			catch(StackOverflowError e){
				System.out.println("Loop");			
				}
				catch(NullPointerException e){
					System.out.println("String s is not initialized");			
			}
			catch(Exception e){
				e.printStackTrace();
				System.out.println(e);
			}
			catch(Throwable e){
				
				System.out.println(e);
			}
		System.out.println("End program");
	}
	public void sayHello()
	{
		sayHi();
	}
	public void sayHi(){
		sayHello();
	}
}
