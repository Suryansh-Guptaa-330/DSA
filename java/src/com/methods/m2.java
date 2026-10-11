package com.methods;
//call by value
public class m2 {
    static void solve(int num){
        System.out.println("inside solve:" + num);
        num = num*10;
        System.out.println("inside solve after updation:" + num);;
    }
    public static void main(String[] args) {
        int num=5;
        System.out.println("before calling:"+num);
        solve(num);
        System.out.println("after calling:"+num);
    }
}

