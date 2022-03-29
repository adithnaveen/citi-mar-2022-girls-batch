package com.naveen.bankdao.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.naveen.day1.SampleCode;

public class FirstTest {

	SampleCode sc = null; 
	@Before
	public void setUp() {
		sc = new SampleCode(); 
		System.out.println("hey i'm before test method");
	}
	
	@After
	public void tearDown() {
		System.out.println("Hey i'm after the test method");
	}
	
	@Test
	public void test() {
		String expectedName ="Hello Kareena"; 
		String actualName = sc.sayHi("Kareena");
		
		assertEquals(expectedName, actualName);
	}

	@Test
	public void addTest() {
		int expected = 10; 
		int actual = sc.add(5, 5);
		
		assertEquals(expected, actual);
		
	}
}
