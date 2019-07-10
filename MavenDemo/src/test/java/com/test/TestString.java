package com.test;

import static org.junit.Assert.*;

import org.junit.Test;


import com.first.StringOperations;

public class TestString {

	@Test
	public void testAdd() {
		StringOperations mo = new StringOperations();
		String actual = mo.add("Hello","World");
		String expected = "HelloWorld";
		assertEquals(expected, actual);
	}
	@Test
	public void testSub() {
		StringOperations mo = new StringOperations();
		int actual = mo.length("hello");
		int expected = 5;
		assertEquals(expected, actual);
	}
	@Test
	public void testMult(){
		StringOperations mo = new StringOperations();
		boolean actual = mo.contain("Bananas");
		boolean expected = true;
		assertEquals(expected, actual);
	}

}
