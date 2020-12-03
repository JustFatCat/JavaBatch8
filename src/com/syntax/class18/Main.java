package com.syntax.class18;

public class Main {
    public static void main(String[] args) {
        EmployeeAnotherVariant employee1 = new EmployeeAnotherVariant();
        employee1.empID = 123;
        employee1.salary = 2000;
        EmployeeAnotherVariant.CEO = "Samair";

        System.out.println(employee1.empID);
        System.out.println(employee1.salary);
        System.out.println(EmployeeAnotherVariant.CEO);

        EmployeeAnotherVariant employee2 = new EmployeeAnotherVariant();
        employee2.empID = 12345;
        employee2.salary = 5000;

        System.out.println(employee2.empID);
        System.out.println(employee2.salary);
        System.out.println(EmployeeAnotherVariant.CEO);

        StudentsAnotherWay stud1 = new StudentsAnotherWay();
        stud1.studentName = "Moneer";
        stud1.studentID = 123;
        StudentsAnotherWay.numberOFStudents++;
        System.out.println(stud1.studentName);
        System.out.println(stud1.studentID);
        System.out.println(StudentsAnotherWay.numberOFStudents);

        StudentsAnotherWay stud2 = new StudentsAnotherWay();
        stud2.studentName = "Sofia";
        stud2.studentID = 1234;
        StudentsAnotherWay.numberOFStudents++;
        System.out.println(stud2.studentName);
        System.out.println(stud2.studentID);
        System.out.println(StudentsAnotherWay.numberOFStudents);


    }

}
