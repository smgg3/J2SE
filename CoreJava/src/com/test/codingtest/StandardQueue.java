
package com.test.codingtest;

public class StandardQueue {
	private QNode1 head;
	private QNode1 tail;
	private int n;
	public StandardQueue(){
		head=null;
		tail=null;
		n=0;	
	}
	public boolean isEmpty(){
		return head==null;
	}
	public void enqueue(int data){
		QNode1 old=tail;
		tail=new QNode1(data);
		tail.next=null;
		if(isEmpty())
		{
			head=tail;
					}
		else
			old.next=tail;
		n++;
				
	}
	public void printQueue(){
		while(head!=null)
		{
			System.out.print(head.data);
			head=head.next;
			n--;
		}
	} 
	
	
	
	
	
	
	public static void main(String[] args) {
		StandardQueue Q=new StandardQueue();
		Q.enqueue(10);
		Q.enqueue(11);
		Q.enqueue(12);
		Q.enqueue(13);
		Q.printQueue();

	}

}
class QNode1{
	int data;
	
	QNode1 next;
	public QNode1(int data){
		this.data=data;
	}
	
}