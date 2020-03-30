package com.example.java.sample.practice.FizzBuzz;

public class FizzBuzz {

	public static String getFizzBuzz(int number) {
		if(number % 15 == 0) {
			return "FizzBuzz";
		}else if(number % 5 == 0) {
			return "Buzz";
		}else if(number %3 == 0) {
			return "Fizz";
		}else {
			return "-";
		}
	}

}
