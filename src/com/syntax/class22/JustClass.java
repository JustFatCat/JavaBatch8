package com.syntax.class22;

public class JustClass {
    String name;
    int age;
    public static void printSomething(){
        System.out.println("Hi!");
    }
    public static void printSomething(String name){
        System.out.println("My name is " + name + " and I'm a cat");
    }
    public static void printSomething(String name, int age){
        System.out.println("My name is " + name + " and I'm a cat " + age + " years old");
    }
}
