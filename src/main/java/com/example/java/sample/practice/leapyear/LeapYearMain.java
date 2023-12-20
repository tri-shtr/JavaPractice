package com.example.java.sample.practice.leapyear;

public class LeapYearMain {
    public static void main(String[] args) {
        int year = Integer.parseInt(args[1]);
        if(LeapYear.isLeapYear(year)){
            System.out.println("うるう年");
        }else{
            System.out.println("平年");
        }
    }
}
