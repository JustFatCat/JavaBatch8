package reviewJavaClass05;

import java.util.Scanner;

public class ReplITStringArray {
    public static void main(String[] args) {
        //how can u change a 1D array of String in 2D array of chars
        Scanner scan = new Scanner(System.in);

        String[] strArr = new String[3];

        for (int i = 0; i < strArr.length; i++) {
            System.out.println("Enter a word: ");
            strArr[i] = scan.next();
        }

        char[][] charArr = new char[strArr.length][];
        for (int i = 0; i < strArr.length; i++) {
            charArr[i] = strArr[i].toCharArray();
        }

        /*for (char[] chr : charArr) {
            for (char ch : chr) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }*/
        System.out.println(charArr[2][4]);
        scan.close();

        //закончила 1:03
    }
}
