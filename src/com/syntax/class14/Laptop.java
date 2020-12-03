package com.syntax.class14;

public class Laptop {
    String maker;
    String model;
    int storage;
    int RamCapacity;
    String color;
    String processor;
    String GPU;

    void playMovies(){
        System.out.println("Playing movies");
    }
    void browserInternet(){
        System.out.println("Browse the Internet");
    }
    void makeVideoCall(String contact){
        System.out.println("Video calling to " + contact);
    }

    String getModel() {
        return "Hi";
    }

    int getRamCapacity(){
        return RamCapacity*2;
    }

    int upgradeRAM(int newRamUnit){
        return newRamUnit*RamCapacity;

    }
}
