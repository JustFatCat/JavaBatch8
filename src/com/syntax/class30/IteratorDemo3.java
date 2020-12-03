package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo3 {
    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(18.99);
        doubleArrayList.add(15.90);
        doubleArrayList.add(515.00);
        doubleArrayList.add(15.00);
        doubleArrayList.add(185.00);
        doubleArrayList.add(1590.00);
        doubleArrayList.add(1590.00);

        Iterator<Double> iterator = doubleArrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            }
        }
    }
