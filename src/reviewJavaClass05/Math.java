package reviewJavaClass05;

public class Math {
    public void sum(int a, int b) {
        int s = a + b;
        System.out.println(s);//it doesn't mean that we can use this value, it's just printed
    }

    public int multiply(int a, int b){
        return a*b;
    }

    //our method must have void keyword, or return type
    //void --> it doesn't return or give us back any value
    //return type --> String, String[], Object, int ....

    //can a method return more than one value? no



}

