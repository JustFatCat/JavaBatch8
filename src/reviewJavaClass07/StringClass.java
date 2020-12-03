package reviewJavaClass07;

public class StringClass {
    public static void main(String[] args) {
        String str = "Danilo";
        String str2 = new String("Mohammad");//another way of creating String, we created
        //an array of chars
        System.out.println(str2);

        //returns the number of characters in the String variable including spaces
        System.out.println(str2.length());
        System.out.println(str.length());

        String name = "Mina123";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        String newString = str.concat(name);
        System.out.println(newString);
        System.out.println(str+name);
        //always prefer the plus sign (+) to combine two strings
        //why? because we can get an error in some cases when using the concat method
        String var1 = null;
        String var3 = new String();
        var3 = null;
        String var2 = "Burju";
        //System.out.println(var1.concat(var2)); Error NullPointerException
        //System.out.println(var2.concat(var1)); Error NullPointerException
        System.out.println(var1 + var2);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("anything");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("anything");

    }
}
