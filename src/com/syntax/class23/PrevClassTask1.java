package com.syntax.class23;

public class PrevClassTask1 {
    public PrevClassTask1(){
        System.out.println("I love programming languages");
    }
    public PrevClassTask1(String var){
        System.out.println("I love " + var);
    }

    public static void main(String[] args) {
        PrevClassTask1 prevClassTask1 = new PrevClassTask1();
        PrevClassTask1 prevClassTask2 = new PrevClassTask1("Java");
        PrevClassTask1 prevClassTask3 = new PrevClassTask1("I love rabbits");

    }

}
