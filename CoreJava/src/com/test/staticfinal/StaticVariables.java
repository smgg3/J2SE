package com.test.staticfinal;

public class StaticVariables {

	static int a=20;
	int b=40;
	public static void main(String[] args) {
		StaticVariables s1=new StaticVariables();
		StaticVariables s2=new StaticVariables();
		
		System.out.println("s1.."+s1.a);
		System.out.println("s2.."+s2.a);
		s1.a=50;
		System.out.println("s1.."+s1.a);
		System.out.println("s2.."+s2.a);
		System.out.println("s1.."+s1.b);
		System.out.println("s2.."+s2.b);
		s1.b=70;
		s2.b=60;
		s1.a=110;
		s2.a=100;
		System.out.println("s1.."+s1.a);
		System.out.println("s2.."+s2.a);
		System.out.println("s1.."+s1.b);
		System.out.println("s2.."+s2.b);

	}

}
