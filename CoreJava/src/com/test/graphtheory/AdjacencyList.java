package com.test.graphtheory;
import java.util.*;

public class AdjacencyList {

	public static void main(String[] args) {
		ArrayList<LinkedList<Integer>> al=new ArrayList<LinkedList<Integer>>();
		Scanner s=new Scanner(System.in);
		System.out.print("Enter no.of nodes:");
		int n=s.nextInt();
		for(int i=0;i<n;i++){
			LinkedList<Integer> l1=new LinkedList<Integer>();
			al.add(i, l1);
		}
		
		System.out.print("Enter no.of edges:");
		int e=s.nextInt();
		int u,v;
		System.out.println("Enter Edges");
		for(int i=0;i<e;i++){
			
			u=s.nextInt();
			v=s.nextInt();
				
			al.get(u).add(v);
			al.get(v).add(u);
		}
		Collections.sort(al.get(0));	
		System.out.println(al.get(0));
		
		ArrayList<LinkedList<Node>> list=new ArrayList<LinkedList<Node>>();
		Iterator m=al.get(0).listIterator();
		
	}

}
class Node{
	
}