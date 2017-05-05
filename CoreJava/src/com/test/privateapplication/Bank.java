package com.test.privateapplication;

 class Bank {
private Bank()
	 {
		 System.out.println("From private constructor");
	 }
	 private float roi=7.8f;
	 private void rejectOldCurrency(){
		 System.out.println("Reject Old 500&1000 Currency");
	 }
	public static void main(String[] args) {
		
		Bank b=new Bank();
		b.rejectOldCurrency();
		System.out.println(b.roi);
	}

}
