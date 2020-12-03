package com.syntax.class20;

public class Teacher {
    /*Write a Java program called Teacher.  Identify features and behaviour of
    that Class. Create 3 subclasses MathTeacher, ChemistryTeacher and
    PianoTeacher that would have it their own features and behaviour. Test all 4 classes*/

    public static String schoolName = "Harvard";
    public int age, salary;

    public void teach(){
        System.out.println("I'm teaching students");
    }

    public void askQ(){
        System.out.println("I'm asking Q");
    }
}
