package com.example.java.sample.practice.leapyear;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class LeapYearTest {
	@ParameterizedTest
	@CsvSource({
		"1971, false",
		"1972, true",
		"1973, false",
		"1974, false",
		"1975, false",
		"1976, true",
		"1977, false",
		"1978, false",
		"1979, false",
		"1980, true",
		"1981, false",
		"1982, false",
		"1983, false",
		"1984, true",
		"1985, false",
		"1986, false",
		"1987, false",
		"1988, true",
		"1989, false",
		"1990, false",
		"1991, false",
		"1992, true",
		"1993, false",
		"1994, false",
		"1995, false",
		"1996, true",
		"1997, false",
		"1998, false",
		"1999, false",
		"2000, true",
		"2001, false",
		"2002, false",
		"2003, false",
		"2004, true",
		"2005, false",
		"2006, false",
		"2007, false",
		"2008, true",
		"2009, false",
		"2010, false",
		"2011, false",
		"2012, true",
		"2013, false",
		"2014, false",
		"2015, false",
		"2016, true",
		"2017, false",
		"2018, false",
		"2019, false",
		"2020, true",
		"2021, false",
		"2022, false",
		"2023, false",
		"2024, true",
		"2025, false",
		"2026, false",
		"2027, false",
		"2028, true",
		"2029, false",
		"2030, false"
	})
	public void testIsLeapYear(int year, boolean expectedOutput) {
		assertThat(expectedOutput, is(LeapYear.isLeapYear(year)));
	}

}
