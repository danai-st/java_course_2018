package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivTest {

	@Test(expected=ArithmeticException.class)
	public void shouldThrowDevideByZeroException2() {
		Div div = new Div();
		div.process(1, 0);
	}
	
	@Test
	public void shouldThrowDevideByZeroException() {
		Div div = new Div();
		try {
			div.process(1, 0);
			fail("Should not be here!!");
			} catch(ArithmeticException e) {
		}
	}
}
