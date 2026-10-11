package com.collection_framework;
import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueueBasics {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        //default behaviour in case Integer -> less value=high priority -> min heap
        //max heap when (a-b)->b-a 
        pq.offer(40);
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        pq.peek();
        System.out.println(pq);
        
        
        
    }
    
}
