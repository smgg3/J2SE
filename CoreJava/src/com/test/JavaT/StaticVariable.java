package com.test.JavaT;

public class StaticVariable {
	static int a=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12;
		System.out.println(a);//local variable
		System.out.println(StaticVariable.a);//class level variable
	}

}
