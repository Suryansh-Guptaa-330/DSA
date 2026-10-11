package com.methods;

public class m1 {

     static void print2Table(){
        for(int i=1; i<=10; i++){
            System.out.println(2*i);
        }
    }

     static void printSum(int x , int y){ 
     System.out.println("SUM is:" +(x+y));
     }

    public static void main(String[] args) {
      printSum(3,4);
      print2Table();                         //calling in a static method so static method can be called.
    }
}
