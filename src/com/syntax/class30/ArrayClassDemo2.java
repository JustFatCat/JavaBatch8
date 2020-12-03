package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayClassDemo2 {
    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(18.99);
        doubleArrayList.add(15.90);
        doubleArrayList.add(515.00);
        doubleArrayList.add(15.00);
        doubleArrayList.add(185.00);
        doubleArrayList.add(1590.00);
        System.out.println("Before removing");

        /*for (Double singleNum: doubleArrayList) { //RuntimeException, because we are trying to perform two operations
        //at the same time
            if(singleNum<20){
                doubleArrayList.remove(singleNum);
            }
        }*/
        //unexpected result or runtime exception
        /*for (int i = 0; i < doubleArrayList.size(); i++) {
            if(doubleArrayList.get(i)<20){
                doubleArrayList.remove(doubleArrayList.get(i));
            }
        }*/
        Iterator<Double> iterator = doubleArrayList.iterator();
        while(iterator.hasNext()){
            System.out.println("Inside the loop");
            if(iterator.next()<20){
                iterator.remove();
            }
        }

        System.out.println("After removing");
        System.out.println(doubleArrayList);
    }
}
