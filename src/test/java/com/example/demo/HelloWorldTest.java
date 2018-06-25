package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class HelloWorldTest {

	@Test public void
		สวัสดี_somkiat_when_input_is_somkiat() {
			Reception reception = new Reception();
			String actualResult = reception.get("somkiat");
			assertEquals("สวัสดี somkiat", actualResult);
	}

}
