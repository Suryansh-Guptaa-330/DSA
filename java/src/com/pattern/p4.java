package com.pattern;

public class p4 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++){
            //also col<=n-i+1;
            for(int j=n; j>=i; j--){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    
}
