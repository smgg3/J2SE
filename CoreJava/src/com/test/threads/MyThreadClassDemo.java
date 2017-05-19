package com.test.threads;

public class MyThreadClassDemo {

	public static void main(String[] args) {
		MyThreadClass obj=new MyThreadClass();
		MyThreadClass obj1=new MyThreadClass();
		obj.start();
		obj.setName("MyThread 1 ");
		obj.setPriority(Thread.MIN_PRIORITY);
		//obj.setDaemon(true);
		//obj.yield();
		obj1.start();
		obj1.setPriority(Thread.MAX_PRIORITY);
//		try {
//			obj.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
