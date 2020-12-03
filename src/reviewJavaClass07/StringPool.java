package reviewJavaClass07;

public class StringPool {
    public static void main(String[] args) {
        String name = "LOL";
        String name1 = "LOL";
        String name2 = new String("LOL");
        System.out.println(name==name1);//it checks only memory location not the content
        System.out.println(name.equals(name1));//it checks the content

        System.out.println(name==name2);
        System.out.println(name.equals(name2));
    }
}
