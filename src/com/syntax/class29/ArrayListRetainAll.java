package com.syntax.class29;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRetainAll {
    public static void main(String[] args) {
        ArrayList<String> strArrList1 = new ArrayList<>();
        strArrList1.add("Sofia");
        strArrList1.add("Ali");
        strArrList1.add("Mint");
        strArrList1.add("Tanya");
        strArrList1.add("Masha");

        System.out.println(strArrList1);

        ArrayList<String> strArrList2 = new ArrayList<>();
        strArrList2.add("Sofia2");
        strArrList2.add("Ali2");
        strArrList2.add("Mint2");
        strArrList2.add("Tanya2");
        strArrList2.add("Masha2");

        System.out.println(strArrList2);
        strArrList2.retainAll(strArrList1);
        System.out.println(strArrList2);

        int[] arr = new int[2];
        arr[0] = 10;
        arr[1] = 20;
        System.out.println(Arrays.toString(arr));
        arr[0] = 20;
        System.out.println(Arrays.toString(arr));
    }
}
