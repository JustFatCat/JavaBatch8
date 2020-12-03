package reviewJavaClass09;

class Dog{
    //default values
    String name;//null
    int age;//0
    double weight, height;//0.0
    boolean isAggressive;//false

    void printProperties(){
        System.out.println("Name " + name + ". Age " + age + ". Weight " + weight + ". isAggressive " + isAggressive);
    }
}
public class InstanceVarDemo2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Bobby";
        dog1.age = 20;
        dog1.weight = 20.5;
        dog1.isAggressive = true;
        dog1.printProperties();

        Dog dog2 = new Dog();
        dog1.name = "Spanky";
        dog1.age = 10;
        dog1.weight = 5.5;
        dog1.isAggressive = false;
        dog1.printProperties();

        Dog dog3 = new Dog();
        dog1.name = "Jerry";
        dog1.age = 14;
        dog1.weight = 5.6;
        dog1.isAggressive = true;
        dog1.printProperties();



    }
}

