package com.syntax.class22;

public class HWClass {
    private int sum;
    private int printResult(int a, int b){
        return sum = a + b;
    }
    private int printResult(int a, int b, int c){
        return sum = a + b + c;
    }
    private int printResult(int a, int b, int c, int i){
        return sum = a + b + c + i;
    }

    public static void main(String[] args) {
        HWClass obj1 = new HWClass();
        obj1.printResult(14,45);
        obj1.printResult(15, 7, 3);
        obj1.printResult(1,1, 17, 1);
        System.out.println(obj1.sum);
    }
}
