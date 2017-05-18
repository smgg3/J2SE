package com.test.graphtheory;
import java.util.*;
public class AdjacencyMatrix {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> am=new ArrayList<ArrayList<Integer>>();
		Scanner s=new Scanner(System.in);
		System.out.print("Enter no.of nodes:");
		int n=s.nextInt();
		for(int i=0;i<n;i++){
			ArrayList<Integer> l=new ArrayList<Integer>();
			am.add(i,l);
		}
		System.out.println(am);
		System.out.print("Enter no.of edges:");
		int e=s.nextInt();
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				am.get(i).add(0);
		int u,v;
		System.out.println("Enter Edges");
		for(int i=0;i<e;i++){
			
			u=s.nextInt();
			v=s.nextInt();
			am.get(u).set(v, 1);
			am.get(v).set(u, 1);
		}
		
		System.out.println(am);
		
		
	}

}
