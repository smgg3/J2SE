package com.test.Interface;

public interface Vehicle {
	public abstract void move();				//methods are public abstract
	int a=5;									//all the variables are static final by default
	public static void main(String[] args) {
		
		System.out.println("Hi"+a);
		
	}

}
