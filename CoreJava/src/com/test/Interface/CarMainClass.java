package com.test.Interface;

public class CarMainClass {

	public static void main(String[] args) {
		Car honda=new Car();
		honda.make="Honda";
		honda.engine_type="Diesel";
		
		Car tesla=new Car();
		tesla.make="Tesla";
		tesla.engine_type="Battery";
		honda.moveForward();
		tesla.moveForward();
		
		Bike b=new Bike();
		b.move();
		
		Vehicle v=new Bike();
		v.move();
		
		v=new Car();
		v.move();
		
		//v.moveForward();//we cant call because only the methods which are common for class and interface only we can call because we created it with Vehicle type
}}