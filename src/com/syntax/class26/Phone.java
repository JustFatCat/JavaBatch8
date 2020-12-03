package com.syntax.class26;

public abstract class Phone {
    int brand;
    Phone(){
        System.out.println("Constructor from Phone called");
    }
    public void call(){
        System.out.println("Call can make calls");
    }
    public void text(){
        System.out.println("Call can send text");
    }
    public abstract void takePicture();
    public abstract void playMusic();
}
class Iphone extends Phone{
    Iphone(){
        System.out.println("Constructor from Iphone called");
    }
    @Override
    public void takePicture() {
        System.out.println("Can take good pictures in low light");
    }

    @Override
    public void playMusic() {
        System.out.println("Iphone can play music using Apple Store");
    }
    public void faceTime(){
        System.out.println("I have facetime for video calls");
    }
}
class Samsung extends Phone{
    Samsung(){
        System.out.println("Constructor from Samsung called");
    }

    @Override
    public void takePicture() {
        System.out.println("Can take pictures using telephoto");
    }

    @Override
    public void playMusic() {
        System.out.println("Can play music using Google music");
    }

    public void duo(){
        System.out.println("I can make video calls using Duo");
    }
}
