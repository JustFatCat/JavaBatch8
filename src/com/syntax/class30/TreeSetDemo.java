package com.syntax.class30;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Mango");
        treeSet.add("Kiwi");
        treeSet.add("Apple");
        treeSet.add("Avocado");
        treeSet.add("Olives");
        System.out.println(treeSet);
    }
}
