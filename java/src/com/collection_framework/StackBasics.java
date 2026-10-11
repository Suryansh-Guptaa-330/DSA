package com.collection_framework;
import java.util.Deque;
import java.util.ArrayDeque;

public class StackBasics {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

        System.out.println(stack.peek());
        
        System.out.println(stack.isEmpty());
        
        //priority queue = jiski priority jyada voh queue se bahar nikal ke sabse pehle aa jayega
        
    }
    
}
