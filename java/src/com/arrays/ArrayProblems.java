package com.arrays;

public class ArrayProblems {

//problem 1: Write a program to find the average of all the elements of an array
   static double getAverage(int[] arr){
     double sum = 0;
     for (int i : arr) {
        sum = sum + i;
     }
     int size = arr.length;
     double average = sum/size;

     return average;
   }

   //problem 2: multiply each element of array by 10
   static int[] multiplyByTen(int[] arr){
       int size = arr.length;
       int newArray[] = new int[size];

       for(int i=0; i<size; i++){
        int element = arr[i];
        int newElement = element * 10;
        newArray[i] = newElement;
       }
       return newArray;
   }

   //p3: search for an element in the array(linear search)
   static boolean searchElement(int arr[] , int target){
     for(int i=0; i<arr.length; i++){
        if(arr[i] ==target){
            return true;
        }
     }
     return false;
   }


   //p4: find maximum element in an array
   static int findMaxElement(int arr[]){
       int max = arr[0];
       for(int i=0; i<arr.length; i++){
        if (arr[i] > max) {
            max = arr[i];
        }
      }
       return max;
   }


   //p5: sum of +ve and -ve numbers
   static int[] sumOfPositiveAndNegativeNumbers(int arr[]){
    int size = arr.length;
    int positiveSum = 0;
    int negativeSum = 0;
    for(int i=0; i<arr.length; i++){
        if(arr[i]>0){
            positiveSum = positiveSum + arr[i];
        }
        else{
            negativeSum = negativeSum + arr[i];
        }
    }
    int ans[] = {positiveSum , negativeSum};
    return ans;
   }


    public static void main(String[] args) {

        //p1
    //  int arr[] = {1,2,3,4,5};
    //  System.out.println(getAverage(arr));

      //p2
    //   int  arr[] = {1,3,5,7,9};
    //   int answer[] = multiplyByTen(arr);
    //   System.out.println("New array" );
    //   for (int i : answer) {
    //     System.out.print(i + " ");
    //   }
      

    //p3
    //  int arr[] ={1,3,5,7,9};
    //  boolean ans = searchElement(arr , 10);
    //  System.out.println(ans);


    //p4
    // int arr[] = {5,4,6,3,2,8,9,7};
    // int ans = findMaxElement(arr);
    //   System.out.println(ans);
        //Math.max() function understand and solve using it.


    //p5
    int arr[] = { 2,3,-2,4,-3,-4,5,8,-9,-7,6};
    int ans[] = sumOfPositiveAndNegativeNumbers(arr);
    System.out.println("Positive sum " + ans[0]);
    System.out.println("Negative sum " + ans[1]);
     

    }
    
}

