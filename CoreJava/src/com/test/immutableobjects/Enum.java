package com.test.immutableobjects;

public class Enum {
	
	
	public Enum() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		EnumLs e=new EnumLs(EnumLs.EnumList.MEDIUM);
		
		e.severity=e.getSeverity();
		System.out.println(e.severity);

	}

}
class EnumLs{
	enum EnumList{MEDIUM,LOW,HIGH};
	EnumList severity;
	public EnumLs(EnumList s){
		this.severity=s;
	}
	public  EnumList getSeverity(){
		return severity;
	}
}
