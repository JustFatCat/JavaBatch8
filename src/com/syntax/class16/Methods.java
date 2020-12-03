package com.syntax.class16;

import com.syntax.class13.Dog;

public class Methods {
    public static void main(String[] args) {
        System.out.println(addNumbers(10, 20));
        System.out.println(addNumbers(20, 20));
        System.out.println(addNumbers(40, 20));
        System.out.println(addNumbers(10, 50));
    }
    public static int addNumbers(int num1, int num2){
        return num1+num2;
    }
}
