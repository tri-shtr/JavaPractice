package com.example.java.sample.practice.leapyear;

public class LeapYear {
	public static boolean isLeapYear(int year) {
		if(year % 100 == 0 && year % 400 != 0) {
			// 100で割り切れる、かつ、400で割り切れない年は平年
			return false;
		}else if(year % 4 == 0) {
			// 4で割り切れる年はうるう年
			return true;
		}else {
			// どちらでもなければ平年
			return false;
		}
	}

}
