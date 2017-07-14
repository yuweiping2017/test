package com.howtodoinjava.test;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestCase{
	String message = "hello world";
	MessageUtil messageUtil = new MessageUtil(message);
	@Test
	public void messageUtilPrintMessageTest(){		
		String mes = "hello";
		assertEquals(mes, messageUtil.printMessage());	
		
	}
}
