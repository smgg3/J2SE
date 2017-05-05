package com.test.inheritence.JavaTraining;

public class SBI extends Bank {

	public static void main(String[] args) {
		SBI i=new SBI();
		System.out.println(i.roi);
		i.rejectOldCurrency();
		System.out.println(i.min_bal);
		System.out.println(i.loan_eli);

	}

}
