package com.pattern;

public class p12 {
    public static void main(String[] args) {
        int n=8;
        for(int i=1; i<=n; i++){
            if(i==1||i==2||i==3){
               for(int j=1; j<=i; j++){
                 System.out.print("*");
               }
               for(int j=1; j<=n-2*i; j++){
                System.out.print(" ");
               }
               for(int j=1; j<=i; j++){
                 System.out.print("*");
               }
            }
            else if(i==4||i==5){
               for(int j=1; j<=n; j++){
                System.out.print("*");
               }
            }
            else{
                for(int j=1; j<=n-i+1; j++){
                    System.out.print("*");
                }
                for(int j=1; j<=2*i-n-2; j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=n-i+1; j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

