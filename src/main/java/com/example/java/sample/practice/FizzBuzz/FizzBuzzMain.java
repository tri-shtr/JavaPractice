package com.example.java.sample.practice.FizzBuzz;

public class FizzBuzzMain {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[1]);
        for(int i=1; i < number; i++){
            System.out.println(FizzBuzz.getFizzBuzz(i));
        }
    }
}
