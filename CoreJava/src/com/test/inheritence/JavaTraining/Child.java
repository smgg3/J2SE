package com.test.inheritence.JavaTraining;

public class Child extends Parent{

	 Child(){
		System.out.println("From Child Bank constructor");
	}
	static{
		
		System.out.println("From Child Bank static block");
	}
	{
		
		System.out.println("From Child Bank non static block");
	}
	public static void main(String[] args) {
		
		Child b= new Child();
		b.rejectOldCurrency();
		System.out.println(b.roi);
		applyTax();

	}

}
