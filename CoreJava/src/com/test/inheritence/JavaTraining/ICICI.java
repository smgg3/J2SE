package com.test.inheritence.JavaTraining;

public class ICICI extends Bank {

	public static void main(String[] args) {
		ICICI i=new ICICI();
		System.out.println(i.roi);
		i.rejectOldCurrency();
		System.out.println(i.min_bal);
		System.out.println(i.loan_eli);
		

	}

}
