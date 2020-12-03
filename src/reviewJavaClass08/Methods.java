package reviewJavaClass08;

public class Methods {
    public static void main(String[] args) {
        String name = "Jack Plantin";
        //built-in methods are read-only, we cannot modify them, we can just call them
        System.out.println(name.length());
        Methods meth = new Methods();
        meth.getAndPrintLength("Jack");//non-static method call
        //if we don't write a method we have to repeat the code for all of the names
        String name1 = "Bryan";
        if(name1.length()>15){
            System.out.println("Your name is too long");
        }else{
            System.out.println("You are good to go");
        }
        String name2 = "Sofia";
        if(name2.length()>15){
            System.out.println("Your name is too long");
        }else{
            System.out.println("You are good to go");
        }
        String name3 = "Sofia Grigorieva Matchevich";
        if(name3.length()>15){
            System.out.println("Your name is too long");
        }else{
            System.out.println("You are good to go");
        }
        //but if we write a method this is how it will look like
        meth.getAndPrintLength(name1);
        meth.getAndPrintLength(name2);
        meth.getAndPrintLength(name3);
    }

    public int getAndPrintLength(String name){
        int length = name.length();
        if(length>15){
            System.out.println("Your name is too long");
        }else{
            System.out.println("You are good to go");
        }
        return length;
    }
}
