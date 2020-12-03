package com.syntax.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<String> strArrList2 = new ArrayList<>(15);
        strArrList2.add("Sofia");
        strArrList2.add("Ali");
        strArrList2.add("Mint");
        strArrList2.add("Tanya");
        strArrList2.add("Masha");

        ArrayList<String> strArrList1 = new ArrayList<>();
        strArrList1.add("Sofia");
        strArrList1.add("Ali");
        strArrList1.add("Mint");
        strArrList1.add("Tanya");
        strArrList1.add("Masha");

        for (String name:strArrList1) {//using enhanced for loop
            System.out.println(name);
        }
        System.out.println("____________________");
        for (int i=0; i<strArrList1.size();i++){//using the normal for loop
            System.out.println(strArrList1.get(i));
        }
        System.out.println("____________________");
        int index=0;
        while (index<strArrList1.size()){//using while loop
            System.out.println(strArrList1.get(index));
            index++;
        }
        System.out.println("____________________");
        Iterator<String> iterator = strArrList1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
