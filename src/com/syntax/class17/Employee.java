package com.syntax.class17;

public class Employee {
    /*Create a Class called Employee:
    Create three  variables  empID , salary and set the CEO to “Sumair”
    Create two objects of the class Employee
    Set the value of eID, salary for each of the objects
    Print out the eID , salary and  CEO for each of the objects*/

    int empID;
    int salary;
    static String CEO = "Sumair";

    public void printInfo(){
        System.out.println("The empID is: " + empID + ". The salary is: " + salary + ". The CEO is: " + CEO);
    }
}
