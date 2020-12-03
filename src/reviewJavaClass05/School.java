package reviewJavaClass05;

public class School {
    //instance variables
    //local variables
    //static variables

    //instance variables are created inside classes, but outside of any methods
    //States/attributes of our objects
    //values are different for each object of the classes

    String name, lastName;
    int age;
    private String id;

    //static variable defines the class
    //value the same for all objects
    //we do not need to create an object to access static variables
    //can it be accessible by using class name? yes

    static String schoolName;

    //local variable --> local inside where it is created
    //they are created inside a method or a block of code

    //Access modifiers --> public, protected, default, private

    //can we use access modifiers with local variables? NOOOOO!
    //with instance variables --> Yes!
    //with static variables --> Yes!

    //What kind of methods we have --> 1. Built-in 2. User defined methods

    public void printDetails(){
        System.out.println("Name and lastname " + name + " " + lastName);
        System.out.println("Age: " + age);
    }

    public void study(int hour) {
        System.out.println(name + " " + lastName + " studies " + hour + " hours a day.");
    }

    public static void goToSchool(){
        System.out.println("Students go to " + schoolName);
    }

    //public --> same class +, same package +, different package +,
    //private
    //protected
    //default


}
