package com.syntax.class26;

public class PhoneTester {
    public static void main(String[] args) {
        //one way
        Phone iphone = new Iphone();
        iphone.takePicture();
        iphone.text();
        iphone.playMusic();
        iphone.call();

        Phone samsung = new Samsung();
        samsung.takePicture();
        samsung.text();
        samsung.playMusic();
        samsung.call();

        //another way
        Phone[] allPhones = {iphone, samsung};
        for (Phone phones:allPhones) {
            phones.takePicture();
            phones.text();
            phones.playMusic();
            phones.call();
        }

    }
}
