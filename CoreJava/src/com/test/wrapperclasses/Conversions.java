package com.test.wrapperclasses;

public class Conversions {

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
		
		//int to String/Integer
		i=40;
		s=""+i;
		System.out.println(s);
		a=i;
		
		//Integer to int/String
		a=50;
		s=""+a;
		s=a.toString();
		i=a;
		i=a.intValue();
		

	}

}
