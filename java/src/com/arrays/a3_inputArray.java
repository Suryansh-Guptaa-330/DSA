package com.arrays;

import java.util.Scanner;

public class a3_inputArray {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;

        //input
        for(int i=0; i<=n-1; i++){
            System.out.println("enter the value : " + i);
          arr[i] = sc.nextInt();
        }

        //output
        for(int val: arr){
            System.out.println(val);
        }
    
    sc.close();
    }
}