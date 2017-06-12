package com.designpatterns.singleton;
import java.util.*;

public class Singleton {

	private static Singleton firstinstance=null;
	
	String[] scarabbleletters={"b","d","h","s","g","a","r","g","h","w","a","j","u","m","a","d","e","b","d","g","s","j","k","y","v","t","n","k","u","o"};
	
	private LinkedList<String> letterlist=new LinkedList<String>(Arrays.asList(scarabbleletters));
	
	static boolean firstThread=true;
	
	private Singleton(){
		
	}
	public static synchronized Singleton getInstance(){
	
		if(firstinstance==null){
			if(firstThread){
				firstThread=false;
				Thread.currentThread();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		//	synchronized(Singleton.class){//Another way to synchronizes
				
			//	if(firstinstance==null){
					
				
			firstinstance=new Singleton();//lazy instanciation
			
			 Collections.shuffle(firstinstance.letterlist	);
			 
		//		}
			 
	//		}
		}
		return firstinstance;
	}
	
	public LinkedList<String> getLetterList(){
		return firstinstance.letterlist;
	}
	
	public LinkedList<String> getTiles(int howManyTiles){
		
		LinkedList<String> tilesToSend=new LinkedList<String>();
		
		for(int i=0;i<howManyTiles;i++){
			tilesToSend.add(firstinstance.letterlist.remove(0));
		}
		return tilesToSend;
	}
	
	
	
	
	
	
	
	
	
	
	
}
