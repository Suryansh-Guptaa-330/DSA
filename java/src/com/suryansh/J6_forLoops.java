package com.suryansh;

import java.util.Scanner;

public class J6_forLoops {
    public static void main(String[] args) {

        /*
        Syntax of for loop:
        for (
        initialisation; condn; increment/decrement){
        body
        }
         */
        // Q: Print numbers from 1 to 5
        for (int num = 1; num <= 5; num++) {
            System.out.println(num);
        }
       // print numbers from 1 to n
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int num=1; num<=n; num++){
     //       System.out.print(num + " ");
            System.out.println("Hello World");
        }
        in.close();
    }
}
