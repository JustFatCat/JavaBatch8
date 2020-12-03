package com.syntax.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(155);
        arrayList.add(188);
        arrayList.add(100);

        Iterator<Integer> iterator= arrayList.iterator();

        while (iterator.hasNext()){
                System.out.println(iterator.next());
        }

    }
}
