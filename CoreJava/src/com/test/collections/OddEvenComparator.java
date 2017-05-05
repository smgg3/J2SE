package com.test.collections;
import java.util.ArrayList;
import java.util.Comparator;
public class OddEvenComparator implements Comparator<Integer> {

	public static void main(String[] args) {
		

	}

	@Override
	public int compare(Integer a, Integer b) {
		if(a%2==0&&b%2!=0)
		return -1;
		else if(a%2!=0&&b%2==0)
			return 1;
		else {
			if(a<b)
				return -1;
			else if(a>b)
				return 1;
			else
				return 0;
			
		}
	}
	
}
