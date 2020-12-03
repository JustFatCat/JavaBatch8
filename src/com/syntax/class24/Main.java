package com.syntax.class24;

public class Main {
    public int year, batch;
    static String schoolName = "Syntax";

    public static void main(String[] args) {
        Main stud1 = new Main();
        stud1.year = 2020;
        stud1.batch = 8;
        System.out.println("I am student of batch " + stud1.batch + " studying at " + schoolName + " in the year of " + stud1.year);
    }
}