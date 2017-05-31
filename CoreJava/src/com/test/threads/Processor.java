package com.test.threads;

import java.util.LinkedList;
import java.util.Random;

public class Processor {
		private LinkedList<Integer> list = new LinkedList<Integer>();
		private final int LIMIT=10;
		private Object lock =new Object();
		public void produce() throws InterruptedException{
			int val=0;
			while(true){
				synchronized(lock){
					while(list.size()==LIMIT){
						lock.wait();
					}
				list.add(val++);
				System.out.println("add "+val);
				lock.notify();
				}
			}
		}
	public void consume() throws InterruptedException{
		Random random=new Random();
		while(true){
			synchronized(lock){
				while(list.size()==0){
					lock.wait();
				}
			System.out.println("List size is : "+list.size());
			int val=list.removeFirst();
			System.out.println("Value is : "+val);
			lock.notify();
			}
			Thread.sleep(random.nextInt(5000));
		}
	}
	
}
