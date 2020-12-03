package reviewJavaClass05;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Recap {
    public static void main(String[] args) {
        // Array is a container --> size fixed and data type must be same

        //first way: declare and initialize at the same time
        int[] intArr = {3, 5, 7, 1, 15};

        //second way: declare first, and then assign values
        int[][] intArr1 = new int[2][3];
        intArr1[0][0] = 23;
        intArr1[0][1] = 12;
        intArr1[0][2] = 23;

        intArr1[1][0] = 5;
        intArr1[1][1] = -6;
        intArr1[1][2] = 3;

        //Lets find the sum of all values in our array
        /*int sum=0;

        for(int i=0; i<intArr1.length; i++){// in intArr1.length we will get columns
            for(int j=0; j<intArr1[i].length; j++){
                sum += intArr1[i][j];
                System.out.println(sum);
            }
        }
        System.out.println(sum);*/

        //enhanced for loop

        /*for(int[] row: intArr1){
            for(int value: row){
                System.out.print(value + " ");
            }
            System.out.println();
        }*/

        String [][][] arr3d = new String[2][2][3];
        //2 floor
        //2 apartments in each floor
        //3 rooms in each apartment
        Scanner scan = new Scanner(System.in);

        for(int i=0; i<arr3d.length; i++){

            for(int j=0; j< arr3d[i].length; j++){

                for(int z=0; z< arr3d[i][j].length; z++){
                    System.out.println("Please enter a name: ");
                    arr3d[i][j][z] = scan.nextLine();

                }
            }

        }

        for(String[][] arr2d: arr3d){
            for(String[] arr1d: arr2d){
                for(String value: arr1d){
                    System.out.print(value);
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }


}
