package com.Jsp.JdbcProject.Module1;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the type of the light you want to operate");
			String choice=sc.next();
			Iswitch light=LightFactory.getLight(choice);
			if(light!=null)
			{
				light.on();
			    light.off();
			}

		}

	}

