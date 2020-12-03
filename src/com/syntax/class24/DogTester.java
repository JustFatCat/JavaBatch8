package com.syntax.class24;

import java.util.concurrent.Callable;

public class DogTester {
    public static void main(String[] args) {
        //all 4 methods can be accessed from Dog because no extra cost
        //type of box and type of objects are same
        Dog dog = new Dog();
        dog.appearance();
        dog.bark();
        dog.eat();
        dog.sleep();
        /*
         * type of box and type of object is not same, so we must pay some price. If we are trying store
         * parent in a child we will get an error or we try to store child in parent we will not be able to store
         * additional method this is the cost
         *
         * */

        dog = new Chow();
        dog.appearance();
        //dog = new Dog(); if we uncomment this we will get an error
        //if we try this Chow chow=(Chow) dog; on line 31
        dog.sleep();
        /*
        * we can extract the contents of box/variable/container
        * and we store these contents in the new box but we must follow all the rule above
        * */

        Chow chow=(Chow) dog;
        chow.special();
        chow.hunt();


            }
        };

