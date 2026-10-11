package com.suryansh;

import java.util.Scanner;

public class J4_typecastingconverion  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    //    float num = input.nextFloat();
    //    System.out.println(num);


    int num = (int)(6.7f);
        System.out.println(num);

        // automatic type promotion in expressions
        int a = 257;
        byte b = (byte)(a);  // 257%256 = 1
        System.out.println(b);
        input.close();
    }
}


