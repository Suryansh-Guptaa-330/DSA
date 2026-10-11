package com.suryansh;

public class J11_CountNums {
    public static void main(String[] args) {


//        int n = 4553655;
//
//        int count = 0;
//        while(n>0) {
//            int rem = n % 10;
//            if (rem==5){
//                count++;
//            }
//            n = n/10;
//        }
//        System.out.println(count);

     // Reverse a number

        int num = 23597;
        int ans = 0;
        while (num>0){
            int rem = num%10;
             ans = ans*10+rem;
          num= num / 10;
        }

        System.out.println(ans);











    }
}
