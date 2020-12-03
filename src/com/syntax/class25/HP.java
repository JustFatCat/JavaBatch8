package com.syntax.class25;

public class HP extends Computer {
    public HP(String type, String model, int price) {
        super(type, model, price);
    }

    @Override
    void showMovies(){
        System.out.println("Hey, I'm Dell");
    }
}
