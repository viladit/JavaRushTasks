package com.javarush.task.pro.task05.task0527;

/* 
Подготовка Кибердракона
*/

public class Solution {
    public static int[][] array = new int[5][];

    public static void main(String[] args) {
        for (int i = 0; i < 5 ; i++) {
            int length = 2*i+1;
            array[i] = new int[length];
            for (int j = 0; j < length; j++) {
                array[i][j] = i+j;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
