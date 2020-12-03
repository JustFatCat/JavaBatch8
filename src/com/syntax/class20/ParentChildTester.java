package com.syntax.class20;

public class ParentChildTester {

    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.printSomething();

        Child1 child = new Child1();
        child.printSomething();
        child.differentPrintMethod();

    }
}
