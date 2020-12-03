package com.syntax.class20;

public class B extends C{
    public void myOwnMethB(){
        System.out.println("I was inherited by C");
    }

    public static void main(String[] args) {
        A.printF();
    }
}
