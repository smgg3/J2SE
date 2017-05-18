package com.test.codingtest;

import java.util.Iterator;

public class StackNode{
	
	private Node first;
	private int n;
	public StackNode(){
		System.out.println("New Stack Created");
	}
	public void push(int elem){
		Node old=first;
		first=new Node(elem,old);
		n++;
	}
	public int pop(){
		if(stackEmpty()){
			System.out.println("UnderFlow");
			return 0;
		}
		else{
		int data=first.item;
		first=first.next;
		n--;
		return data;
		}
	}
	public int peek(){
		if(stackEmpty()){
			System.out.println("UnderFlow");
			return 0;
		}
		
		return first.item;
	}
	public boolean stackEmpty(){
		if(first==null)
			return true;
		return false;
	}
	public void printStack(){
		while(first!=null)
			System.out.print(pop()+"  ");
		
	}
	public static void main(String[] args) {
		
		StackNode s=new StackNode();
		System.out.println(s.pop());
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		s.push(7);
		s.push(8);
		s.push(9);
		s.push(10);
		s.push(11);
		
		System.out.println(s.peek());
		System.out.println(s.pop());
		
		s.printStack();
		
	}
	

}
class Node{
	int item;
	Node next;
	public Node(int data,Node node)
	{
		this.item=data;
		this.next=node;
	}
}





