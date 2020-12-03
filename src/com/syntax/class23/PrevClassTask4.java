package com.syntax.class23;

public class PrevClassTask4 {
    double getResult(double len){
        return len;
    }
    double getResult(double len, double width){
        return len*width;
    }
    double getResult(double len, double width, double height){
        return len*width*height;
    }

    public static void main(String[] args) {
        PrevClassTask4 prevClassTask4 = new PrevClassTask4();
        System.out.println("Area of a square " + prevClassTask4.getResult(15));
        System.out.println("Area of a req " + prevClassTask4.getResult(15, 10));
    }

}
