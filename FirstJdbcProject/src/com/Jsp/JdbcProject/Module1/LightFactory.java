package com.Jsp.JdbcProject.Module1;

public class LightFactory {
 public static Iswitch getLight(String type)
 {
	 if(type.equalsIgnoreCase("TubeLight"))
	 {
		 System.out.println("Tubelight object is created");
		 return new TubeLight();
	 }
	 else if(type.equalsIgnoreCase("ledLight"))
	 {
		 System.out.println("Ledlight object is created");
		 return new LedLight();
	 }
	 else
	 {
		 System.out.println("Invalid derivec!! No device found...!!");
		 return null;
	 }
		 
	 
 }
}
