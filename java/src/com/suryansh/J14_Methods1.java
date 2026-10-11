package com.suryansh;

import java.util.Scanner;

public class J14_Methods1  {
    public static void main(String[] args) {
        // Q: take input of 2 no. and print sum

        //   access modifier(we'll look in OOP) return_type name () {
        // body
        //return Stetement;
        //   }

       int ans = sum2();
        System.out.println(ans);
    }

    // return the value
     static int sum2() {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter no. 1");
         int num1 = in.nextInt();
         System.out.println("Enter no. 2");
         int num2 = in.nextInt();
         int sum = num1 + num2 ;
         in.close();
         return sum;
     }


      static void sum() {
      Scanner in = new Scanner(System.in);

            System.out.println("Enter no. 1");
            int num1 = in.nextInt();
            System.out.println("Enter no. 2");
            int num2 = in.nextInt();
            int sum = num1 + num2 ;
            System.out.println("The sum is : " + sum);
            in.close();
    }


}
