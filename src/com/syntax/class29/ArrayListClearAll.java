package com.syntax.class29;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListClearAll {
    public static void main(String[] args) {
        ArrayList<String> strArrList2 = new ArrayList<>(15);
        strArrList2.add("Sofia");
        strArrList2.add("Ali");
        strArrList2.add("Mint");
        strArrList2.add("Tanya");
        strArrList2.add("Masha");
        System.out.println(strArrList2);
        strArrList2.clear();
        System.out.println(strArrList2);
    }
}
