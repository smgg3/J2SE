package com.test.threads;

public class SunchronizedMultiThreads {
	int bal=0;
	public int getBalance(){
		Thread t1=new Thread(new Runnable(){

			@Override
			public void run() {
				for(int i=0;i<10000;i++){
					add();
				}
				
			}
			
		});
		Thread t2=new Thread(new Runnable(){

			@Override
			public void run() {
				for(int i=0;i<10000;i++){
					subtract();
				}
				
			}
			
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return bal;
	}
	public synchronized void add(){
		bal++;
	}
	public synchronized void subtract(){
		bal--;
	}
	public static void main(String[] args) {
		SunchronizedMultiThreads obj=new SunchronizedMultiThreads();
		System.out.println(obj.getBalance());

	}

}
