package com.syntax.class27;

public class ChildClassTester {
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.printInfo();

        MyInterface myInterface = new ChildClass();
        myInterface.printInfo();

        //MyInterface.name = "jhjhjk"; fields can not be reassigned, because they are always final
    }
}
