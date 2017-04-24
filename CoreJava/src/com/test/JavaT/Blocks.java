package com.test.JavaT;

public class Blocks {
	int i=2;
	Blocks(){
			System.out.println("From Constructor");
	}
	static {
		
		System.out.println("From static block");
	}
	{
		
		System.out.println("From instance block1");
	}
	public static void main(String[] args) {
		
		System.out.println(new Blocks().i);
		System.out.println(new Blocks().i);

	}
	{
		System.out.println("From instance block2");
	}
}
