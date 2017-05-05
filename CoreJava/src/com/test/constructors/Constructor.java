package com.test.constructors;

import com.test.encapsulation.Encapsulation;

public class Constructor extends Encapsulation{

	int x=10;
	public Constructor(){
		this(50);
		int x=20;
		System.out.println("Form no arg constructor"+x);
		
	}
	
	public Constructor(int x){
		
		System.out.println("Form arg constructor"+x);
		System.out.println("Form after this arg constructor before change"+this.x);
		this.x=x;
		System.out.println("Form after this arg constructor"+this.x);
		
	}
	public static void main(String[] args) {
		
		Constructor c=new Constructor();
		Constructor c1=new Constructor(30);
	}

}
