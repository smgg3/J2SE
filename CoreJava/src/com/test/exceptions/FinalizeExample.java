package com.test.exceptions;

class FinalizeExample{  
	
public void finalize(){
	System.out.println("finalize called");
	}  
public static void main(String[] args){  
FinalizeExample f1=new FinalizeExample();  
FinalizeExample f2=new FinalizeExample();  
FinalizeExample f3=new FinalizeExample();  
f1=null;  
f2=null;  
f3=null;
System.gc();  
}}  