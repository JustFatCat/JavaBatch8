package com.syntax.class20;

public class Child extends Father{
    public static void main(String[] args) {
        Child child = new Child();
        child.money = 10;
        child.property = "house";
        System.out.println(child.property);
        child.printF();
    }
}
