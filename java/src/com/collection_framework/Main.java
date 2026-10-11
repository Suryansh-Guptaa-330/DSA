package com.collection_framework;

import java.util.*;
// import java.util.ArrayList;
// import java.util.List;
// //import java.util.Collection;
// import java.util.Iterator;
// import java.util.Collections;

public class Main {
    // list or collection -> interface

    // ArrayList -> concrete class

    public static void main(String[] args) {

    //     LinkedList<Integer> list = new LinkedList<>();
    //     // List<Integer> list = new ArrayList<>();

    //     // add
    //     list.add(10);
    //     list.add(20);
    //     list.add(30);
    //     list.add(100);
    //     System.out.println(list);

    //     // remove
    //     list.remove(0);
    //     System.out.println(list);

    //     // addAll
    //     List<Integer> list2 = new LinkedList<>();
    //     list2.add(40);
    //     list2.add(50);
    //     list2.add(20);

    //     list.addAll(list2);
    //     System.out.println(list);

    //     // removeAll
    //     list.removeAll(list2);
    //     System.out.println(list);

    //     // size()
    //     System.out.println(list.size());

    //     // clear()
    //     System.out.println("Printing list2" + list2);
    //     list2.clear();
    //     System.out.println(list2.size());

    //     // iterator
    //     // i want to traverse list using iterator
    //     Iterator<Integer> iterator = list.iterator();

    //     while (iterator.hasNext()) {
    //         System.out.println("Element : " + iterator.next());
    //     }
    //     // list interface
    //     // get
    //     List<Integer> list3 = new LinkedList<>();
    //     list3.add(11);
    //     list3.add(12);
    //     list3.add(13);
    //     System.out.println(list3.get(2));

    //     // set
    //     System.out.println("Before set : " + list3);
    //     list3.set(1, 22);
    //     System.out.println("After set : " + list3);

    //     // toArray
    //     Object[] arr = list3.toArray();
    //     for (Object obj : arr) {
    //         System.out.println(obj);
    //     }

    //     // contains()
    //     System.out.println(list3.contains(100));

    //     // Collection<Integer> collection = new ArrayList<>();

    //     // sort()
    //     list.add(12);
    //     System.out.println("Print entire list " + list);
    //     Collections.sort(list);
    //     System.out.println("Sort entire list " + list);

    //     // clone
    //    // LinkedList<Integer> newList = (LinkedList<Integer>) list.clone();

    //     //System.out.println("new list = " + newList);

    //     // ensure capacity -- to boost performance
    //     ArrayList<Integer> marks = new ArrayList<>();
    //     marks.ensureCapacity(100);

    //     // isEmpty
    //  //   System.out.println(newList.isEmpty());
    //     System.out.println(marks.isEmpty());
    //     list.add(30);
    //     list.add(24);
    //     list.add(30);
    //     System.out.println(list.lastIndexOf(30));
    //     // indexOf
    //     System.out.println(list.indexOf(12));


    //     //addFirst and AddLast
    //     System.out.println("Printing original list: " + list);


    //   LinkedList<Integer> ll = new LinkedList<>();
      

    //   ll.add(10);
    //   ll.addFirst(1);
    //   ll.addLast(100);
    //   System.out.println(ll);
       
    //   //similarly remove first and removelast also getfirst 


    //  //peek
    //   System.out.println(ll.peek());
    //   //poll
    //   System.out.println(ll.poll());
    //   //peekLast
    //   System.out.println(ll.peekLast());
    //   //pollLast
    //   System.out.println(ll.pollLast());

   
      //offer()





      //STACK METHODS - push(),pop(delete first element and shown),peek(only see uppermost),search(),empty();
      Stack<Integer> st = new Stack<>();
      st.push(10);
      st.push(11);
      st.push(12);
      System.out.println(st);

      st.pop();
      System.out.println(st);

      System.out.println(st.peek());
      System.out.println(st.search(12));
      System.out.println(st.empty());

      

    }
}
 