package reviewJavaClass07;

public class StringClass2 {
    public static void main(String[] args) {
        String empty = "";
        String empty1 = " ";
        String empty2 = "something";
        //checks is a String is empty or not
        System.out.println(empty.isEmpty());
        System.out.println(empty1.isEmpty());
        System.out.println(empty2.isEmpty());

        String name = "          Marta    ";
        //String name1 = null; will be exception
        System.out.println(name.trim());

        String var4 = "Can you please write that down";
        int intSize = 10;
        long longSize = 10;
        System.out.println(Integer.MAX_VALUE);
        String maxCharacter = new String("Ali");

        double[] array = new double[intSize];
    }
}
