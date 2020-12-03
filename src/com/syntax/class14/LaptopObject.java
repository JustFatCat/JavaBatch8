package com.syntax.class14;

public class LaptopObject {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        laptop1.maker = "Mac";
        laptop1.model= "Pro16";
        laptop1.storage = 1;
        laptop1.RamCapacity = 16;
        laptop1.color = "pink";
        laptop1.processor = "Core i7";
        laptop1.GPU = "Nvidia RTX 3090 12GB DDR6x";

        laptop1.playMovies();
        laptop1.browserInternet();
        laptop1.makeVideoCall("Friend");
        String laptop1Model = laptop1.getModel();//if we want to store the result of returning
        //or if we want just print, not to store we can just do: System.out.println(laptop1.getModel());
        System.out.println(laptop1Model);
        System.out.println(laptop1.getRamCapacity());
        System.out.println(laptop1.upgradeRAM(2));

    }
}
