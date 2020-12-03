package com.syntax.class24;

public class VarArgs {
    void print(int ...a){//we treat it as an array
        for(int numberInArray: a){
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        VarArgs varArgs = new VarArgs();
        varArgs.print(1);
        varArgs.print(1, 2, 4);
        varArgs.print(1, 76, 98, 9, 8);
    }
}
