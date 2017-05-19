package com.test.threads;

public class Bank implements Runnable {

	BankAccount b;
	String tran_type;
	Bank(BankAccount b,String tran_type){
		this.tran_type=tran_type;
		this.b=b;
	}
	@Override
	public void run() {
		synchronized(b){
		for(int i=0;i<3;i++){
			
			b.doTransaction(tran_type, 100);
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}}
	public static void main(String[] args) {
		BankAccount ba=new BankAccount();
		Bank b=new Bank(ba,"credit");
		Bank mobile=new Bank(ba,"debit");
		
		Thread bank=new Thread(b);
		Thread mobilebank=new Thread(mobile);
		bank.setPriority(Thread.MAX_PRIORITY);
		bank.start();
		
		mobilebank.start();

	}

}
class BankAccount{
	int bal=0;
	public void doTransaction(String tran_type,int amount){
		System.out.println("Old balance "+bal);
		if(tran_type.equalsIgnoreCase("credit")){
			bal+=amount;
			System.out.println("credited balance "+bal);
		}
		else{
			bal=bal-amount;
			System.out.println("debited balance "+bal);
		}
		System.out.println("New balance "+bal);
	}
}
