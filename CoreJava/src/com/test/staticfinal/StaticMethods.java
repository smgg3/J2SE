package com.test.staticfinal;

public class StaticMethods {

	public static int a=40;
	int b=50;
	public static void m1(){
		StaticMethods s=new StaticMethods();
		System.out.println("m1 from static method a"+a+s.b);
		
	}
	public void m2(){
		
		System.out.println("m2 from non static method a"+a+b);
	}
	public static void main(String[] args) {
		
		m1();
		StaticMethods.m1();
		StaticMethods s=new StaticMethods();
	}

}
