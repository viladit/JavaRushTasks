package com.javarush.task.pro.task05.task0526;

/* 
Атака вирусов
*/

import java.util.Arrays;

public class Solution {
    public static int[][] array = {{1, 3, 4, 5}, {324324, 3232423, 324, 2}, {634634, 345344235, 32432, 4}};

    public static void main(String[] args) {
        printArray();

        int[] bufferArray1 = array[0];
        int[] bufferArray2 = array[2];
        array[0] = bufferArray2;
        array[2] = bufferArray1;



        printArray();
    }

    public static void printArray() {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();
    }
}
