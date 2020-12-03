package com.syntax.class19;

public class ClassTask1 {
    /*Write a program that will have a constructor:
    one with parameters and second without any parameters.
    Create a separate Test class where you will execute both of the constructors 1 by 1.*/

    int age;
    String name;
    String profession;

    ClassTask1(){
        System.out.println("I'm constructor without arguments");
    }

    ClassTask1(int ageValue, String nameValue, String profession){
        age = ageValue;
        name = nameValue;
        profession = profession;

    }


    public static void main(String[] args) {
        ClassTask1 task1 = new ClassTask1();

        ClassTask1 task2 = new ClassTask1(13, "Sofia", "Tester");
    }

}
