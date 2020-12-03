package com.syntax.class23;

public class DaniloFamilyTester {
    public static void main(String[] args) {
        DaniloParents daniloParents = new Danilo();
        daniloParents.eat();
        daniloParents.sleep();
        //byte b=(byte)130;
        daniloParents = new DaniloSister();
        daniloParents.eat();
        daniloParents.sleep();

        DaniloParents[] familyArray = new DaniloParents[2];
        familyArray[0] = new Danilo();
        familyArray[1] = new DaniloSister();

        //traditional approach

    }
}
