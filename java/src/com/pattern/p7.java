package com.pattern;

public class p7 {
    public static void main(String[] args) {
        int n=4;
      for(int row=1; row<=n; row++){
        if (row==1 || row==n) {
            for(int col=1; col<=n+2; col++){
                System.out.print("*");
            }
        }
        else{
          for(int col=1; col<=n+2; col++){
             if(col==1 || col==6){
              System.out.print("*");
             }
             else{
              System.out.print(" ");
             }
          }
        }
        System.out.println();
      }
    
}
}

