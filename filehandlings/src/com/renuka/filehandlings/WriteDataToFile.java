package com.renuka.filehandlings;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteDataToFile {

	public static void main(String[] args) throws IOException{
		System.out.println("programm Started");
	 File file=new File("C:\\Users\\user\\Desktop\\IOFiles\\ragerenuk.txt");
	 if(file.exists()==false)
	 {
		 file.createNewFile();
		 System.out.println("file created successfully");
	 }
	 FileOutputStream out=new FileOutputStream(file);
	
	
	
 String str="Ashoka is king ,ruled Bharath";
    char[] ch=str.toCharArray();
    for(int i=0;i<ch.length;i++)
    {
    	out.write(ch[i]);
	    }
	    
	    DataOutputStream dos=new DataOutputStream(new FileOutputStream(file));
	    dos.writeBytes("java is a progaramming language");
	    dos.writeBoolean(false);
	    dos.writeBytes("false");
	    
	    ObjectOutputStream oos=new  ObjectOutputStream(dos);
	    oos.writeObject(new Student(1010,"Renuka",987));
	    oos.writeObject(new Student(1112,"VishnuPriya",100));
	    oos.writeObject(new Student(10101,"Sai Kumar",999));
	    oos.writeObject(new Student(9887,"manojkumar",4707));
	    oos.writeObject(new Student(1112,"VishnuPriya",100));
	    oos.writeObject(new Student(10101,"Sai Kumar",999));
	    oos.writeObject(new Student(9887,"manojkumar",4707));
	    oos.writeObject(new Student(1010,"Renuka",987));
	    oos.writeObject(new Student(1112,"VishnuPriya",100));
	    oos.writeObject(new String("Suresh"));
	    oos.writeObject(new String("Ramesh"));
	    oos.writeObject(new String("Mahesh"));
	    oos.writeObject(new Student(10101,"Sai Kumar",999));
	    
	    
//	    OutPutStream(parent class)->FileOutputStream-> 3 methods
//	                ->DataOutputStream->
//	                ->ObjectOutputStream->Directly we can write an object.
	 
	    
	    
	
	 
	 dos.close();
	 oos.flush();
	System.out.println("file writing ended");

	}

}
