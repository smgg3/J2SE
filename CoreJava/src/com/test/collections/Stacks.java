package com.test.collections;
import java.util.Stack;
import org.junit.*;

public class Stacks {

	public static void main(String[] args) {
		Stack<String> s=new Stack<String>();
		String str="Hello Welcome to Java";
		String[] st=str.split(" ");
		for(int i=0;i<st.length;i++){
			s.push(st[i]);
		}
		for(int i=0;i<st.length;i++){
			System.out.print(s.pop()+" ");
		}	
	
		

	}

}
