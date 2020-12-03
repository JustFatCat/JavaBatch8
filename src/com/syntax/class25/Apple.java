package com.syntax.class25;

public class Apple extends Computer {
    public Apple(String type, String model, int price) {
        super(type, model, price);
        type = "New";
        model = "1233";
    }

    @Override
    void performOperations(){
        System.out.println("But you need to pay before, cause I'm Apple");
    }

}
