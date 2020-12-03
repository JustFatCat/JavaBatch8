package com.syntax.class29;

import java.util.ArrayList;
import java.util.List;

public class Arrays2 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(1045);
        arrayList.add(108);
        arrayList.add(1079);
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        arrayList.remove(3);
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        arrayList.remove(new Integer(100));
        Integer integer = 100;
        arrayList.indexOf(integer);
        arrayList.clear();
        System.out.println(arrayList);
    }
}
