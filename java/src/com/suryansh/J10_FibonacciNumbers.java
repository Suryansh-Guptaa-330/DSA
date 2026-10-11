package com.suryansh;

import java.util.Scanner;

public class J10_FibonacciNumbers {
    public static void main(String[] args) {

        //sum of previous two numbers - 0,1,1,2,3,5,8,13,...
        //find nth fibonacci number

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count<=n) {
            int temp =  b ;
            b = b + a ;
            a = temp ;
            count++;
        }
        System.out.println(b);
        in.close();
    }
}
