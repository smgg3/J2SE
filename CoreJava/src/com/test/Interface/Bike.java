package com.test.Interface;

public class Bike implements Vehicle {
	
	final int tyres=2;
	String make;
	String engine_type;
	public void move(){
		System.out.println("Bike is moving");
	}
	public void moveForward(){
		System.out.println("Move Forward");
	}
	
	public static void main(String[] args) {
	

	}

}
