package com.syntax.class25;

class SmartMachine {
    public void smart(){
        System.out.println("I am a smart machine");
    }
}

class Comp extends SmartMachine {
    String brand;

    Comp(String brand) {
        this.brand = brand;//using this to differentiate between local and instance variable
    }

    public void run() {
        System.out.println(brand + " can run");
    }

    public void transfer() {
        System.out.println(brand + " can transfer data");
    }

    public void storage() {
        System.out.println(brand + " can store data");
    }
}
class Apple1 extends Comp{

    Apple1(String brand) {
        super(brand);
    }

    @Override
    public void run() {
        super.run();//all the functionality from parent class will be available
        System.out.println("Runs faster");//additional features
    }

    @Override
    public void storage() {
        System.out.println("Saves the data in a different way");
    }

    @Override
    public void transfer() {
        super.transfer();
    }
}

class Lenovo1 extends Comp{

    Lenovo1(String brand) {
        super(brand);
    }
    void tabletMode(){
        System.out.println(brand + " can also be used as tablet");
    }
}
class HP1 extends Comp{

    HP1(String brand) {
        super(brand);
    }
    public void secure(){
        System.out.println(brand + " provides fingerprints");
    }
}
