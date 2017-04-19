package com.test.inheritence;
import com.test.inheritence2.*;
public class Inheritance {

	public static void main(String[] args) {
		System.out.println("Hello World");
		Child c = new Child();
		c.setfName("Sravani");
		c.setlName("Murakonda");
		System.out.println(c.getfName()+" "+c.getlName());
		System.out.println("Pi"+"  "+Parent.pi);
		System.out.println(c.total);
		System.out.println(Child.pi);
		System.out.println(Child.pi);
		
	}

}
