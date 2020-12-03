package reviewJavaClass04;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[][] a = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };

        int[] nums = new int[4];
        for(int row=0; row<a.length; row++){
            for(int col=0; col<a[row].length; col++){
                nums[row] += a[row][col];
                System.out.println(nums[row]);
            }
        }

    }

        }



