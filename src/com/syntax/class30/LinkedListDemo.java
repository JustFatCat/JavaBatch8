package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Tampa");
        cities.add("Las Vegas");
        cities.add("Kabul");
        cities.add("Brooklyn");
        cities.add("Tampa");
        cities.add("San Diego");
        System.out.println(cities);


        Iterator<String> iterator = cities.iterator();
        //cities.removeIf(s -> s.endsWith("a")); another variant
        while (iterator.hasNext()){
            if(iterator.next().endsWith("a")){
                iterator.remove();
            }
        }
        System.out.println(cities);
    }
}
