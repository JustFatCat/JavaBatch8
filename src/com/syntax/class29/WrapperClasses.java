package com.syntax.class29;

public class WrapperClasses {
    public static void main(String[] args) {
        //we have 8 primitive data types and for each we have wrapper class
        byte byteNumber = 100;//can store max from -128 to 127
        short shortNumber = 1000;//can store numbers from 32768 up to 65535
        int number = 10;//can store up to 2 billion
        long longNumbers = 1367567576576578L;
        double numberWithDecimalPoints = 10.5;
        char characters = 'A';
        boolean flags = true;

        String stringNumber = "10";
        int convertedNumber = Integer.parseInt(stringNumber);

        System.out.println(convertedNumber*2);
        Byte nonPrimitiveByteNumber = 100;
        Short nonPrimitiveShortNumber = 1000;//can store numbers from 32768 up to 65535
        Integer nonPrimitiveNumber = 10;//can store up to 2 billion
        Integer.parseInt("10");
        Long nonPrimitiveLongNumbers = 1367567576576578L;
        Double nonPrimitiveNumberWithDecimalPoints = 10.5;
        Character nonPrimitiveCharacters = 'A';
        Boolean nonPrimitiveFlags = true;

        int primitiveInt = 10;
        Integer nonPrimitiveInteger = primitiveInt;
        nonPrimitiveInteger.toString();
        primitiveInt = nonPrimitiveInteger;
        System.out.println(nonPrimitiveInteger.doubleValue());


    }
}
