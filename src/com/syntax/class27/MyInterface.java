package com.syntax.class27;

public interface MyInterface {
    //before Java 8
    public static final String name = "hi";
    void printInfo();


    //Java 8
    static void printNumber(){

    }
    default  void printName(){
        //these default are used to support lambdas
    }
}
