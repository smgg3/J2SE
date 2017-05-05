package com.test.files;

import java.io.*;
import java.util.Scanner;

public class FileMAssCopy {
	

	public static void copyFiles(File source,File dest) throws IOException{
		if(source.isDirectory())
		{	
			if(!dest.exists()){
				dest.mkdir();
			}
			String[] files=source.list();
			for(int i=0;i<files.length;i++){
				copyFiles(new File(source,files[i]),new File(dest,files[i]));
			}
		}
		else{
			String s;
			String wtext="";
			BufferedReader b=null;
			
				b=new BufferedReader(new FileReader(source));
			
				while((s=b.readLine())!=null){
					wtext=wtext+s+"\n";
					}
				PrintWriter p=null;
				String[] lines=wtext.split("\n");
				if(!dest.exists())
					dest.createNewFile();
				 p=new PrintWriter(dest);
				 for(String line:lines){
					 p.println(line);}
			
			}
		
	}
	
	public static void main(String[] args) throws IOException{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter path of the source file/directory:");
		String source_path=s.nextLine();
		System.out.print("Enter path of the Destination file/directory:");
		String dest_path=s.nextLine();
		File f=new File(source_path);
		File f1=new File(dest_path);
		if(f.exists()){
			
			copyFiles(f,f1);
		}
		System.out.println("Copied all Directory");

	}
}
