package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorDemo {
    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(18.99);
        doubleArrayList.add(15.90);
        doubleArrayList.add(515.00);
        /*doubleArrayList.add(15.00);
        doubleArrayList.add(185.00);
        doubleArrayList.add(1590.00);*/
        System.out.println("Before removing");
        System.out.println(doubleArrayList);

        Iterator<Double> iterator = doubleArrayList.iterator();
        while(iterator.hasNext()){
            if(iterator.next()<20){
                iterator.remove();
            }
        }
        System.out.println("After removal");
        System.out.println(doubleArrayList);
        Iterator<Double> iterator2 = doubleArrayList.iterator();

        System.out.println(iterator.next());
        /*System.out.println(iterator.next());
        System.out.println(iterator.next());*/
    }
}
