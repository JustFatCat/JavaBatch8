package com.syntax.class30;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Mango");
        linkedHashSet.add("Kiwi");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Avocado");
        linkedHashSet.add("Olives");
        System.out.println(linkedHashSet);

    }
}
