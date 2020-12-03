package com.syntax.class13;

public class SmartPhone {
    int price;
    String color;
    String size;
    String maker;
    String model;

    void call(String phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void playGames(){
        System.out.println("Let's play a mobile game");
    }
    void text(String printedMessage){
        System.out.println("Send this message: " + printedMessage);
    }
    void listenToMusic(String song){
        System.out.println("What a nice song");
    }
    public static void main(String[] args) {
        SmartPhone phone1 = new SmartPhone();
        phone1.color = "grey";
        phone1.maker = "Xiaomi";
        phone1.model = "Mi Pro";
        phone1.price = 500;
        phone1.size = "small";

        phone1.text("hello");
        phone1.call("8904000000");
        phone1.playGames();
        phone1.listenToMusic("Lalala");
    }
}
