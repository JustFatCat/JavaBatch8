package com.syntax.class25;

public class CompTester {
    public static void main(String[] args) {
        Comp[] allCompsInSingleVar = {new Apple1("Apple"), new Lenovo1("Lenovo"), new HP1("HP")};
        for (Comp comp:allCompsInSingleVar) {
            comp.run();
            comp.storage();
            comp.transfer();
        }
        Lenovo1 lenovo1 = new Lenovo1("Lenovo");
        lenovo1.tabletMode();//unique for child class

    }

}
