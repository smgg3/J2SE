package com.test.inheritence2;
import com.test.inheritence.*;

public class Child extends Parent {

	private String fName;
	
	
	public String getfName(){
		//System.out.println(total);
		//System.out.println(sal);
		//System.out.println(age);
		return fName;
	}
	
	public void setfName(String fName){
		
		this.fName=fName;
	}
}
