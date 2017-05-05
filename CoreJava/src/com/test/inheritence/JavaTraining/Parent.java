package com.test.inheritence.JavaTraining;

public class Parent {
	float roi=7.8f;
	Parent(){
		System.out.println("From Parent RBI constructor");
	}
	static{
		
		System.out.println("From Parent RBI static block");
	}
	{
		
		System.out.println("From Parent RBI non static block");
	}

	public  void rejectOldCurrency()
	{
		System.out.println("Reject old 500&1000 notes");
		
		System.out.println(roi);
	}
	public static  void applyTax()
	{
		System.out.println("Apply tax for more than 50000 transaction");
		
		//System.out.println(roi);we cant call
	}
}

