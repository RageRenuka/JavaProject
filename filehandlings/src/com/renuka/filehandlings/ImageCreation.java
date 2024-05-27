package com.renuka.filehandlings;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCreation {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\user\\Desktop\\IOFiles\\manoj.jpg");
		FileInputStream fis=new FileInputStream(file);
		byte[] bytearray=fis.readAllBytes();
		System.out.println(bytearray);
		File file1=new File("C:\\Users\\user\\Desktop\\IOFiles\\laddu.jpg");
		file1.createNewFile();
		FileOutputStream fos=new FileOutputStream(file1);
		fos.write(bytearray);
		
		

	}

}
