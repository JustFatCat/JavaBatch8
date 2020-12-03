package com.syntax.class30;

import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Tampa");
        cities.add("Las Vegas");
        cities.add("Kabul");
        cities.add("Brooklyn");
        cities.add("Tampa");
        cities.add("San Diego");

        System.out.println(cities);

        cities.addFirst("Istanbul");
        cities.addLast("Moscow");
        cities.add(5,"New Orleans");
        System.out.println(cities);
    }
}
