package com.test.files;
import java.io.*;
import java.util.*;
public class FilesFileListing {
	public static void printFilesList(File f){
		if(f.isDirectory())
		{	
			System.out.println("*\t"+f.getName());
			File[] files=f.listFiles();
			for(File file:files){
				printFilesList(file);
			}
		}
		else
			System.out.println(" -\t"+f.getName());
	}
	public static void main(String[] args) throws IOException{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter path of the file/directory:");
		String path=s.nextLine();
		
		File f=new File(path);
		if(f.exists()){
			
			printFilesList(f);
		}

	}

}
