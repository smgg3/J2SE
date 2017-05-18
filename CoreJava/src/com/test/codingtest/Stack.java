package com.test.codingtest;

public class Stack {
	private int top=-1;
	private int max=10;
	private int[] stack=new int[max];
	static int h=0;
	
	public Stack(){
		System.out.println("New Stack Created");
		
	}
	public  void push(int elem){
		if(top+1>=max)
		{
			System.out.println("Cant push into stack because of overflow");
		}
		else{
			stack[++top]=elem;
		}
			
	}
	public int pop(){
		if(stackEmpty()){
			System.out.println("UnderFlow");
			return 0;
		}
		
		return stack[top--];
	}
	public int peek(){
		if(stackEmpty()){
			System.out.println("UnderFlow");
			return 0;
		}
		
		return stack[top];
	}
	public boolean stackEmpty(){
		if(top<0)
			return true;
		return false;
	}
	public void printStack(){
		for(int i=top;i>=0;i--)
			System.out.print(stack[i]+"  ");
		
	}
	public static void main(String[] args) {
	
		Stack s= new Stack();
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

