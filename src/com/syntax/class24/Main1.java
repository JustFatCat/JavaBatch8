package com.syntax.class24;

public class Main1 {
    String spaceOut(String s){
        String result = "";
        for(int i=0; i<s.length(); i++){
            result += s.charAt(i) + " ";
        }
        return result;
    }
    public static void main(String[] args){
        Main1 obj = new Main1();
        System.out.println(obj.spaceOut("hello"));
    }
}
