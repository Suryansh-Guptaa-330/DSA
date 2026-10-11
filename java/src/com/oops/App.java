package com.oops;

public class App {
    public static void main(String[] args) throws Exception {
     //   System.out.println("hello world");
     // DEFAULT CTOR
     
    //     student A = new student();
    //     A.id = 1;
    //    A.age = 20;
    //    A.name="Suryansh";
    //     A.study();
    //     A.sleep();
    //     A.bunk();

    //parameterised ctor
     student A = new student(1,20,"suryansh ", "Tina");
    // System.out.println(A.id);
    // System.out.println(A.age);
    // System.out.println(A.name);
    // A.bunk();
    // A.study();
    // A.sleep();

    //copy ctor
    // student B = new student(A);
    // System.out.println(B.name);
    // System.out.println(B.age);
    // System.out.println(B.id);
    
    
    //Encapsulation
// student A = new student(1,20,"suryansh ", "Tina");
//    System.out.println(A.id);
 //   System.out.println(A.age);
 //   System.out.println(A.getName());
//    System.out.println(A.gf);
    

   System.out.println(A.getAge());
   A.setAge(220);
   System.out.println(A.getAge());
   

    // A.bunk();
    // A.study();
    // A.sleep();

    }
}
