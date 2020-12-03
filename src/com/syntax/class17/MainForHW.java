package com.syntax.class17;

public class MainForHW {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.empID = 10;
        emp1.salary = 2000;

        emp1.printInfo();

        Employee emp2 = new Employee();
        emp2.empID = 11;
        emp2.salary = 1500;

        emp2.printInfo();

        Students stud1 = new Students();
        stud1.studentName = "Natasha";
        stud1.studentID = 10;
        Students.numberOFStudents++;

        Students stud2 = new Students();
        stud2.studentName = "Sonya";
        stud2.studentID = 11;
        Students.numberOFStudents++;

        Students.printNumberOfStudents();



    }
}
