package com.example.java.sample.practice.leapyear;

public class LeapYear {
	public static boolean isLeapYear(int year) {
		if(year % 100 == 0 && year % 400 != 0) {
			// 100�Ŋ���؂��A���A400�Ŋ���؂�Ȃ��N�͕��N
			return false;
		}else if(year % 4 == 0) {
			// 4�Ŋ���؂��N�͂��邤�N
			return true;
		}else {
			// �ǂ���ł��Ȃ���Ε��N
			return false;
		}
	}

}
