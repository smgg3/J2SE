package com.test.files;

import java.io.*;

public class FileReadWrite {

	public static void main(String[] args) {
		File f=new File("C://Users//Sravani Chowdary//Documents//GitHub//Sravani//CoreJava//src//com//test//files//2.txt");	
		File f1=new File("C://Users//Sravani Chowdary//Documents//GitHub//Sravani//CoreJava//src//com//test//files//1.txt");	
		//f.createNewFile();
		String  s;
		String wtext="";
		BufferedReader b=null;
		try{
		 b=new BufferedReader(new FileReader(f1));
		
		while((s=b.readLine())!=null){
			wtext=wtext+s+"\n";
			
		}}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			
			if(b!=null)
				try {
					b.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		System.out.println(wtext);
		PrintWriter p=null;
		try {
			
			String[] lines=wtext.split("\n");
			 p=new PrintWriter(f);
			 for(String line:lines){
			 p.println(line);}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		finally{
			p.close();
		}
	}
}