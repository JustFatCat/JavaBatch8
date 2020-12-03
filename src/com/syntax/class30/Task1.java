package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 50; i++) {
            numbers.add(i);
        }
        Iterator<Integer> iterator = numbers.iterator();
        while(iterator.hasNext()){
            if(iterator.next()%5==0){
                iterator.remove();
            }
        }
        System.out.println(numbers);

    }
}
