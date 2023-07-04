package com.javarush.task.pro.task05.task0517;

import java.util.Arrays;

/* 
Делим массив
*/

public class Solution {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    public static int[] array2;
    public static int[] array3;

    public static void main(String[] args) {
        if (array.length % 2 == 0) {
            int[] array2 = Arrays.copyOfRange(array, 0, array.length/2);
            int[] array3 = Arrays.copyOfRange(array, array.length/2, array.length);
            result[0] = Arrays.copyOfRange(array2, 0, array2.length);
            result[1] = Arrays.copyOfRange(array3, 0, array3.length);
        }
        else {
            int[] array2 = Arrays.copyOfRange(array, 0, array.length/2+1);
            int[] array3 = Arrays.copyOfRange(array, array.length/2+1, array.length);
            result[0] = Arrays.copyOfRange(array2, 0, array2.length);
            result[1] = Arrays.copyOfRange(array3, 0, array3.length);
        }


        System.out.println(array.length);
        System.out.println(Arrays.deepToString(result));
    }
}
