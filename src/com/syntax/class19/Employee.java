package com.syntax.class19;

public class Employee {

    int age;
    String name;
    char grade;

    Employee(){
        System.out.println("I will be called everytime you create an object of this class");
    }

    Employee(int ageValue, String nameValue, char characterValue){
        System.out.println("I am initializing your fields");

        if(ageValue>60 || ageValue<18){
            System.out.println("You should not be working");
        }else{
            age = ageValue;
        }

        if(nameValue.length()>25){
            System.out.println("Please use short names like Aladin");
        }else {
            name = nameValue;
            grade = characterValue;
        }
    }

    void print(){
        System.out.println("Number " + age + " name " + name + " character " + grade);
    }

    public static void main(String[] args) {
        Employee employees = new Employee();
        employees.age = 200;
        employees.name = "Davit";

        Employee constructors2 = new Employee(50, "Vlad", 'A');

        //constructors.print();
        //Constructors - it's class
        //constructors - name of the instance
        //= assignment
        //new - we want an object
        //Constructors() - constructor

        /*int num;
        System.out.println(num);*/

    }
}
