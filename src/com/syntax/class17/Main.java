package com.syntax.class17;

public class Main {
    Student stud4 = new Student();//it is instance variable
    public static void main(String[] args) {
        /*Variables var1 = new Variables();
        var1.varsDemo();
        var1.varsDemo1();*/

        Student stud1 = new Student();
        stud1.name = "Qasim";
        stud1.age = 30;
        stud1.marks = 90;
        Student.numberOfStudentsEnrolled++;
        stud1.StudentRegistered();

        stud1.printInfo();

        Student stud2 = new Student();
        stud2.name = "Danilo";
        stud2.age = 30;
        stud2.marks = 95;
        Student.numberOfStudentsEnrolled++;
        stud1.StudentRegistered();

        stud2.printInfo();

        Student stud3 = new Student();
        stud3.name = "Ilia";
        stud3.age = 34;
        stud3.marks = 90;
        Student.numberOfStudentsEnrolled++;
        stud1.StudentRegistered();

        stud3.printInfo();

    }
}
