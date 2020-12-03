package com.syntax.class29;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> strArrList = new ArrayList<>();
        strArrList.add("Sofia");
        strArrList.add("Ali");
        strArrList.add("Mint");
        strArrList.add("Tanya");
        strArrList.add("Masha");
        System.out.println(strArrList.isEmpty());//check if it is empty
        System.out.println(strArrList.contains("Ali"));
        System.out.println(strArrList.size());
        System.out.println(strArrList);

    }
}
