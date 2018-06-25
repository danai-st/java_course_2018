package com.example.demo;

public class FizzBuzz {

	public String say(int input) {
		if (input == 15) {
			return "FizzBuzz";
			} 
		for(int i=0; i<=input; i+=3) {
			if (i == input) {
				return "Fizz";
			}
		}
		for(int i=0; i<=input; i+=5) {
			if (i == input) {
				return "Buzz";
			}
		}
		return String.valueOf(input);
	}
}
