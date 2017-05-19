package com.test.threads;

public class MyThreadClass extends Thread{

	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Thread Name: "+Thread.currentThread().getName()+" value "+i+"  Priority  "+Thread.currentThread().getPriority()+" ID "+Thread.currentThread().getId());
		}
		try{
		Thread.sleep(10000);	
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	

}
