package reviewJavaClass09;

public class InstanceVarDemo {
    String name = "Mahmud";
    public static void main(String[] args) {
        String name = "Ali";
        System.out.println(name);
        InstanceVarDemo obj = new InstanceVarDemo();
        System.out.println(obj.name);
        obj.name = "Burju";
        System.out.println(obj.name);

    }
}
