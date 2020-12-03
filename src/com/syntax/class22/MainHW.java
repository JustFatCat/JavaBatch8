package com.syntax.class22;

import com.syntax.class05.HW;

public class MainHW {
    public static void main(String[] args) {
        HW1 rectangle = new HW1();
        System.out.println("The area of rectangle is " + rectangle.calcArea(30, 15));

        HW1 square = new HW1();
        System.out.println("The area of square is " + square.calcArea(15));

        HW1 box = new HW1();
        System.out.println("The area of the box is " + box.calcArea(10, 6, 9));

        Programming obj = new Programming();
        obj.printMessage();

        obj.printMessage("Java");


        JustClass.printSomething();
        JustClass.printSomething("Mint");
        JustClass.printSomething("Mint", 2);
    }


}
