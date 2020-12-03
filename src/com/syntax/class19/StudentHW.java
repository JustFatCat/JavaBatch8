package com.syntax.class19;

public class StudentHW {
    String name, address;

    StudentHW(String nameValue, String addressValue){
        name = nameValue;
        address = addressValue;
    }
    public void displayInfo(){
        System.out.println("Name is " + name + ". Address is " + address + ".");
    }

    public static void main(String[] args) {
        StudentHW studentHW1 = new StudentHW("Sofia", "Russia");
        studentHW1.displayInfo();
    }

}
