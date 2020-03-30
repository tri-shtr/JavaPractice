package com.example.java.sample.practice.FizzBuzz;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class FizzBuzzTest {

	@ParameterizedTest
	@CsvSource({
		"1,-",
		"2,-",
		"3,Fizz",
		"4,-",
		"5,Buzz",
		"6,Fizz",
		"7,-",
		"8,-",
		"9,Fizz",
		"10,Buzz",
		"11,-",
		"12,Fizz",
		"13,-",
		"14,-",
		"15,FizzBuzz",
		"16,-",
		"17,-",
		"18,Fizz",
		"19,-",
		"20,Buzz",
		"21,Fizz",
		"22,-",
		"23,-",
		"24,Fizz",
		"25,Buzz",
		"26,-",
		"27,Fizz",
		"28,-",
		"29,-",
		"30,FizzBuzz"
	})
	public void input(int number, String expectedOutput) {
		assertThat(expectedOutput, is(FizzBuzz.getFizzBuzz(number)));
	}

}
