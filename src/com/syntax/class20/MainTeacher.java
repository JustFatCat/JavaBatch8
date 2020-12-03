package com.syntax.class20;

public class MainTeacher {
    public static void main(String[] args) {
        printDed();
    }

    public static void  printDed(){
        GrandFather emil = new GrandFather();
        emil.money= emil.money-30;
        System.out.println(emil.money);
        Father f = new Father();
        System.out.println("father:");
        System.out.println(f.money);
        f.painInTheNeck = true;
        System.out.println(f.painInTheNeck);

    }
}
