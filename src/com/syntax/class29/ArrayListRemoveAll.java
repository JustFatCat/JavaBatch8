package com.syntax.class29;

import java.util.ArrayList;

public class ArrayListRemoveAll {
    public static void main(String[] args) {
        ArrayList<String> strArrList1 = new ArrayList<>();
        strArrList1.add("Sofia");
        strArrList1.add("Ali");
        strArrList1.add("Mint");
        strArrList1.add("Tanya");
        strArrList1.add("Masha");
        System.out.println(strArrList1);

        strArrList1.removeAll(strArrList1);
        System.out.println(strArrList1);

    }
}
