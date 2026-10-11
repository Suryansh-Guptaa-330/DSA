package com.collection_framework;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetBasics {
    public static void main(String[] args) {

        // Set<Integer> st = new HashSet<>();
        // st.add(10);
        // st.add(20);
        // st.add(30);
        // st.add(40);
        // st.add(10);

        // System.out.println(st); // no duplicates


        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        System.out.println(set1);
       set1.retainAll(set2);
       System.out.println(set1);
       System.out.println(set2);

       System.out.println(set1.containsAll(set2));

       //.retainAll shows elements in set 1 which is also present in set2


     //hash function mei jo value hoti hai woh apni hashcode generate karti hai jo ki memory mei store hoti hai

     //if we use linkedhashset instead of hashset the order is preserved

     //treeset stores elements in ascending order
     Set<Integer> treeSet = new TreeSet<>();
     treeSet.add(1);
     treeSet.add(2);
     treeSet.add(3);
     treeSet.add(4);
     treeSet.add(1);

     System.out.println(treeSet);  


     //HashSet -> O(1)
     //LinkedHashSet -> O(n)
     //TreeSet -> O(logn)
     
    }
    
}
