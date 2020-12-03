package com.syntax.class19;

public class HW2AnotherWay {
    public static String reversedString(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString();
    }

}
