package com.syntax.class29;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAddAll {
    public static void main(String[] args) {
        ArrayList<String> strArrList1 = new ArrayList<>();
        strArrList1.add("Sofia");
        strArrList1.add("Ali");
        strArrList1.add("Mint");
        strArrList1.add("Tanya");
        strArrList1.add("Masha");
        System.out.println(strArrList1);

        ArrayList<String> strArrList2 = new ArrayList<>(15);
        strArrList2.add("Sofia");
        strArrList2.add("Ali");
        strArrList2.add("Mint");
        strArrList2.add("Tanya");
        strArrList2.add("Masha");

        System.out.println(strArrList2);
        strArrList1.addAll(strArrList2);
        System.out.println(strArrList2);
        strArrList1.addAll(4, strArrList2);
        Collections.sort(strArrList2);
        System.out.println(strArrList2);

        strArrList2.remove("Ali");
        System.out.println(strArrList2);
    }
}
