package com.test.codingtest.trees;
import java.util.*;
public class HashTableChaining <T>{
	private int p=37;
	HNode[] h=new HNode[37];
	public void create(){
		for(Integer i=0;i>p;i++){
			h[i]=null;
		}
	}
	public void insert(T key,T data){
		int k=key.hashCode();
		int hk=(k%p);
		//System.out.println(h[hk].key);
		if(h[hk]!=null){
		HNode old=h[hk].getNext();
		h[hk].setNext(new HNode(key,data));
		(h[hk].getNext()).setNext(old);}
		else
			h[hk]=new HNode(key,data);
	}
	public void print(int i){
		HNode n=h[i];
		while(n!=null){
			System.out.println(n.getKey()+"->"+n.getValue());
			n=n.getNext();
		}
	}
	public static void main(String[] args) {
	HashTableChaining obj=new HashTableChaining();
	//System.out.println((obj.h[0].key));
	obj.create();
	obj.insert(2,"sravani");
	obj.insert(39,"sai");
	obj.insert(76,"Nani");
	obj.print(0);
	obj.print(2);
	
	
	
		
	}
	
}
class HNode<T>{
	private T key;
	private T value;
	private HNode next;
	public HNode(T key,T data){
		this.key=key;
		this.value=data;
		this.next=null;
	}
	public void setKey(T key){
		this.key=key;
	}
	public T getKey(){
		return (T) this.key;
	}
	public void setValue(T value){
		this.value=value;
	}
	public T getValue(){
		return (T) this.value;
	}
	public void setNext(HNode next){
		this.next=next;
	}
	public HNode getNext(){
		return this.next;
	}
}
