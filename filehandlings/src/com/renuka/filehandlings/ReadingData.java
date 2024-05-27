package com.renuka.filehandlings;


		

		import java.io.File;
		import java.io.FileInputStream;
		import java.io.FileNotFoundException;
		import java.io.FileOutputStream;
		import java.io.IOException;


		public class ReadingData {


			public static void main(String[] args) throws IOException  {
				System.out.println("Started");
				File deepika = new File("C:\\Users\\user\\Desktop\\IOFiles\\jaya.dox");
			    FileInputStream fis = new FileInputStream(deepika);
			    
			    
			   File vishnupriya = new File("C:\\Users\\user\\Desktop\\IOFiles\\vishnupriya.txt");
			   vishnupriya.createNewFile();
			   FileOutputStream fos = new FileOutputStream(vishnupriya);
//		  int char1 = fis.read();
//		  int char2 = fis.read();
//		  int char3 = fis.read();
//		  int char4 = fis.read();
//			   
//		  byte allChars[] =  fis.readAllBytes();
//		  for(int i = 0; i<allChars.length ; i++) {
//				  System.out.print((char)allChars[i]);
//		  }
//			  System.out.println();
			   int eachChar ;
			   while((eachChar = fis.read())!=-1) {
				   fos.write((char)eachChar);
			   }
	       System.out.println();
			   
			
			   System.out.println("Ended");
			
				
				

			}

	

	}


