package com.syntax.class23;

public class PrevClassTask3 {
    private void print(){
        System.out.println("I'm a private method, you can also overload me. I have no parameters");
    }
    private void print(int var){
        System.out.println("I'm a private method, you can also overload me. I have one int parameter");
    }
    private void print(String var){
        System.out.println("I'm a private method, you can also overload me. I have one String parameter");
    }

    public static void main(String[] args) {
        PrevClassTask3 prevClassTask3 = new PrevClassTask3();
        prevClassTask3.print();
        prevClassTask3.print(10);
        prevClassTask3.print("Name");
    }
}
