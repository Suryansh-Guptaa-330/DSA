package com.oops;

public class student {
  // attributes
  private int id;
  private int age;
  private String name;
 // private String gf;

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age < 100)
      this.age = age;
    return;
  }

  // default constructor attr->garbage
  public student() {
    System.out.println("default constructor called");
  }

  // Parameterised ctor
  public student(int id, int age, String name, String gf) {
    this.id = id;
    this.age = age;
    this.name = name;
  //  this.gf = gf;
    System.out.println("Student parameterised ctor called");
  }

  // copy ctor
  public student(student srcobj) { // srcobj -> A's copy
    System.out.println("Student copy ctor called");
    this.id = srcobj.id;
    this.age = srcobj.age;
    this.name = srcobj.name;
  }

  // medthods/behaviour
  public void study() {
    System.out.println(name + "is studying");
  }

  public void sleep() {
    System.out.println(name + "is sleeping");
  }

  public void bunk() {
    System.out.println(name + "bunking class");
  }

  // private void gfChatting() {
  //   System.out.println(name + "gfChatting");
  // }
}
