package com.test.exceptions;

public class MyExceptions extends Exception {


	public MyExceptions(String message) {
		super(message);
		
	}
	public MyExceptions() {
		super();
		
	}

	@Override
	public String getMessage() {
		
		return "Handling Myesception:Error while calling";
	}
	public static void main(String[] args) {
		

	}
	



}
