package com.syntax.class29;

public class BoxingUnBoxing {
    public static void main(String[] args) {
        Integer nonPrimitive = 10;// autoBoxing
        int primitiveInt = nonPrimitive;//autoUnBoxing

        Integer integer = new Integer(10);//boxing
        int number = integer.intValue();//unboxing
        String string = new String("Sofia");
        String string2= "Sofia";

    }
}
