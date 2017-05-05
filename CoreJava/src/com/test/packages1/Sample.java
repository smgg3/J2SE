package com.test.packages1;

public class Sample{
}
 class SameClassName {

	public static void main(String[] args) {
		System.out.println("From non public class");
		packages.SameClassName s=new packages.SameClassName();
		System.out.println(s.today);
	}

}
