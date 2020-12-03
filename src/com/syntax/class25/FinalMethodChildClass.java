package com.syntax.class25;

public class FinalMethodChildClass extends FinalMethodClass {

    @Override
    double add(double num1, double num2) {
        //super.PI = 4.5; CE cannot change a final field
        System.out.println("New code added in the child class");
        return super.add(num1, num2);
    }
   /* public void printName(){
        System.out.println("Hello world");
    }*/ //CE: cannot override a final method
}
