package com.pattern;

public class p1 {
    public static void main(String[] args) {
        int n=5;
        for(int row=1; row<=n; row++){
            // for each row --> variable columns
            // formula -> col -> 1 -> value of row
            
            for(int col=1; col<=row; col++){

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

