package com.syntax.class29;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> dynamicArray = new ArrayList<>();
        dynamicArray.add("Ali");
        System.out.println(dynamicArray.size());
        dynamicArray.add("Sofia");
        System.out.println(dynamicArray.size());
        dynamicArray.add("Ali");
        System.out.println(dynamicArray.size());
        dynamicArray.add("Maria");
        System.out.println(dynamicArray.size());
        dynamicArray.add("Mina");
        System.out.println(dynamicArray.size());
        System.out.println(dynamicArray);
    }
}
