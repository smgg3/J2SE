package com.test.wrapperclasses;

public class WrapperClasses {

	public static void main(String[] args) {
		int i=10;
		Integer a=new Integer(20);
		
		//String to int/Integer
		String s="100";
		a=new Integer(s);
		System.out.println(a);
		System.out.println(i);
		System.out.println(s);
		i=Integer.parseInt(s);
		System.out.println(i);

	}

}
