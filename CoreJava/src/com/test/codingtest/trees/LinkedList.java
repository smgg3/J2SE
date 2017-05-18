package com.test.codingtest.trees;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Iterator;
import java.util.List;
public class LinkedList<T> {
	LNode head;
	int n;
	
	
	public LinkedList(){
		head=null;
	}
	public void  insert(T data){
		
		if(head==null)
		{
			head=new LNode(data);
			head.prev=head;
			head.next=head;
		}
		else{
			LNode old=head.prev;
			head.prev=new LNode(data);
			old.next=head.prev;
			head.prev.prev=old;
			head.prev.next=head;
		}
	}
	void printLL(){
		LNode x=head;
		do{
			System.out.print(head.data+"  ");
			head=head.next;
		}while(head!=x);
	}
	
	public static void main(String[] args) {
		
		LinkedList obj=new LinkedList();
		Scanner s=new Scanner(System.in);
		
		obj.insert(s.nextLine());
		obj.insert("sravani");
		obj.insert(1.2);
		obj.printLL();
		
		
	}

}
class LNode<T>{
	T data;
	LNode prev;
	LNode next;
	public LNode(T data){
		this.data=data;
		
	}
}
