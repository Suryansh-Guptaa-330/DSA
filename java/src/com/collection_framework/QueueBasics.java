package com.collection_framework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBasics {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // we use offer() instead of add() to avoid exxception handling
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println(q);

        // we use peek() instead of () to avoid exception handling
        System.out.println(q.peek());

        // we use poll() instead of remove() to avoid exception handling
        System.out.println(q.poll());

    }

}
