package com.combinationofclass.packages.copy;

public class SetOfCLass {
//	fields:-1)static field,==>class level components
	//2)non static field===>object level components
//	int studentnum;
	//syntax:data type Initialization;
//	double studentfee;
	
//	Blocks:-1)static block,===>class level components
	//2)non static block,===>object level components
	
//	methods:-1)static method,===>class level components
	//2)non static method===>object level components
	
	//Accesspcifier return methodname(methodsignature)
	//{
	//method logic/method body
//}
//	constructor:-Spacial Member Of a Method
	//Static method
	
	public int adding(int a,int b)         //int a,int b are parametres
	{
		return a+b;                       //return is a keyword
	}
	public float multiple(float d,float f1)
	{ 
		
		float f2=d*f1;
		return f2;
	}
	private int sub(int a,int b)
	{
		int c=a-b;
		System.out.println(c);
		return c;
		
	}
	
	
	

	public static void main(String[] args) {
	SetOfCLass cs=new SetOfCLass();        //objectof a class
     int c=cs.adding(5,9);                       //calling a method and 5,7 are arguments
     System.out.println(c);
     System.out.println(cs. multiple(9,4));
     cs.sub(90,80);
	}

}
