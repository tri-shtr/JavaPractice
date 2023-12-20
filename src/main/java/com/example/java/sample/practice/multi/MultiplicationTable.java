package com.example.java.sample.practice.multi;

public class MultiplicationTable {
    public static void main(String[] args) {
        // 横方向
        //int num1 = Integer.parseInt(args[1]);
        int num1 = 20;
        // 縦方向
        //int num2 = Integer.parseInt(args[2]);

        StringBuilder headerBuilder = new StringBuilder();

        //System.out.print("|    |");
        for(int i=0; i<num1; i++){
            headerBuilder.append(" ");
            headerBuilder.append(String.format("%2d", i+1));
            headerBuilder.append(" !");
        }
        System.out.println(headerBuilder.toString());

    }
}
