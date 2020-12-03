package com.syntax.class25;

public class Computer {
    String type, model;
    int price;

    public Computer(String type, String model, int price) {
        this.type = type;
        this.model = model;
        this.price = price;
    }

    void performOperations(){
        System.out.println("Hi, I can perform operations");
    }
    void showMovies(){
        System.out.println("Hi, I can show movies");
    }
}
