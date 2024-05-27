package com.renuka.start;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstDemoMavenTest {

	@Test
	public void testAddition() {
		FirstDemoMaven obj=new FirstDemoMaven();
		int atucal=obj.addition(5, 2);
		assertEquals(7, atucal);
	}
	@Test
	public void testAddition1() {
		FirstDemoMaven obj=new FirstDemoMaven();
		int atucal=obj.addition(1, 2);
		assertEquals(3, atucal);
	}
	@Test
	public void testAddition2() {
		FirstDemoMaven obj=new FirstDemoMaven();
		int atucal=obj.addition(5, -6);
		assertEquals(-1, atucal);
	}
	@Test
	public void testAddition3() {
		FirstDemoMaven obj=new FirstDemoMaven();
		int atucal=obj.addition(7, -3);
		assertEquals(4, atucal);
	}
	
	@Test
	public void testAddition4() {
		FirstDemoMaven obj=new FirstDemoMaven();
		int atucal=obj.addition(-5, -5);
		assertEquals(-10, atucal);
	}

}
