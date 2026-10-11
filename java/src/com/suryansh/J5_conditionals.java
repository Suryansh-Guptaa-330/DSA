package com.suryansh;



public class J5_conditionals {
    public static void main(String[] args) {
        /*  syntax of IF statement:
        if(Boolean expression T or F){
        //body
        } else {
        // do this
        }
         */

        int salary = 25400;
        if (salary > 10000) {
            salary = salary + 2000;   // slary +=2000
        } else if (salary >20000){
            salary = salary + 3000;
        } else {
            salary =+1000 ;
        }

        System.out.println(salary);
    }
}
