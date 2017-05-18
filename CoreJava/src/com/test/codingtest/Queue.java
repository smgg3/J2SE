package com.test.codingtest;

public class Queue {
	private QNode head;
	private QNode tail;
	private int n;
	
	public void enqueue(int data){
		if(n==0){
			head=tail=new QNode(data);
			n++;
		}
		else{
		QNode old=tail;
		tail=new QNode(data);
		tail.next=null;
		old.next=tail;
		n++;		
		}			
	}
	public int dequeue(){
		if(head==null){
			System.out.println("Queue Empty");
			return 0;
		}
		else
		{int data=head.data;
		head=head.next;
		n--;
		return data;
		}
	}
	public void printQueue(){
		while(head!=null)
		{
			System.out.print(dequeue()+" ");
			
		}
	} 
	
	
	
	
	
	
	public static void main(String[] args) {
		Queue Q=new Queue();
		Q.enqueue(10);
		Q.enqueue(11);
		Q.enqueue(12);
		Q.enqueue(13);
		Q.printQueue();
		Q.printQueue();

	}

}
class QNode{
	int data;
	
	QNode next;
	public QNode(int data){
		this.data=data;
		
		
	}
	
}