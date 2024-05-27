package com.renuka.filehandlings;

import java.io.File;
import java.io.IOException;

public class FileInputOutputStreams {

	public static void main(String[] args) throws IOException {
		System.out.println("Going create an file Object");
		File file=new File("C:\\Users\\user\\Desktop\\IOFiles\\ragerenuka.txt");
		
		boolean createnewfile=file.createNewFile();
		System.out.println(createnewfile);
		
		boolean canread=file.canRead();
		System.out.println("can read a file: " +canread);
		
		boolean canwrite=file.canWrite();
		System.out.println("can write a file: " +canwrite);
		
//		boolean deletefile=file.delete();
//		System.out.println("delete a created file:"+deletefile);
		
		boolean executefile=file.canExecute();
		System.out.println(executefile);
		
		boolean exitsfile=file.exists();
		System.out.println(exitsfile);
		
	        File absolutefile=file.getAbsoluteFile();
	        System.out.println(absolutefile);
	        
	       String absolutepath= file.getAbsolutePath();
	       System.out.println(absolutepath);
	       
	     String filename=  file.getName();
	     System.out.println("file name is:"+ filename);
	     
	   String canonocalpath=  file.getCanonicalPath();
	   System.out.println(canonocalpath);
	   
	long freespace=	file.getFreeSpace();
	System.out.println(freespace);
	
	 String parentfile=file.getParent();
	 System.out.println(parentfile);
	 
	File parentfile1= file.getParentFile();
	System.out.println(parentfile1);
	
	boolean mkdirfile=file.mkdir();
	System.out.println(mkdirfile);
		

		}


	}


