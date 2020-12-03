package com.syntax.class19;

public class Student {
    String name;
    double subject1, subject2, subject3;

    Student(String nameValue, double subject1Value, double subject2Value, double subject3Value){
        name = nameValue;
        this.subject1 = subject1Value;
        this.subject2 = subject2Value;
        this.subject3 = subject3Value;
    }

    void printGradeAverage(){
        double avg = (subject1 + subject2 + subject3)/3;
        System.out.println("Average marks for " + name + " are " + avg);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Marta", 93, 78, 90);
        student1.printGradeAverage();
        Student student2 = new Student("Jack", 89, 56, 88);
        student2.printGradeAverage();
        Student student3 = new Student("Natasha", 100, 98, 99);
        student3.printGradeAverage();
    }


}
