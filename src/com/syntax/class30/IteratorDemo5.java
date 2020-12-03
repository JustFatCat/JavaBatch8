package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo5 {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Tea");
        drinks.add("Coffee");
        drinks.add("Milk");
        drinks.add("Soda");
        drinks.add("Vodka");
        drinks.add("Lion milk");

        Iterator<String> iterator = drinks.iterator();
        while(iterator.hasNext()){
            if(iterator.next().equals("Vodka") || iterator.next().equals("Lion milk")){
                iterator.remove();
            }
        }
        System.out.println(drinks);

    }
}
