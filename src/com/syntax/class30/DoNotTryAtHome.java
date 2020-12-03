package com.syntax.class30;

import java.util.ArrayList;
import java.util.LinkedList;

public class DoNotTryAtHome {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println("Started");
        for (int i = 0; i < 100000000; i++) {
            arrayList.add(i);
        }
        System.out.println("Adding the element to array list");
        arrayList.add(0, 100);
        System.out.println("Adding the element to linked list");
        linkedList.addFirst(154);
    }
}
