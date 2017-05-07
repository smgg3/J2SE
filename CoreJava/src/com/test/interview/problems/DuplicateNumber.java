package com.test.interview.problems;

import java.util.ArrayList;
import java.util.Collections;

public class DuplicateNumber {

	
	    void printRepeating(int arr[], int size)
	    {
	    	
	    } 
	 
	    /* Driver program to test the above function */
	    public static void main(String[] args) 
	    {
	        DuplicateNumber repeat = new DuplicateNumber();
	        ArrayList<Integer> arr=new ArrayList<Integer>();
			
			arr.add(1);
			arr.add(2);
			arr.add(6);
			arr.add(2);
			arr.add(6);
			for(int i=0;i<arr.size();i++){
				if(arr.indexOf(arr.get(i))!=arr.lastIndexOf(arr.get(i)))
					System.out.println(arr.get(i)+" is duplicate");
				
			}
			int max=Collections.max(arr);
			Integer [] c=new Integer[max];
			for(int i=0;i<max;i++){
				c[i]=0;
			}
			for(int i=0;i<arr.size();i++){
				
				if(c[arr.get(i)-1]==1)
					System.out.println(arr.get(i));
				else
					c[arr.get(i)-1]++;
			}
			
			}
	    }
	
	


