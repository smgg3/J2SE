package com.test.inheritence.JavaTraining;

public class Bank extends RBI{

	 int min_bal=50000;
	 String loan_eli="employeed";
	public static void main(String[] args) {
		
		Bank b= new Bank();
		b.rejectOldCurrency();
		System.out.println(b.roi);
		applyTax();

	}

}
