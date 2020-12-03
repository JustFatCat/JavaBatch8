package reviewJavaClass09;

public class LocalVarDemo {
    static {

    }
    public static void main(String[] args) {
        for (int i = 0; i < 5 ; i++) {
            System.out.println(i);
            {
                //local variable limited to this block only
                int a = 10;
            }
            //System.out.println(a); CE: cannot resolve symbol because it's outside
            //the block of code
        }
        //System.out.println(i); CE: cannot resolve symbol because it's outside
        //the block of code
        print();
    }
    public static void print(){
        int a = 0;//local variable
        System.out.println(a);
    }
}
