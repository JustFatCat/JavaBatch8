package com.syntax.class13;

public class DogProgram {
    public static void main(String[] args) {
        Dog shepherd= new Dog();
        shepherd.numberOfLegs = 4;
        shepherd.age = 7;
        shepherd.name = "Shep";
        shepherd.color = "white";
        shepherd.breed = "Golden";
        shepherd.hasMaster = true;

        shepherd.bark();
        shepherd.play();
        shepherd.sleep();
        shepherd.sit();
    }
}
