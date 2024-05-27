package com.renuka.waystocreatingonObjects;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class WaysToCreatingOnObjects {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
//		There is called Class.
//		in Class class there is a method is a static method  called forName(String classname);
//		forName method returns you class object which you passed to the forName() Method.
//		on the class object you can call newInstance()method to get new instance of passed class.
		
//		1st way creating on object by using new keyword.
//		Student std1=new Student();
//		System.out.println(std1);
//		Student std2=new Student(10101,"ManojKumar",90);
//		System.out.println(std2);
//		System.out.println(std2.hashCode());
//		System.out.println();
//		
//		4th way creating on object
//		Class<Student> clss=(Class<Student>)Class.forName("com.renuka.waystocreatingonObjects.Student");
//		Student stud=clss.newInstance();
		
		Student std=(Student)Class.forName("com.renuka.waystocreatingonObjects.Student").newInstance();
		System.out.println(std);
//		System.out.println(std.hashCode());
//		
//		5th way There is a class called Constructor and you can call getConstructor()on its class.
//		it gives all the available Constructs of the passed class.      
//		on that object you can call instanceOf()method.
		System.out.println("How to create the object in 5th way");
		
		Constructor<Student>[] ref= (Constructor<Student>[])Student.class.getDeclaredConstructors();
//		Student std11=ref[1].newInstance(111,"Renuka",90);
//	
//		System.out.println( std11);
//	
	System.out.println(ref[0]);
	System.out.println(ref[1]);
//	ref[0].newInstance();
//	ref[1].newInstance();
		

	}

}
