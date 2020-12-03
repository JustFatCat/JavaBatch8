package com.syntax.class22;

public class MethodOverloading {
    public void print(){
        System.out.println("Print with no arguments");
    }
    public void print(String name, int number){
        System.out.println("Print String name, int number with arguments");
    }
    public void print(int number, String name){
        System.out.println("Print int number, String name with arguments");
    }

    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.print();
        methodOverloading.print("Sofia",123);
        methodOverloading.print(123, "Sonya");
    }
}
