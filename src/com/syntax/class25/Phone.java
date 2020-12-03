package com.syntax.class25;

abstract public class Phone {
    public void makeCalls(){
        System.out.println("Phone makes calls");
    }
    public void sendText(){
        System.out.println("Phone sends txt");
    }
    public abstract void viewPicture();
    public abstract void unlock();
}
abstract class Iphone extends Phone{

    @Override
    public void viewPicture() {
        System.out.println("We can check out the photos using the photos app");
    }
}
class IphoneChild extends Iphone{
    @Override
    public void unlock() {
        System.out.println("We can unlock our Iphone with face");
    }
}
class Samsung extends Phone{

    @Override
    public void viewPicture() {
        System.out.println("To view pictures use the gallery app");

    }

    @Override
    public void unlock() {
        System.out.println("Unlock using the password");

    }
}
