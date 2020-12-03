package com.syntax.class20;

public class Person {
    String name, address, id, phone, SSN, education;
    char gender, martialStatus;
    double height, weight, salary;
    int age, numberOfKids;
    //if I have 100 fields in the class and 100 lines of code that I want to execute every time is creating an object of my class

    Person(){
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.martialStatus=martialStatus;
        this.numberOfKids=numberOfKids;
        this.weight=weight;
        System.out.println("I am the first constructor");

    }

    Person(String name, int age, String phone, double salary, char martialStatus, int numberOfKids){
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.martialStatus=martialStatus;
        //this();
        this.numberOfKids=numberOfKids;

    }

    Person(String name, int age, String phone, double salary, char martialStatus, int numberOfKids, String education){

    }

    Person(String name, int age, String phone, double salary, char martialStatus, int numberOfKids, String education, double height, double weight){

    }

    public static void main(String[] args) {
        Person person1 = new Person("Sonya", 33, "9898989898", 1000, 'M', 0, "SDET");

        Person person2 = new Person("Sonya", 33, "9898989898", 1000, 'M', 0);

    }

}
