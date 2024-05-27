package com.renuka.filehandlings;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestClass {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\user\\Desktop\\IOFiles\\jaya.dox");
		FileWriter fw=new FileWriter(file);
		fw.write("hello java progarammers");
		fw.append('R');
		String encoding=fw.getEncoding();
		System.out.println(encoding);
		fw.flush();

	}

}
