package com.syntax.class16;

public class Test {
    public static void main(String[] args) {
        class Main {
            String name;
            int roll_no;
        }

        Main main1= new Main();
        main1.name = "John";
        main1.roll_no = 2;
        System.out.println("Name is " + main1.name + " and roll number is " + main1.roll_no);
    }
}
