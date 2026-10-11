package com.arrays;

public class a5array2D {
public static void main(String[] args) {
    //declaration
  //  int[][] arr;
    //allocation
   // arr = new int[3][2];
    //initialisation
    int[][] brr = {
           {1,2},
           {2,3 ,4},
           {3,4,5,6,7,8,9},
           {4,5,11,10}
    };
  //  System.out.println(brr[3][0]);

    int rowLength = brr.length;
    

    for(int row=0; row<=rowLength-1; row++){
        int colLength = brr[row].length; // no of columns in each row are different
        for(int col=0; col<=colLength-1; col++){
            System.out.print(brr[row][col] + " ");
        }
        System.out.println();
    }





   }
}
